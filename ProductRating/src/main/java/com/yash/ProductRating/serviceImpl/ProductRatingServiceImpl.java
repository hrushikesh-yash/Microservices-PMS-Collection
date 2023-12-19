package com.yash.ProductRating.serviceImpl;

import com.yash.ProductRating.model.ProductRating;
import com.yash.ProductRating.service.ProductRatingService;
import org.springframework.stereotype.Service;

@Service
public class ProductRatingServiceImpl implements ProductRatingService {
	
	@Override
	public ProductRating getProductRatingsByProductId (int productId) {
    return new ProductRating(1,3.5,"This is value for money product");
	
	}
}
