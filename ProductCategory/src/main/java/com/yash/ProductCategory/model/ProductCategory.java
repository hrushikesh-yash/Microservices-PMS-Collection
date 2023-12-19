package com.yash.ProductCategory.model;

import lombok.*;

@Setter
@Getter
@Data
@AllArgsConstructor
public class ProductCategory {
	
	private int productId;
	private String productCategory;
	private String productName;
	private String productDesc;
	private double productRating;
}
