package com.chapter1.ioc.injection.dao;

/**
 * Created by Administrator on 2017/4/23 0023.
 */
public class ChapterOneDAOImpl implements ChapterOneDAO{

    public void say(String arg) {
        System.out.println("ChapterOneDAOImpl输出：" + arg);
    }
}
