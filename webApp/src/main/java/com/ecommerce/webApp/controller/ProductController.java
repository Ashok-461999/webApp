package com.ecommerce.webApp.controller;

import com.ecommerce.webApp.model.Product;
import com.ecommerce.webApp.service.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService prdctService;

    @GetMapping ("/products")
    public List<Product> getProducts() {
        return prdctService.getProducts();
    }
    @GetMapping("/products/{id}")
    public  Product getProductById(@PathVariable int id)
    {
      return  prdctService.getProductById(id);
    }

    @PostMapping("/products")
    public String addProduct(@RequestBody Product product)
    {

       return  prdctService.addProduct(product);
    }

    @PutMapping("/update")
    public String updateProduct(@RequestBody Product product)
    {

        return  prdctService.updateProduct(product);
    }
}
