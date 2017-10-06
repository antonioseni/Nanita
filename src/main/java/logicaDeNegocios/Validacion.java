package logicaDeNegocios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Validacion {

	public Validacion() {
		// TODO Auto-generated constructor stub
	}
	public Date ParseFecha(String pFecha){
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(pFecha);
        } 
        catch (ParseException ex) 
        {
            System.out.println(ex);
        }
        return fechaDate; 
	}
}
