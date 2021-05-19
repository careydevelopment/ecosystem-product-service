package com.careydevelopment.ecosystem.product.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.careydevelopment.ecosystem.product.model.Product;
import com.careydevelopment.ecosystem.product.repository.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    private static final Logger LOG = LoggerFactory.getLogger(ProductController.class);
        
    
    @Autowired
    private ProductRepository productRepository;
    

    @GetMapping("")
    public ResponseEntity<?> fetchAllProducts() {
        List<Product> products = productRepository.findAllByOrderByNameAsc();
        return ResponseEntity.ok(products);
    }
    
    
    @GetMapping("/{id}")
    public ResponseEntity<?> fetchProductById(@PathVariable String id) {
        LOG.debug("Fetching product " + id);
       
        Optional<Product> productOpt = productRepository.findById(id);
        if (productOpt.isPresent()) {
            Product product = productOpt.get();
            
            LOG.debug("Returning product " + product);
            
            return ResponseEntity.status(HttpStatus.OK).body(product);   
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Could not find product " + id);
        }        
    }

}
