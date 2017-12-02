package shubham;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfGState;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
public class Example {
	private static final URL IMG = null;

	public static boolean open() throws IOException{
		  File file = new File("D://Auto/rohit.pdf");
	        
	     
	        Desktop desktop = Desktop.getDesktop();
	        if(file.exists()) desktop.open(file);
	        
	        //let's try to open PDF file
	        file = new File("D://Auto/rohit.pdf");
	        
	        if(file.exists()) desktop.open(file);
			return false;
	}
	
	public static boolean manipulatePdf() throws IOException, DocumentException {
		System.out.println("Done");
		String src="D://Auto/rohit.pdf";
		String filename="D://Auto/rohit2.pdf";
		
	    PdfReader reader = new PdfReader(src);
	    int n = reader.getNumberOfPages();
	    PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(filename));
	    stamper.setRotateContents(false);
	    // text watermark
	    Font f = new Font(FontFamily.HELVETICA, 30);
	    Phrase p = new Phrase("Xenture Inc.", f);
	    // image watermark
	  /*  Image img = Image.getInstance(IMG);
	    float w = img.getScaledWidth();
	    float h = img.getScaledHeight();*/
	    // transparency
	    PdfGState gs1 = new PdfGState();
	    gs1.setFillOpacity(0.5f);
	    // properties
	    PdfContentByte over;
	    Rectangle pagesize;
	    float x, y;
	    // loop over every page
	    for (int i = 1; i <= n; i++) {
	        pagesize = reader.getPageSize(i);
	        x = (pagesize.getLeft() + pagesize.getRight()) / 2;
	        y = (pagesize.getTop() + pagesize.getBottom()) / 2;
	        over = stamper.getOverContent(i);
	        over.saveState();
	        over.setGState(gs1);
	        if (i % 2 == 1)
	            ColumnText.showTextAligned(over, Element.ALIGN_CENTER, p, x, y, 0);
	        else
	           // over.addImage(img, w, 0, 0, h, x - (w / 2), y - (h / 2));
	        over.restoreState();
	    }
	    System.out.println("Shubam");
	    String trabaajo_id="xtplxendevteam@gmail.com";
		String trabaajo_password="xenture12345";
		String message="Hello Shubham PFA";
		String email="s.sharma@xenture.co";
		String cc1="prem@xenture.co";
		String cc2="a.kumar@xenture.co";
		
		
		String Subject="officer letter";
       	
		boolean mailsuccess = false ;
	//	mailsuccess=SendAttachment.sendpdf(trabaajo_id, trabaajo_password, email, Subject, message,filename);
		
	    boolean open=Example.open();
	    stamper.close();
	    reader.close();
		return false;
	}

}
