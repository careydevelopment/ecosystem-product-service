package com.careydevelopment.ecosystem.product.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.careydevelopment.ecosystem.product.model.Product;


@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    public List<Product> findAllByOrderByNameAsc();
}
