package com.ecommerce.webApp.service;

import com.ecommerce.webApp.model.Product;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101, "iphone", 50000),new Product(102, "realme", 45000), new Product(103,"ipad",76000)));
    public List<Product> getProducts()
    {
      return products;
    }

    public  Product getProductById(int id)
    {


        return products.stream().filter(p ->p.getProdId()==id).findFirst().orElse(new Product(107,"imax",90000));

    }

    public String addProduct(Product product)

    {
        products.add(product);
        return "Sucess";

    }

    public String updateProduct(Product product)

    {
         int index =0;
        for(int i=0 ; i<products.size();i++)
        {
            if(products.get(i).getProdId()==product.getProdId())
            {
                index =i;
            }
        }
        products.set(index,product);
        return "Sucess";

    }

    public String deleteProduct(int id) {
        int index =0;
        for(int i=0 ; i<products.size();i++)
        {
            if(products.get(i).getProdId()==id)
            {
                index =i;
            }
        }
        products.remove(index);

        return "Sucess";
    }
}
