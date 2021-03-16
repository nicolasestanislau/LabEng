package edu.curso;

public class Pet {
	
	private long id;
	private String nome;
	
	public void mostrar() { 
		System.out.println(String.format("Id: %d   Nome: %s", id, nome));
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
