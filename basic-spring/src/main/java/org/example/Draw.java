package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Draw {
	@Autowired
	@Qualifier(value = "rectangle")
	private Shape shape;

	@Autowired
	private Student student;

	public Draw() {
		System.out.println("Draw constructor...");
	}

	public void aMethod() {
		if (student != null)
			System.out.println(student.getName());
	}
}
