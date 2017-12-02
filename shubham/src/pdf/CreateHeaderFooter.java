package pdf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
public class CreateHeaderFooter  {
	static String student_name = "Rohit";
    public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
	Document document = new Document();
	PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\Auto\\"+student_name+".pdf"));
        Rectangle rect = new Rectangle(30, 30, 550, 800);
        writer.setBoxSize("art", rect);
        HeaderFooterPageEvent event = new HeaderFooterPageEvent();
        writer.setPageEvent(event);
        document.open();
        document.add(new Paragraph("This is Page One"));
        
        document.close();
	System.out.println("Done");
    }
} 