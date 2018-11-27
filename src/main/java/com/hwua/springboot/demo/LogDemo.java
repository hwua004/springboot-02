package com.hwua.springboot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {



    public static void main(String[] args) {
        Logger logger= LoggerFactory.getLogger(LogDemo.class);
        logger.trace("trace级别的日志");
        logger.debug("debug级别的日志");
        logger.info("info级别的日志");
        logger.warn("warn级别的日志");
        logger.error("error级别的日志");
    }

}
