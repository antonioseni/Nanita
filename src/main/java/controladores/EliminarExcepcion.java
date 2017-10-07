package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logicaDeDatos.ConexionDB;
/**
 * Servlet implementation class EliminarExcepcion
 */
@WebServlet("/EliminarExcepcion")
public class EliminarExcepcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Date inicio;
	private Date fin;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarExcepcion() {
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
			inicio = convertir(request.getParameter("inicio"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fin = convertir(request.getParameter("fin"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(inicio.equals("")||fin.equals("")){
			out.println("<script type=\"text/javascript\">");
			out.println("alert('No deje elementos en blanco:');");
			
			out.println("location='EliminarExcepcion.jsp';");
			out.println("</script>");
			
		}
		else{
			/*
			Sala Sala = new Sala(nombreEntidad, descripcionEntidad);
			
			System.out.println(curso.getCodigo());
			System.out.println(curso.getDescripcion());
			*/
			
			ConexionDB conexion=ConexionDB.obtenerConexion();
			conexion.getQuery("CALL editarExcepcion('"+inicio+"','"+fin+"')");

			
			out.println("<script type=\"text/javascript\">");
			out.println("confirm('Se registrará un nueva sala de reunión');");
			out.println("location='EliminarExcepcion.jsp';");
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
	
	protected Date convertir(String fecha) throws ParseException{
		String startDateString = fecha;
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd"); 
		Date startDate;
		    startDate = (Date) df.parse(startDateString);
		    return startDate;
	}

}
