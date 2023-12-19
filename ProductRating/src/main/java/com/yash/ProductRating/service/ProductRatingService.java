package com.yash.ProductRating.service;

import com.yash.ProductRating.model.ProductRating;

public interface ProductRatingService {
	
	ProductRating getProductRatingsByProductId(int productId);
}
