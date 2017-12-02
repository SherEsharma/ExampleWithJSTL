package shubham;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Date;
 
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
public class JavaPdfHelloWorld {
	private static String USER_PASSWORD = "password";
	private static String OWNER_PASSWORD = "khushi";

	public static void main(String[] args) {
		try 
		{
			OutputStream file = new FileOutputStream(new File("Trabajo.pdf"));
			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document, file);

			writer.setEncryption(USER_PASSWORD.getBytes(),
					OWNER_PASSWORD.getBytes(), PdfWriter.ALLOW_PRINTING,
					PdfWriter.ENCRYPTION_AES_128);
			document.open();
			 //Add Image
			String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
		    Image image2 = Image.getInstance(new URL(imageUrl));
		    document.add(image2);
			
			document.add(new Paragraph("Shubha,"));

			//Set attributes here
			document.addAuthor("Shubham sharma");
			document.addCreationDate();
			document.addCreator("Trabaajo.com");
			document.addTitle("offer letter");
			document.addSubject("Shubam");

			document.add(new Paragraph("This is your offer letter !!"));
			document.close();
			file.close();
			writer.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
