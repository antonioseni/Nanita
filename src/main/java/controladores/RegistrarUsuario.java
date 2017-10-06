package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logicaDeDatos.ConexionDB;

/**
 * Servlet implementation class RegistrarUsuario
 */
@WebServlet("/RegistrarUsuario")
public class RegistrarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String nombreUsuario;
	private int telefono;
	private String rol;
	private String fechaNacimiento;
	private String email;
	private String entidad;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarUsuario() {
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
		nombreUsuario = request.getParameter("nombreUsuario");
		telefono = Integer.parseInt(request.getParameter("telefono"));
		rol=request.getParameter("rol");
		fechaNacimiento=request.getParameter("fechaNacimiento");
		email=request.getParameter("email");
		entidad=request.getParameter("entidad");
		
		//encargado=Integer.parseInt(request.getParameter("encargado"));
		
		if(nombreUsuario.equals("")||rol.equals("")||fechaNacimiento.equals("")||email.equals("")||entidad.equals("")){
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Error, se deben completar todos los campos del registro');");
			out.println("location='RegistrarUsuario.jsp';");
			out.println("</script>");
			
		}
		else{
			/*
			Curso curso = new Curso(nombreEntidad, descripcionEntidad);
			
			System.out.println(curso.getCodigo());
			System.out.println(curso.getDescripcion());
			*/
			/**
			ConexionDB conexion=ConexionDB.obtenerConexion();
			conexion.getQuery("CALL agregarEntidad('"+nombreEntidad+"', '"+descripcionEntidad+"', '"+tipoEntidad+"');");
			**/
			
			out.println("<script type=\"text/javascript\">");
			out.println("confirm('Se registrara un nueva entidad');");
			out.println("location='RegistrarUsuario.jsp';");
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
