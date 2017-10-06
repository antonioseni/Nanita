package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.CallableStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import logicaDeDatos.ConexionDB;

/**
 * Servlet implementation class AnadirEquipoEspecializado
 */
@WebServlet("/AnadirEquipoEspecializado")
public class AnadirEquipoEspecializado extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String identificador;
	private String descripcion;
    private String salaDeReunion;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AnadirEquipoEspecializado() {
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
		identificador = request.getParameter("identificador");
		descripcion = request.getParameter("descripcion");
		salaDeReunion= request.getParameter("salaDeReunion");
		
	/*	ConexionDB conn=ConexionDB.obtenerConexion();
		CallableStatement cStmt= conn.prepareCall("{call agregarEquipoEspecializado('"+identificador+"', '"+descripcion+"', '"+salaDeReunion+"')}");
		cStmt.setString(1, "abcdfg");
		*/
		
		//System.out.print("/n Prueba de conexión");
		//System.out.print("call agregarEquipoEspecializado('"+identificador+"', '"+descripcion+"', '"+salaDeReunion+"');");
		//String statement= "call agregarEquipoEspecializado('"+identificador+"', '"+descripcion+"', '"+salaDeReunion+"');";
		//conexion.setQuery(statement);
		response.getWriter().append("Served at: ").append(request.getContextPath());
		/*
		if(identificador.equals("")||descripcion.equals("")){
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Error, se deben completar los campos de:');");
			out.println("location='RegistrarEquipoEspecializado.jsp';");
			out.println("</script>");
			
		}
		else{
		
			Curso curso = new Curso(nombreEntidad, descripcionEntidad);
			
			System.out.println(curso.getCodigo());
			System.out.println(curso.getDescripcion());
			
			
			
			out.println("<script type=\"text/javascript\">");
			out.println("confirm('Se registrara un nuevo activo');");
			out.println("location='RegistrarEquipoEspecializado.jsp';");
			out.println("</script>");
		}
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
