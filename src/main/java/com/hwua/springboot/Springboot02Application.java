package com.hwua.springboot;

import com.hwua.springboot.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot02Application {

    @Bean
    @ConfigurationProperties(prefix = "person")
    public Person person(){
        return new Person();
    }


    public static void main(String[] args) {
        SpringApplication.run(Springboot02Application.class, args);
    }
}
