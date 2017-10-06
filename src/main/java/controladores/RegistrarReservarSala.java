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
 * Servlet implementation class ReservarSala
 */
@WebServlet("/ReservarSala")
public class RegistrarReservarSala extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Date fechaReservacion;
	private int cantidadParticipantes;
	private String salaDeReunion;
	private String responsableReunion;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrarReservarSala() {
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
		SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yy hh:mm:ss");
		try {
			fechaReservacion = formato.parse(request.getParameter("fechaReservacion"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cantidadParticipantes = Integer.parseInt(request.getParameter("cantidadParticipantes"));
		salaDeReunion= request.getParameter("salaDeReunion");
		responsableReunion= request.getParameter("responsable");
		
		if(fechaReservacion.equals("")||salaDeReunion.equals("")||responsableReunion.equals("")){
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Error, se deben completar los campos');");
			out.println("location='RegistrarReservaSala.jsp';");
			out.println("</script>");
			
		}
		else{
		/*	
			Curso curso = new Curso(nombreEntidad, descripcionEntidad);
			
			System.out.println(curso.getCodigo());
			System.out.println(curso.getDescripcion());
			*/
			ConexionDB conexion=ConexionDB.obtenerConexion();
			conexion.getQuery("call agregarEquipoEspecializado('"+fechaReservacion+"', '"+cantidadParticipantes+"', '"+salaDeReunion+"', '"+responsableReunion+"');");
			
			
			out.println("<script type=\"text/javascript\">");
			out.println("confirm('Se registrará una nueva reserva de sala');");
			out.println("location='RegistrarReservaSala.jsp';");
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
