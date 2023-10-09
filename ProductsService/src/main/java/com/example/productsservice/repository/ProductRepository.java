package com.example.productsservice.repository;

import com.example.productsservice.enitity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
