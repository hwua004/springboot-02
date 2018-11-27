package com.hwua.springboot;

import com.hwua.springboot.demo.LogDemo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02ApplicationTests {

    @Test
    public void contextLoads() {

        Logger logger= LoggerFactory.getLogger(LogDemo.class);
        // trace < debug  < info < warn < error
        logger.trace("trace级别的日志");
        logger.debug("debug级别的日志");
        logger.info("info级别的日志");
        logger.warn("warn级别的日志");
        logger.error("error级别的日志");

    }

}
