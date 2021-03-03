package nicolas.aula3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MeuServlet")
public class MeuHttpServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		res.setContentType("text/html");
		out.println("<h1>Todos os cabeçalhos</h1>");
		Enumeration<String> cabecalhos = req.getHeaderNames();
		 while (cabecalhos.hasMoreElements()) {
			 String nomeCabecalho = cabecalhos.nextElement();
			 String valorCabecalho = req.getHeader(nomeCabecalho);
			out.println("<p>" + nomeCabecalho + ": " + valorCabecalho + "</p>");
			
			 
		 }
		 out.flush();
	}

}
