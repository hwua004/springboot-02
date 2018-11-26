package com.hwua.springboot.controller;

import com.hwua.springboot.config.DBConfig;
import com.hwua.springboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@PropertySource("classpath:jdbc.properties")
public class HelloController {
    @Autowired
    private Person person;

    @Value("${jdbc.driver}")
    private String driver;
    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;



    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        System.out.println(person);
        /*System.out.println(password);
        System.out.println(url);
        System.out.println(driver);*/
        return "HelloWorld";
    }

}
