package org.example;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{
	public double area() {
		return 0.99;
	}
	public Rectangle() {
		System.out.println("Rectangle constructor...");
	}
}
