package com.chapter1.ioc.injection.service;

import com.chapter1.ioc.injection.dao.ChapterOneDAO;

/**
 * Created by Administrator on 2017/4/23 0023.
 */
public class ChapterOneServiceImpl implements ChapterOneService {

    /*public ChapterOneServiceImpl(ChapterOneDAO chapterOneDAO){
        this.chapterOneDAO = chapterOneDAO;
    }*/

    public ChapterOneDAO chapterOneDAO;

    //属性注入
    public void setChapterOneDAO(ChapterOneDAO chapterOneDAO) {
        this.chapterOneDAO = chapterOneDAO;
    }

    public void say(String arg) {
        String serviceArg = "ChapterOneServiceImpl输出：" + arg;
        chapterOneDAO.say(serviceArg);
    }
}
