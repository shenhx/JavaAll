package com.example.es.esdemo;

import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.action.update.UpdateRequest;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.RangeQueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.StreamCorruptedException;
import java.util.*;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
@RestController
public class EsDemoApplication {

    @Autowired
    private TransportClient client;

    /**
     * 默认入口函数
     *
     * @return
     */
    @GetMapping("/")
    public String index() {
        return "index";
    }

    /**
     * 根据小说ID字段查询小说信息
     *
     * @param id 小说ID
     * @return 查询成功并且有数据返回查询结果和200状态码，失败等返回404
     */
    @GetMapping("/get/book/novel")
    @ResponseBody
    public ResponseEntity get(@RequestParam(name = "id", defaultValue = "") String id) {
        if (id.isEmpty()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }

        GetResponse result = this.client.prepareGet("book", "novel", id)
                .get();
        if (!result.isExists()) {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(result.getSource(), HttpStatus.OK);
    }

    /**
     * 增加小说接口
     *
     * @param title       标题
     * @param author      作者
     * @param wordCound   字数
     * @param publishDate 发布日期
     * @return
     */
    @PutMapping("/add/book/novel")
    @ResponseBody
    public ResponseEntity add(
            @RequestParam(name = "title") String title,
            @RequestParam(name = "author") String author,
            @RequestParam(name = "word_count") int wordCound,
            @RequestParam(name = "publish_date")
            @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
                    Date publishDate) {
        try {
            XContentBuilder content = XContentFactory.jsonBuilder().startObject()
                    .field("title", title)
                    .field("author", author)
                    .field("word_count", wordCound)
                    .field("publish_date", publishDate.getTime())
                    .endObject();

            IndexResponse result = this.client.prepareIndex("book", "novel")
                    .setSource(content)
                    .get();
            return new ResponseEntity(result.getId(), HttpStatus.OK);

        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    /**
     * 删除小说
     *
     * @param id
     * @return
     */
    @DeleteMapping("/delete/book/novel")
    @ResponseBody
    public ResponseEntity delete(@RequestParam(name = "id") String id) {
        DeleteResponse result = this.client.prepareDelete("book", "novel", id).get();
        return new ResponseEntity(result.getResult().toString(), HttpStatus.OK);
    }

    /**
     * 更新小说接口
     * @param id
     * @param title
     * @param author
     * @return
     */
    @PutMapping("/update/book/novel")
    @ResponseBody
    public ResponseEntity update(
            @RequestParam(name = "id") String id,
            @RequestParam(name = "title", required = false) String title,
            @RequestParam(name = "author", required = false) String author) {
        UpdateRequest update = new UpdateRequest("book","novel",id);

        try {
            XContentBuilder builder = XContentFactory.jsonBuilder().startObject();
            if(title != null){
                builder.field("title",title);
            }
            if(author != null){
                builder.field("author",author);
            }
            builder.endObject();
            update.doc(builder);
        } catch (IOException e) {
            e.printStackTrace();
            return  new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        try {
            UpdateResponse result = this.client.update(update).get();
            return  new ResponseEntity(result.getResult().toString(),HttpStatus.OK);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return  new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        } catch (ExecutionException e) {
            e.printStackTrace();
            return  new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("query/book/novel")
    @ResponseBody
    public  ResponseEntity query(
            @RequestParam(name = "author",required = false) String author,
            @RequestParam(name = "title",required = false)String title,
            @RequestParam(name = "gt_word_count",defaultValue = "0") int gtWordCount,
            @RequestParam(name = "lt_word_count",required = false) Integer ltWordCount){
        BoolQueryBuilder boolQueryBuilder = QueryBuilders.boolQuery();

        if(author != null){
            boolQueryBuilder.must(QueryBuilders.matchQuery("author",author));
        }
        if(author != null){
            boolQueryBuilder.must(QueryBuilders.matchQuery("author",author));
        }
        RangeQueryBuilder rangeQueryBuilder = QueryBuilders.rangeQuery("word_count")
                .from(gtWordCount);
        if(ltWordCount != null && ltWordCount > 0){
            rangeQueryBuilder.to(ltWordCount);
        }
        boolQueryBuilder.filter(rangeQueryBuilder);
        SearchRequestBuilder builder = this.client.prepareSearch("book").setTypes("novel")
                .setSearchType(SearchType.QUERY_THEN_FETCH)
                .setQuery(boolQueryBuilder)
                .setFrom(0)
                .setSize(100);

        SearchResponse response = builder.get();
        List<Map<String,Object>> result = new ArrayList<Map<String,Object>>();
        for (SearchHit hit : response.getHits()){
            result.add(hit.getSource());
        }
        return new ResponseEntity(result,HttpStatus.OK);
    }

    public static void main(String[] args) {
        SpringApplication.run(EsDemoApplication.class, args);
    }
}
