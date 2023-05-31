package com.example.demo2;

import com.example.demo2.models.service.IService;
import com.example.demo2.models.service.myService;
import com.example.demo2.models.service.myServiceComplex;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration

public class appConfig {

    @Bean("mySimpleService")
    @Primary
    public IService mySimpleService(){
        return new myService();

}
    @Bean("myComplexService")
    public IService myComplexService() {
        return new myServiceComplex();
    }
}
