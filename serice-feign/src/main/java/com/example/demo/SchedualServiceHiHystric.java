package com.example.demo;

import org.springframework.stereotype.Component;

/**
 * Created by admin on 2018/11/29.
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
