package com.yash.ProductDetails.service;

import com.yash.ProductDetails.model.ProductDetails;

public interface ProductDetailsService {

  ProductDetails findProductDetailsByProductId(int productId);
}
