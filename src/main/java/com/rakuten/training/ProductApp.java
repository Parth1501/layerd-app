package com.rakuten.training;

import com.rakuten.training.ui.ProductUI;

public class ProductApp {
	public static void main(String[] args) {
		ProductUI ui=new ProductUI();
		ui.createProductServiceUI();
		ui.getProductById(1);
	}
}
