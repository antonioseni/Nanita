package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logicaDeDatos.ConexionDB;

/**
 * Servlet implementation class RealizarMantenimientoSala
 */
@WebServlet("/RealizarMantenimientoSala")
public class RealizarMantenimientoSala extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	private Date fechaInicio;
	private Date fechaFinalizacion;
	private double presupuestoTotal;
	private double presupuestoPorHora;
	private String tipoMantenimiento;
	private int horasInvertidas;
	private String salaDeReunion;
	SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RealizarMantenimientoSala() {
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
		
		try {
			fechaInicio = formato.parse(request.getParameter("fechaInicio"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fechaFinalizacion = formato.parse(request.getParameter("fechaFinalizacion"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		presupuestoTotal = Double.parseDouble(request.getParameter("presupuestoTotal"));
		tipoMantenimiento = request.getParameter("tipoMantenimiento");
		presupuestoPorHora =Double.parseDouble(request.getParameter("presupuestoPorHora"));
		horasInvertidas= Integer.parseInt(request.getParameter("horasInvertidas"));
		salaDeReunion = request.getParameter("salaDeReunion");
		
		if(fechaInicio.equals("")||fechaFinalizacion.equals("")||tipoMantenimiento.equals("")){
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Error, se deben completar los campos');");
			out.println("location='RegistrarMantenimiento.jsp';");
			out.println("</script>");
			
		}
		else{
		/*	
			Curso curso = new Curso(nombreEntidad, descripcionEntidad);
			
			System.out.println(curso.getCodigo());
			System.out.println(curso.getDescripcion());
			*/
			ConexionDB conexion=ConexionDB.obtenerConexion();
			
			conexion.getQuery("CALL agregarMantenimieno('"+fechaInicio+"', '"+fechaFinalizacion+"', '"+presupuestoPorHora+"',"
					+ " '"+tipoMantenimiento+"','"+ horasInvertidas+"', '"+ salaDeReunion+"');");
			
			
			out.println("<script type=\"text/javascript\">");
			out.println("confirm('Se registrara un nuevo activo');");
			out.println("location='RegistrarMantenimiento.jsp';");
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
