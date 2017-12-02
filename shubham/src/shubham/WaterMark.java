package shubham;


import java.io.FileOutputStream;

import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class WaterMark {
	public static void main(String[] args) {
		
	
	 try {
         PdfReader reader = new PdfReader("D:\\Auto\\Shubham.pdf");
         int n = reader.getNumberOfPages();

         // Create a stamper that will copy the document to a new file
         PdfStamper stamp = new PdfStamper(reader, new FileOutputStream("text1.pdf"));
         int i = 1;
         PdfContentByte under;
         PdfContentByte over;

         Image img = Image.getInstance("temp.PNG");
         BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.WINANSI, BaseFont.EMBEDDED);

         img.setAbsolutePosition(200, 400);

         while (i < n) {
             // Watermark under the existing page
             under = stamp.getUnderContent(i);
             under.addImage(img);

             // Text over the existing page
             over = stamp.getOverContent(i);
             over.beginText();
             over.setFontAndSize(bf, 18);
             over.showText("page " + i);
             over.endText();

             i++;
         }
System.out.println("Done");
         stamp.close();

     } catch (Exception de) {
     }
 }
}


