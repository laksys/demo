package org.example;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {
	public double area() {
		return 4.0023;
	}
	public Triangle() {
		System.out.println("Triangle constructor...");
	}
}
