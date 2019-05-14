package com.example.servicefeign.api.hystric;

import com.example.servicefeign.api.ServiceHiFeignApi;
import org.springframework.stereotype.Component;

@Component
public class ServiceHiFeignHystrix implements ServiceHiFeignApi {
    @Override
    public String sayHiFromClientOne(String name) {
        System.out.println("ServiceHiFeignHystrix 熔断!");
        return "sorry "+name;
    }
}
