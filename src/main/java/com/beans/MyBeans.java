package com.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyBeans {

    @Bean
    public MyBean getMyBean(){
        return new MyBean();
    }
}

