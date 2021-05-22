package com.careydevelopment.ecosystem.product.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import us.careydevelopment.ecosystem.jwt.config.WebConfigurer;

@Configuration
public class ProductWebConfigurer extends WebConfigurer {

    public ProductWebConfigurer(@Value("${ip.whitelist}") String[] ipWhitelist, @Value("${private.ip}") String privateIp) {
        this.ipWhitelist = ipWhitelist;
        this.privateIp = privateIp;
    }
}
