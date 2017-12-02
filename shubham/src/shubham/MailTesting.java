package shubham;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Servlet implementation class MailTesting
 */
/*@WebServlet("/MailTesting")*/
public class MailTesting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		System.out.println("dsssssss");
		try {
			
			 
            OutputStream file = new FileOutputStream(new File("D:\\Auto\\Shubham.pdf"));
            String filename="D:\\Auto\\Shubham.pdf";
         Document document = new Document();
         PdfWriter.getInstance(document, file);

//Inserting Image in PDF
    Image image = Image.getInstance ("src/pdf/Trabaajo_logo.PNG");
    image.scaleAbsolute(120f, 60f);//image width,height 

    

//Now Insert Every Thing Into PDF Document
        document.open();//PDF document opened........			       

document.add(image);

document.add(Chunk.NEWLINE);   //Something like in HTML :-)

                  document.add(new Paragraph("Dear Shubham sharma"));// here we add name of candidate
               document.add(new Paragraph("Document Generated On - "+new Date().toString())); 




document.add(Chunk.NEWLINE);   //Something like in HTML :-)							    

             
        document.close();

            file.close();

          System.out.println("Pdf created successfully..");
      	String Subject="officer letter";
		String trabaajo_id="xentureTech";
		String trabaajo_password="xenture12345";
		String message="Hello Shubham PFA";
		//String email="h.kamble@xenture.co";
		
		boolean mailsuccess = false ;
		//mailsuccess=SendAttachment.sendpdf(trabaajo_id, trabaajo_password, email, Subject, message,filename);
      } catch (Exception e) {
          e.printStackTrace();
      }
	}

}
