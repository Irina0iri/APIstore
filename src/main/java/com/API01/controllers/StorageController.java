package com.API01.controllers;

import com.API01.dto.ProductAddToDataBaseDTO;
import com.API01.model.Product;
import com.API01.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/store")
public class StorageController {
    @Autowired
    ProductService _productService;

    @PostMapping("/addProduct")
    public ResponseEntity<?> addProduct(@RequestBody ProductAddToDataBaseDTO productAddDTO) {
        return _productService.addProductToStorage(productAddDTO);
    }
    @GetMapping("/allProducts")
    public List <Product> availableProducts(){
        return _productService.productList();
    }

}
