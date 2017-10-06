package controladores;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class CargarEntidades
 */
@WebServlet("/CargarEntidades")
public class CargarEntidades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CargarEntidades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		URLEncoder.encode(" ", "UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//ConexionBD conexion = new ConexionBD();
		//ResultSet resultado = conexion.getQuery("CALL cargarEntidad();");
		
		/*try {
			ArrayList<String> listaEntidades = new ArrayList<String>();
			String nombreEntidad = "";
			while(resultado.next()){
				nombreEntidad = resultado.getString("descripcionTema");
				listaEntidades.add(nombreEntidad);
			}
			nombreEntidad= nombreEntidad.replaceAll(" ", "");
			
			request.setAttribute("listaEntidades", listaEntidades);
			request.getRequestDispatcher("verEntidades.jsp").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
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
