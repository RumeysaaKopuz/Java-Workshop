package com.pair5.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private List<Product> productList = new ArrayList<>();



    @GetMapping
    public List<Product> getAll(){
        return productList;
    }

    @PostMapping
    public String add(@RequestBody Product product){
        productList.add(product);
        return "Eklendi";
    }
}