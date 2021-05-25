package com.careydevelopment.ecosystem.product.model;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import us.careydevelopment.model.products.BaseProduct;

@Document(collection = "#{@environment.getProperty('mongo.product.collection')}")
public class Product extends BaseProduct<String> {

    @Id
    private String id;
    
    @NotNull(message = "Please include a product line of business")
    private LineOfBusiness lineOfBusiness;
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LineOfBusiness getLineOfBusiness() {
        return lineOfBusiness;
    }

    public void setLineOfBusiness(LineOfBusiness lineOfBusiness) {
        this.lineOfBusiness = lineOfBusiness;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
