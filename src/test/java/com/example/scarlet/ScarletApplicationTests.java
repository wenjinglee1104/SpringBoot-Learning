package com.example.scarlet;

import com.example.scarlet.service.BlogProperties;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class ScarletApplicationTests {

    private static final Log log = LogFactory.getLog(ScarletApplicationTests.class);

    @Autowired
    private BlogProperties blogProperties;


    @Test
    void getHello() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "myBlog");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot Tutorial");
        Assert.assertEquals(blogProperties.getDesc(), "myBlog is created by Spring Boot Tutorial");

        log.info("随机数测试输出");
        log.info("随机字符串测试输出" + blogProperties.getValue());
        log.info("随机int测试输出" + blogProperties.getNumber());
        log.info("随机long测试输出" + blogProperties.getBignumber());
        log.info("随机test1测试输出" + blogProperties.getTest1());
        log.info("随机test2测试输出" + blogProperties.getTest2());


    }

}
