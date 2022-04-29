package com.csi.dao;


import com.csi.model.Product;
import com.csi.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductDaoImpl  {
   @Autowired
    ProductRepository productRepositoryImpl;


    public void saveData(Product product) {
        productRepositoryImpl.save(product);
    }

    public List<Product> getAllData() {
      return   productRepositoryImpl.findAll();
    }

    public Optional<Product> getDataById(int productId) {
        return productRepositoryImpl.findById(productId);
    }

    public Product getDataByName(String productName) {
       return productRepositoryImpl.findByProductName(productName);
    }

    public void deleteDataById(int productId) {
        productRepositoryImpl.deleteById(productId);
    }
}
