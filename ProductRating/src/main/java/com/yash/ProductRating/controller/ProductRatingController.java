package com.yash.ProductRating.controller;

import com.yash.ProductRating.model.ProductRating;
import com.yash.ProductRating.serviceImpl.ProductRatingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Product-Ratings")
public class ProductRatingController {
	
	@Autowired
	ProductRatingServiceImpl productRatingService;
	@GetMapping("/ByProductId/{productId}")
	 public ProductRating getProductRatingByProductId(@PathVariable int productId){
		return productRatingService.getProductRatingsByProductId (productId);
	}
}
