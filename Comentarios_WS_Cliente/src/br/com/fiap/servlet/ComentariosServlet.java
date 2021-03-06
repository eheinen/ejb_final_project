package br.com.fiap.servlet;

import java.io.IOException;
import java.time.Instant;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.comentarios.jaxws.ComentarioPortType;
import br.com.fiap.comentarios.jaxws.ComentarioPortTypeProxy;
import br.com.fiap.comentarios.jaxws.Comentarios;

@WebServlet("/comentarios")
public class ComentariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ComentariosServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("comentarios.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String assunto = request.getParameter("assunto");
		String avaliacao = request.getParameter("avaliacao");
		try{
			ComentarioPortType comentarioService = new ComentarioPortTypeProxy();
			Comentarios comentarios = new Comentarios();
			comentarios.setAssunto(assunto);
			comentarios.setAvaliacao(Integer.parseInt(avaliacao));
			comentarios.setTitulo(titulo);
			comentarios.setData(Date.from(Instant.now()));
			comentarioService.add(comentarios);
			System.out.println(comentarioService.getAll());
			request.setAttribute("comentarios", comentarioService.getAll());
			request.getRequestDispatcher("comentarios.jsp").forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
