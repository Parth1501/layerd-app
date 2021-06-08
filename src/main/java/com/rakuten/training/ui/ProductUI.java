package com.rakuten.training.ui;

import java.util.Scanner;

import com.rakuten.training.domain.Product;
import com.rakuten.training.service.ProductService;
import com.rakuten.training.service.ProductServiceImpl;

public class ProductUI {
	ProductService service = new ProductServiceImpl();

	public void createProductServiceUI() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter product name: ");
			String name = s.nextLine();
			System.out.print("Enter product price: ");
			double price = Double.parseDouble(s.nextLine());
			System.out.print("Enter quantity: ");
			int qoh = Integer.parseInt(s.nextLine());

			Product product = new Product(name, price, qoh);
			int id = service.addNewProduct(product);
			System.out.println("New product added with id: " + id);
		}

	}

	public void getProductById(int id) {
		Product product = service.findById(id);
		System.out.println(product);

	}
}
