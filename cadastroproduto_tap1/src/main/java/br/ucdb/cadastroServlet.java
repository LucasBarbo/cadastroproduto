package br.ucdb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cadastroServlet
 */
@WebServlet("/cadastroServlet")
public class cadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public cadastroServlet() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String descricao = request.getParameter("descricao");
		double valor = Double.parseDouble(request.getParameter("valor"));
		
		Produto produto = new Produto();
		produto.setDescricao(descricao);
		produto.setId(id);
		produto.setValor(valor);
		
		
		
		
	  
	}

}
