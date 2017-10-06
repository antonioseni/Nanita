package logicaDeDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;

public class ConexionBDSinSingleton extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _usuario="root";//
	private String _pwd="LosQuerubines2017";
	private static String _db="DiseñoDeSoftware";
	static String _url="jdbc:mysql://35.202.229.255/"+_db;
	private Connection conn=null;
	
	public ConexionBDSinSingleton(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection(_url, _usuario, _pwd);
			if(conn != null){
				System.out.println("Se realiz� la conexi�n con:	"+_url);
			}
		}
		catch (SQLException ex){
			System.out.println("No se pud� realizar la conexion");
		}
		catch (ClassNotFoundException ex){
			System.out.print(ex);
		}
	}
	public Connection getConexion(){
		return conn;
	}
	public ResultSet getQuery(String _query){
		Statement state=null;
		ResultSet resultado=null;
		try{
			state=(Statement) conn.createStatement();
			resultado=state.executeQuery(_query);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return resultado;
	}
	
	public void setQuery(String _query){
		
		Statement state=null;
		try{
			state=(Statement) conn.createStatement();
			state.execute(_query);
		}
		catch (SQLException e){
			e.printStackTrace();
		}
	}
	
}

