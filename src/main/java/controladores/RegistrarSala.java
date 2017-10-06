package controladores;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class registrarSala
 */

public class RegistrarSala extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String identificador;
	private String nombre;
	private String descripcion;
	private int capacidad;
	private boolean isMantenimiento;
	private boolean isReserva;
	/**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarSala() {
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
		nombre = request.getParameter("nombre");
		capacidad=Integer.parseInt(request.getParameter("capacidad"));
		descripcion = request.getParameter("descripcion");
		isMantenimiento= Boolean.parseBoolean(request.getParameter("isMantenimiento"));
		isReserva= Boolean.parseBoolean(request.getParameter("isReserva"));
		
		if(identificador.equals("")||nombre.equals("")||descripcion.equals("")){
			out.println("<script type=\"text/javascript\">");
			out.println("alert('No deje elementos en blanco:');");
			
			out.println("location='RegistrarSala.jsp';");
			out.println("</script>");
			
		}
		else{
			/*
			Sala Sala = new Sala(nombreEntidad, descripcionEntidad);
			
			System.out.println(curso.getCodigo());
			System.out.println(curso.getDescripcion());
			*/
			/**
			ConexionBD conexion=ConexionBD.obtenerConexion();
			conexion.getQuery("CALL agregarSalaDeReunion('"+identificador+"', '"+nombre+"', '"+capacidad+"', '"+descripcion+"','"+isMantenimiento+"','"+isReserva+"');");
**/
			
			out.println("<script type=\"text/javascript\">");
			out.println("confirm('Se registrará un nueva sala de reunión');");
			out.println("location='RegistrarSala.jsp';");
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
