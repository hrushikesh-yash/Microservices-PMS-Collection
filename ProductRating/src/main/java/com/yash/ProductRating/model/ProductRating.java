package com.yash.ProductRating.model;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
public class ProductRating {
	
	public ProductRating (int productId, double productRating, String productFeedback) {
		this.productId = productId;
		this.productRating = productRating;
		this.productFeedback = productFeedback;
	}
	
	private int productId;
	private double productRating;
	private String productFeedback;
}
