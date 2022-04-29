package com.csi.controller;


import com.csi.model.Product;
import com.csi.service.ProductServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")

public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;

    @PostMapping("/savedata")
    public  String saveData(@RequestBody Product product){
        productServiceImpl.saveData(product);
        return " Data Saved Sucessfully";
    }
    @GetMapping("/getalldata")
    public List<Product> getAllData(){
        return productServiceImpl.getAllData();
    }
    @GetMapping("/getdatabyId/{productId}")
  public Optional<Product> getDataById(@PathVariable int productId){
        return productServiceImpl.getDataById(productId);

    }  @GetMapping("/getdatabyname/{productName}")
    public Product getDataByName(@PathVariable String productName) {
        return productServiceImpl.getDataByName(productName);
    }
    @DeleteMapping("/deletedatabyid/{productId}")
    public String deleteDataById(@PathVariable int productId){
        productServiceImpl.deleteDataById(productId);
        return " Data Deleted Sucessfully";
    }
}
