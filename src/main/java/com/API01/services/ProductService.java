package com.API01.services;

import com.API01.dto.ProductAddToDataBaseDTO;
import com.API01.model.Product;
import com.API01.repos.ProductsRepo;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
@Data
@Slf4j
public class ProductService {
    @Autowired
    ProductsRepo _productRepo;

    public ResponseEntity<?> addProductToStorage (@RequestBody ProductAddToDataBaseDTO productDTO){
        Product product = new Product(productDTO.getCode(),productDTO.getName(),productDTO.getPrice(),productDTO.getDescription());
        _productRepo.save(product);
        return ResponseEntity.ok("product in storage");
    }

    public List<Product> productList(){
        return new ArrayList<>(_productRepo.findAll());
    }

}
