package pdf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.Date;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfWriter;

import pdf.Watermarking.Watermark;
import shubham.Example;
import shubham.SendAttachment;

public class FirstPDFCreating {
	static String student_name = "Rohit";
	private static String CANDIDATE_PASSWORD = "12345678";
	private static String RECRUITER_PASSWORD = "shubham";
	private static String OWNER_PASSWORD = "password";
    public static final Font FONT = new Font();
    
   // public static final Font BOLD = new Font(FontFamily.HELVETICA, 12, Font.BOLD);
    
    public void  pdfcreate() throws MalformedURLException, IOException{
    	
		try{
			
		OutputStream stream = new FileOutputStream(new File("D:\\Auto\\"+student_name+".pdf"));
		Document document= new Document();
		
		PdfWriter writer = PdfWriter.getInstance(document, stream);
		
		//writer.setEncryption(CANDIDATE_PASSWORD.getBytes(),RECRUITER_PASSWORD.getBytes(),PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128); //user password
		 Rectangle rect = new Rectangle(30, 30, 550, 800);
	        writer.setBoxSize("art", rect);
		 
		 
		 document.open();
	
		 document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 
	
		document.add(new Paragraph("Ref No:"+123 +"                                                                                                                  "	+ "                 Date:25 Nov 2017",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		
	
		
		  document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		document.add(new Paragraph("Name of the Company:"+" Xenture",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		document.add(new Paragraph("Address: Vashi,Mumbai",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		document.add(new Paragraph("Sub:  Offer Letter for Employment:",new Font(FontFamily.HELVETICA, 12, Font.BOLD)));
		
		 document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 
		 document.add(new Paragraph("MR:"+student_name,new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph("Position Offered: Java Developer ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph("Job Location: Mumbai ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph("Date of Joining: 25 Nov 2017 ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph("CTC Offered: 5 Lac ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph("We welcome you and wish to have a long-term association with us.  ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));	
		 document.add(new Paragraph("Yours faithfully,",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph("Xenture Inc",new Font(FontFamily.HELVETICA, 12, Font.BOLDITALIC)));
		 document.add(new Paragraph(" ",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 
		 document.add(new Paragraph("digital signature",new Font(FontFamily.HELVETICA, 10, Font.NORMAL)));
		 document.add(new Paragraph("Akaknsha Mishra",new Font(FontFamily.HELVETICA, 11, Font.BOLD)));

		 System.out.println("done");
		
			
		 
	
		
		
		document.close();
		stream.close();
		}catch(FileNotFoundException |DocumentException  e){
			e.printStackTrace();
		}
    }
    
	public static void main(String[] args) throws IOException  {
		FirstPDFCreating fd = new FirstPDFCreating();
		fd.pdfcreate();
		 String filename="D://Auto/Rohit.pdf";
		 String trabaajo_id="xtplxendevteam@gmail.com";
			String trabaajo_password="xenture12345";
			String message="Hello Shubham PFA";
			String email="s.sharma@xenture.co";
			String cc1="m.rade@xenture.co";
			String bcc="s.goswami@xenture.co";
			
			
			String Subject="officer letter";
	       	
		boolean mailsuccess = false ;
		mailsuccess=SendAttachment.sendpdf(trabaajo_id, trabaajo_password, email, Subject, message,filename, cc1, bcc);
		//boolean open = Example.open();
	
	}
	 

}

