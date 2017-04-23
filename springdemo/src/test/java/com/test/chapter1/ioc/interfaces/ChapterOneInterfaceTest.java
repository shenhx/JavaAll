package com.test.chapter1.ioc.interfaces;

import com.chapter1.ioc.interfaces.ChapterOneInterface;
import com.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/4/23 0023.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ChapterOneInterfaceTest extends UnitTestBase{

    public ChapterOneInterfaceTest() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void testSay() {
        ChapterOneInterface chapterOneInterface = super.getBean("ChapterOneInterface");
        chapterOneInterface.say("This is a test.");
    }
}
