package edu.curso;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Pet geradorPet() { 
		System.out.println("Gerando Pet");
		Pet p = new Pet();
		p.setId(1);
		p.setNome("Totó");
		return p;
	}

}
