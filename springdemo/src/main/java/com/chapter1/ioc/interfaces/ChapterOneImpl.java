package com.chapter1.ioc.interfaces;

/**
 * Created by Administrator on 2017/4/23 0023.
 */
public class ChapterOneImpl implements ChapterOneInterface {
    public void say(String arg) {
        System.out.println("ServiceImpl say: " + arg);
    }
}
