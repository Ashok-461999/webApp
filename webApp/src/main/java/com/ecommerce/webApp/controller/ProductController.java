package com.ecommerce.webApp.controller;

import com.ecommerce.webApp.model.Product;
import com.ecommerce.webApp.service.ProductService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductController  {

    @Autowired
    ProductService prdctService;
    @RequestMapping("/products")
    public List<Product> getProducts()
    {
        return prdctService.getProducts();
   }
}
