package com.ecommerce.webApp.service;

import com.ecommerce.webApp.model.Product;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products = List.of(new Product(101, "iphone", 50000),new Product(102, "realme", 45000), new Product(103,"ipad",76000));
    public List<Product> getProducts()
    {
      return products;
    }

    public  Product getProductById(int id)
    {


        return products.stream().filter(p ->p.getProdId()==id).findFirst().get();

    }
}
