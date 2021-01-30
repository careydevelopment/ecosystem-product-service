package com.careydevelopment.ecosystem.product.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.careydevelopment.ecosystem.product.repository.LineOfBusinessRepository;
import com.careydevelopment.ecosystem.product.repository.ProductRepository;

@Component
public class ApplicationListenerInitialize implements ApplicationListener<ApplicationReadyEvent>  {
    
    
    private String data = "";

    @Autowired
    private LineOfBusinessRepository lobRepo;
    
    @Autowired
    private ProductRepository productRepo;
    
    public void onApplicationEvent(ApplicationReadyEvent event) {
    }
         
}