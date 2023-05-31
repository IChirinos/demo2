package com.example.demo2.models.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Primary
@Component("mySimpleService")

public class myService implements IService{


    @Override
    public String operation() {
        return ("ejecutando algun proceso importante simple.....");
    }
}
