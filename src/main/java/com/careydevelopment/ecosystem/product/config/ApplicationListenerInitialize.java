package com.careydevelopment.ecosystem.product.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.careydevelopment.ecosystem.product.model.LineOfBusiness;
import com.careydevelopment.ecosystem.product.model.Product;
import com.careydevelopment.ecosystem.product.repository.LineOfBusinessRepository;
import com.careydevelopment.ecosystem.product.repository.ProductRepository;

import us.careydevelopment.model.products.CurrencyType;
import us.careydevelopment.model.products.Price;
import us.careydevelopment.model.products.PriceType;
import us.careydevelopment.model.products.ProductType;
import us.careydevelopment.model.products.UnitType;

@Component
public class ApplicationListenerInitialize implements ApplicationListener<ApplicationReadyEvent>  {
    
    
    private String data = "";

    @Autowired
    private LineOfBusinessRepository lobRepo;
    
    @Autowired
    private ProductRepository productRepo;
    
    public void onApplicationEvent(ApplicationReadyEvent event) {

    }
    
    
    private LineOfBusiness lob(List<LineOfBusiness> lobs, String name) {
        LineOfBusiness lob = lobs.stream().filter(l -> l.getCode().equals(name)).findFirst().get();        
        return lob;
    }
         
}