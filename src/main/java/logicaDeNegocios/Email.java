package logicaDeNegocios;

import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
/**
 * Clase para el envio de email
 * @author TKS
 *
 */
public class Email {
        
    private final String FROM = "tks.profesor@gmail.com";
    private final String CONTRASENA = "profesor123";
    private String to;
    private String asunto;
    private String enlace;
    //private String nombre;
    
    public Email (String pTo, String pAsunto, String enlace){
        to = pTo;
        asunto = pAsunto;
        this.enlace = enlace;
        //nombre = pNombreArchivo; 
    }
    
    /**
     * Metodo que se encarga de ensamblar el correo electronico
     * @return
     * @throws MessagingException
     */
    public boolean enviarCorreo() throws MessagingException{
        try{
            Properties propiedades=generarPropiedades();
            Session sesion=iniciarSesion(propiedades);
            
            BodyPart texto;
            
            texto=texto();  
            
            MimeMultipart cuerpoMensaje=new MimeMultipart();
            cuerpoMensaje.addBodyPart(texto);
            
            if(!enlace.equals("")){
                cuerpoMensaje.addBodyPart(texto);
            }
            
            MimeMessage mensaje=mensaje(sesion,cuerpoMensaje);          
            enviar(mensaje,sesion);
            return true;
            
        }catch(Exception e){
            System.out.println("Error "+e);
            return false;
        }
         
    }
    
    /**
     * Se generan las propiedades necesarias para el enlace con el servidor de correo electr�nico
     * @return
     */
    private Properties generarPropiedades(){
        Properties propiedades=new Properties();
        propiedades.put("mail.smtp.host", "smtp.gmail.com");
        propiedades.setProperty("mail.smtp.starttls.enable", "true");
        propiedades.setProperty("mail.smtp.port", "587");
        propiedades.setProperty("mail.smtp.user", FROM);
        propiedades.setProperty("mail.smtp.auth", "true");
        return propiedades;
    }

  
    /**
     * Se realiza el inicio de sesion en el servidor de correo
     * @param propiedades
     * @return
     */
    private Session iniciarSesion(Properties propiedades){
        Session inicio= Session.getDefaultInstance(propiedades,null);
        inicio.setDebug(true);
        return inicio;
    }
    
    /**
     * M�todo que establece el nombre y la ubicacion del archivo adjunto
     * @param archivo
     * @return
     * @throws MessagingException
     
    private BodyPart archivoAdjunto(BodyPart archivo) throws MessagingException{
        archivo.setDataHandler(new DataHandler(new FileDataSource(enlace)));
        archivo.setFileName("Modelo.pdf");
        return archivo; 
    }
    */
 
    /**
     * M�todo que realiza la conexion con el receptor del mensaje
     * @param sesion
     * @param cuerpoMensaje
     * @return
     * @throws AddressException
     * @throws MessagingException
     */
    private MimeMessage mensaje(Session sesion, MimeMultipart cuerpoMensaje ) throws AddressException, MessagingException {
        MimeMessage mensaje=new MimeMessage(sesion);
        mensaje.setFrom(new InternetAddress(FROM));
        mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        mensaje.setSubject(asunto);
        mensaje.setContent(cuerpoMensaje);
        return mensaje;
    }
    
    /**
     * Metodo que se encarga de asignar el texto
     * @return
     * @throws MessagingException
     */
    private BodyPart texto() throws MessagingException{
        BodyPart texto=new MimeBodyPart();
        texto.setText(enlace);
        return texto;
    }
  
    /**
     * Metodo que se encarga del envio del correo electronico a los servidores de gmail
     * @param mensaje
     * @param sesion
     * @throws MessagingException
     */
    private void enviar(Message mensaje, Session sesion) throws MessagingException{
        Transport t=sesion.getTransport("smtp");
        t.connect(FROM,CONTRASENA);
        t.sendMessage(mensaje, mensaje.getAllRecipients());
        t.close();
    }
    
    public static void main(String [] args) throws MessagingException{
    	Email x = new Email("johansoz95@gmail.com", "Prueba", "http://localhost:8080/app/ControladorCargarPreguntasEvaluacion?codigoEvaluacion=30");
    	x.enviarCorreo();
    }
}


