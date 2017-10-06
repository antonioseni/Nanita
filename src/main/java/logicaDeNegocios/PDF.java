package logicaDeNegocios;


import com.itextpdf.text.Anchor;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chapter;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Section;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;
import java.util.ArrayList; 

public class PDF {

	private static final Font chapterFont = FontFactory.getFont(FontFactory.HELVETICA, 20, Font.BOLDITALIC);
    private static final Font paragraphFont = FontFactory.getFont(FontFactory.HELVETICA, 12, Font.NORMAL);
         
    private static final Font categoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
    private static final Font subcategoryFont = new Font(Font.FontFamily.TIMES_ROMAN, 16, Font.BOLD);
    private static final Font blueFont = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.NORMAL, BaseColor.RED);    
    private static final Font smallBold = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD);
    
    public String descripcionEvaluacion;
    public String idEvaluacion;
    public String puntajeTotal;
    public String porcentajeEvaluacion;
    public String minutosDisponibles;
    public String tipoEvaluacion;
    public String fechaHoraRegistro;
    public ArrayList<String> listaPreguntas;
    public ArrayList<String> listaRespuestas;

    
    
   
    /**
     * We create a PDF document with iText using different elements to learn 
     * to use this library.
     * Creamos un documento PDF con iText usando diferentes elementos para aprender 
     * a usar esta librer�a.
     * @param pdfNewFile  <code>String</code> 
     *      pdf File we are going to write. 
     *      Fichero pdf en el que vamos a escribir. 
     * @throws DocumentException 
     */
    
    // Administrador
    public PDF(String descripcionEvaluacion, String idEvaluacion, String puntajeTotal, 
    		String porcentajeEvaluacion, String minutosDisponibles, String tipoEvaluacion, 
    		String fechaHoraRegistro, ArrayList <String> listaPreguntas){
    	
			this.descripcionEvaluacion = descripcionEvaluacion;
			this.idEvaluacion = idEvaluacion;
			this.puntajeTotal = puntajeTotal;
			this.porcentajeEvaluacion = porcentajeEvaluacion;
			this.minutosDisponibles = minutosDisponibles;
			this.tipoEvaluacion = tipoEvaluacion;
			this.fechaHoraRegistro = fechaHoraRegistro;
			this.listaPreguntas = listaPreguntas;
    }
    
    // Estudiante
    public PDF(String descripcionEvaluacion, String idEvaluacion, String puntajeTotal, 
    		String porcentajeEvaluacion, String minutosDisponibles, String tipoEvaluacion, String fechaHoraRegistro,
    		ArrayList <String> listaPreguntas, ArrayList <String> listaRespuestas){
    	
	    	this.descripcionEvaluacion = descripcionEvaluacion;
	    	this.idEvaluacion = idEvaluacion;
	    	this.puntajeTotal = puntajeTotal;
	    	this.porcentajeEvaluacion = porcentajeEvaluacion;
	    	this.minutosDisponibles = minutosDisponibles;
	    	this.tipoEvaluacion = tipoEvaluacion;
	    	this.fechaHoraRegistro = fechaHoraRegistro;
	    	this.listaPreguntas = listaPreguntas;
	    	this.listaRespuestas = listaRespuestas;
    	
    }
    
    
    public void createPDF(File pdfNewFile) throws DocumentException {
        // Aqu� introduciremos el c�digo para crear el PDF.
    	
    	
    	// We create the document and set the file name.        
    	// Creamos el documento e indicamos el nombre del fichero.
    	Document document = new Document();
    	try {
    	    
    	    try {
    	        PdfWriter.getInstance(document, new FileOutputStream(pdfNewFile));
    	    } catch (FileNotFoundException fileNotFoundException) {
    	        System.out.println("No such file was found to generate the PDF "
    	                + "(No se encontr� el fichero para generar el pdf)" + fileNotFoundException);
    	    }
    	    document.open();
    	 
    		// A�adimos los metadatos del PDF
        	document.addTitle("Profesor Cognitivo v2");
        	document.addSubject("Usando iText");
        	document.addKeywords("Java, PDF, iText");
        	document.addAuthor("Johan OZ");
        	document.addCreator("Johan");	
        	
        	// Primera p�gina 
        	Chunk chunk = new Chunk("                         Profesor Cognitivo I.T.C.R.", chapterFont);
        	chunk.setBackground(BaseColor.WHITE);
        	// Let's create de first Chapter (Creemos el primer cap�tulo)
        	Chapter chapter = new Chapter(new Paragraph(chunk), 1);
        	chapter.setNumberDepth(0);
        	chapter.add(new Paragraph("                      ", paragraphFont));
        	//chapter.add(new Paragraph("Curso: Dise�o de Software", paragraphFont));
        	chapter.add(new Paragraph("Nombre de Evaluacion "+descripcionEvaluacion, paragraphFont));
        	chapter.add(new Paragraph("ID Evaluacion "+idEvaluacion, paragraphFont));
        	chapter.add(new Paragraph("Puntaje Total: "+puntajeTotal, paragraphFont));
        	chapter.add(new Paragraph("Porcentaje Nota Final: "+porcentajeEvaluacion+"%", paragraphFont));
        	chapter.add(new Paragraph("Fecha y Hora: "+fechaHoraRegistro, paragraphFont));
        	chapter.add(new Paragraph("Tiempo Maximo: "+minutosDisponibles+"mins", paragraphFont));
        	chapter.add(new Paragraph("Tipo de Evaluacion: "+tipoEvaluacion, paragraphFont));
        	
        	
        	for(int i = 0; i<listaPreguntas.size(); i++){
        		int numero = i+1;
        		String pregunta = listaPreguntas.get(i);
        		chapter.add(new Paragraph("\n\n"+ numero +". "+pregunta, subcategoryFont));
        	}
        	

    		document.add(chapter);
    		
        	/**
        	Chapter chapSecond = new Chapter(new Paragraph(new Anchor("A�adimos varios elementos")), 1);
        	Paragraph paragraphS = new Paragraph("Do it by Xules (Realizado por Xules)", subcategoryFont);
        	
        	Section paragraphMoreS = chapSecond.addSection(paragraphS);
        	// List by iText (listas por iText)
        	String text = "test 1 2 3 ";
        	for (int i = 0; i < 5; i++) {
        	    text = text + text;
        	}
        	List list = new List(List.UNORDERED);
        	ListItem item = new ListItem(text);
        	item.setAlignment(Element.ALIGN_JUSTIFIED);
        	list.add(item);
        	text = "a b c align ";
        	for (int i = 0; i < 5; i++) {
        	    text = text + text;
        	}
        	item = new ListItem(text);
        	item.setAlignment(Element.ALIGN_JUSTIFIED);
        	list.add(item);
        	text = "supercalifragilisticexpialidocious ";
        	for (int i = 0; i < 3; i++) {
        	    text = text + text;
        	}
        	item = new ListItem(text);
        	item.setAlignment(Element.ALIGN_JUSTIFIED);
        	list.add(item);
        	paragraphMoreS.add(list);
        	document.add(chapSecond);
        	 **/
    	    document.close();
    	    System.out.println("Documento PDF Listo!");
    	} catch (DocumentException documentException) {
    	    System.out.println("Se ha producido un error al generar un documento: " + documentException);
    	}
    
    }

}
	
