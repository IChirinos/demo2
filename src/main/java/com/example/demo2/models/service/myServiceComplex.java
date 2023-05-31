package com.example.demo2.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;



// se coloca si deseas que sea el principal a coger si es que hay mas de 2 services con un solo nombre

@Component("myComplexService")
public class myServiceComplex implements IService{

    @Override
    public String operation() {
        return ("ejecutando algun proceso importante complicamente.....");
    }
}
