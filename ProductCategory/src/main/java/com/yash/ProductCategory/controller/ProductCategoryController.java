package com.yash.ProductCategory.controller;

import com.yash.ProductCategory.model.ProductCategory;
import com.yash.ProductCategory.serviceImpl.ProductCategoryServiceImpl;
import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/productCategory")
@Slf4j
public class ProductCategoryController {

  @Autowired
  ProductCategoryServiceImpl productCategoryService;

  @GetMapping("/GetAllProducts")
  public List<ProductCategory> getllProducts() {
    List<ProductCategory> productCategoryList = productCategoryService.getAllProductCategories();
    return productCategoryList;
  }
}
