package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logicaDeDatos.ConexionDB;

/**
 * Servlet implementation class VerExcepciones
 */
@WebServlet("/VerExcepciones")
public class VerExcepciones extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private int idEncargado;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerExcepciones() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		idEncargado = Integer.parseInt(request.getParameter("idEncargado"));
		
		
		if(idEncargado==0){
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Error, se deben completar todos los campos');");
			out.println("location='VerExcepciones.jsp';");
			out.println("</script>");
			
		}
		else{
			
			//Curso curso = new Curso(nombreEntidad, descripcionEntidad);
			
			//System.out.println(curso.getCodigo());
			//System.out.println(curso.getDescripcion());
			
			
			
			ConexionDB conexion=ConexionDB.obtenerConexion();
			ResultSet resultado=conexion.getQuery("CALL verExepciones("+idEncargado+");");
						
			
			out.println("<script type=\"text/javascript\">");
			out.println("confirm('Se registrara un nueva entidad');");
			out.println("location='VerExcepciones.jsp';");
			out.println("</script>");
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
