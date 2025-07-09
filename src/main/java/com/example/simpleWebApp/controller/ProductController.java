package com.example.simpleWebApp.controller;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

 //   @RequestMapping("/products")
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

   @GetMapping("/product/{productId}")
   public Product getProductById(@PathVariable int productId){
        return service.getProductById(productId);
   }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        service.updateProduct(product);
    }

     @DeleteMapping("/product/{productId}")
    public void deleteProduct(@PathVariable int productId){
       service.deleteProduct(productId);
    }

}
