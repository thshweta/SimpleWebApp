package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.repository.ProductRepo;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
@Service
public class ProductService {

     @Autowired
     ProductRepo repo;

     public List<Product> getProducts() {
          return repo.findAll();
     }

     public Product getProductById(int productId) {

          return repo.findById(productId)
                  .orElse(new Product(0,"no item found",0));
     }

     public void addProduct(Product product){
          repo.save(product); //if the data is there it will update and if not then create
     }

     public void updateProduct(Product product) {
          repo.save(product);
     }

     public void deleteProduct(int productId) {
          repo.deleteById(productId);

     }

}
