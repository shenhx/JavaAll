package com.test.chapter1.injection.service;

import com.chapter1.ioc.injection.service.ChapterOneService;
import com.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/4/23 0023.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class ChapterOneServiceImplTest extends UnitTestBase {

    @Test
    public void testSay() {
        ChapterOneService chapterOneService = super.getBean("ChapterOneService");
        chapterOneService.say("this is my test message!");
    }
}
