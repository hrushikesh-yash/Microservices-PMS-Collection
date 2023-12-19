package com.yash.ProductDetails.controller;

import com.yash.ProductDetails.model.ProductDetails;
import com.yash.ProductDetails.serviceImpl.ProductDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ProductDetails")
public class ProductDetailsController {

  @Autowired ProductDetailsServiceImpl productDetailsService;

  @GetMapping("/GetProductDetails/{productId}")
  public ProductDetails getProductDetailsService(@PathVariable int productId) {
    return productDetailsService.findProductDetailsByProductId(productId);
  }
}
