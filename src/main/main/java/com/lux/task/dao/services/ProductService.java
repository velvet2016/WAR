package com.lux.task.dao.services;

import com.lux.task.dao.impl.ProductDaoImpl;
import com.lux.task.dao.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ProductService {

    @Autowired
    private ProductDaoImpl dao;

    public List<String> getListForUiSelect(){
        List<Product> allProducts = dao.getAll();
        List<String> productNamesList = new ArrayList<String>();
        for (Product product : allProducts) {
            productNamesList.add(product.getName());
        }
        return productNamesList;
    }
}
