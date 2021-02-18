package nicolas.labEng;

import java.io.IOException;
import java.io.PrintWriter;
// alteração do git
import com.google.gson.Gson;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

class Pet {
	String nome;
	int idade;
	
	Pet(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}

@WebServlet("/pet")
public class PetAPI implements Servlet {
	
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		
		System.out.println("API Invocada");
		PrintWriter out = res.getWriter();
		Gson gson = new Gson();
		
	//	out.println("data: [");
	//	out.println("{nome:\"toto\", idade: 10}, ");
	//	out.println("{nome:\"rex\", idade: 12}, ");
	//	out.println("{nome:\"fifi\", idade: 19}, ");
	//	out.println("]");
		Pet p1 = new Pet("Toto", 10);
		Pet p2 = new Pet("Rex", 12);
		Pet p3 = new Pet("Fifi", 8);
		
		Pet[] pets = {p1, p2, p3};
		
		String json = gson.toJson(pets);
		
		out.println(json);
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
 	

}
