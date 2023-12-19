package com.yash.ProductDetails.serviceImpl;

import com.yash.ProductDetails.model.ProductDetails;
import com.yash.ProductDetails.service.ProductDetailsService;
import org.springframework.stereotype.Service;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {

  @Override
  public ProductDetails findProductDetailsByProductId(int productId) {
    return new ProductDetails (1, "Shirt", 2);
  }
}
