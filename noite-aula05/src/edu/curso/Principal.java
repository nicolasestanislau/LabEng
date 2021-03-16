package edu.curso;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {
	public static void main(String[] args) {
		ApplicationContext app = 
				new AnnotationConfigApplicationContext("edu.curso");
		
		Pet p1 = app.getBean(Pet.class);
		p1.mostrar();
		
		Pet p2 = app.getBean(Pet.class);
		p2.mostrar();
		
		Pet p3 = app.getBean(Pet.class);
		p3.mostrar();
	}
}
