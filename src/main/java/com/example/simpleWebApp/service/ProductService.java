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

    /*  For hard-coded vlues or when we aren't using database*/
     /*List<Product> products = new ArrayList<>( Arrays.asList(new Product(101, "iPhone",50000 ),
            new Product(102, "Canon Camera",70000 ),
            new Product(103, "Shure Mic",10000 ))
     );*/

     @Autowired
     ProductRepo repo;

     public List<Product> getProducts() {
          return repo.findAll();
     }

     public Product getProductById(int productId) {
          //we'll use Stream API for hard coded values
         /* return products.stream()
                  .filter(p -> p.getProductId() == productId)
                  .findFirst().orElse(new Product(100,"No item",0));*/

          return repo.findById(productId)
                  .orElse(new Product(0,"no item found",0));
     }


     public void addProduct(Product product){
        //  products.add(product); //product is getting add in JSON format by the postman(API tool)

          repo.save(product);
     }



     public void updateProduct(Product product) {
         /* int index = 0;
          for(int i=0; i< products.size(); i++)
               if(products.get(i).getProductId()==product.getProductId())
                    index = i;

          products.set(index, product);*/

          repo.save(product);
     }



     public void deleteProduct(int productId) {
         /* int index = 0;                       //not correct way to write(repeating code)
          for(int i=0; i< products.size(); i++)
               if(products.get(i).getProductId() == productId)
                    index = i;

          products.remove(index);*/
          repo.deleteById(productId);

     }

}
