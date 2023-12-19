package com.yash.ProductDetails.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class ProductDetails {
	private int productId;
	private String productName;
	private int productQty;
}