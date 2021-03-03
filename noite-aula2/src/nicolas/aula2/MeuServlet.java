package nicolas.aula2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet; 


@WebServlet("/MeuPrimeiroServlet")
public class MeuServlet  extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		
		System.out.println("Meu Servlet foi executado com sucesso");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("<h3> Olá Mundo </h3>");
		out.flush();
		
		
	}

}
