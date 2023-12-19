package com.yash.ProductCategory.serviceImpl;

import com.yash.ProductCategory.model.ProductCategory;
import com.yash.ProductCategory.service.ProductCategoryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

  @Override
  public List<ProductCategory> getAllProductCategories() {
    return Arrays.asList(
        new ProductCategory(1, "Clothing", "Shirt", "White formal Shirt", 4.2),
        new ProductCategory(2, "Clothing", "Jeans", "Light blue denim jeans ", 4.7),
        new ProductCategory(3, "Electronics", "Dell Laptop", "Dell Laptop with 32 GB Ram", 3.7));
  }
}
