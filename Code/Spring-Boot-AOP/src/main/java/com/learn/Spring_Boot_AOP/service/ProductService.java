package com.learn.Spring_Boot_AOP.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public void showProducts()
	{
		System.out.println("product 1");
		System.out.println("product 2");
	}
}
