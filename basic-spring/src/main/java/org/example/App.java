package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

//@Configuration
@ComponentScan(basePackages = "org.example")
public class App {
	private static final Logger log = LoggerFactory.getLogger(App.class);
	@Bean
	public Student getStudent() {
		log.debug("getStudent called...");
		return new Student("Kuppan");
	}
	@Bean
	@Primary
	public Student getAnotherStudent() {
		log.debug("getAbotherStudent called!");
		return new Student("Suppan");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("------starts--------");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		
		//Shape shape = ctx.getBean(Rectangle.class);
		//out.println( shape.area());
		
		Draw draw = ctx.getBean(Draw.class);
		draw.aMethod();
		
		((AnnotationConfigApplicationContext)ctx).close();
		log.debug("-----finished-------");
	}

}
