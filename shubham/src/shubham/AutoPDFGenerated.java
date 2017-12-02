package shubham;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.util.Date;

import com.itextpdf.text.Anchor;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.ExceptionConverter;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class AutoPDFGenerated {

	 private Image total;
	public static void main(String[] args) throws MalformedURLException, IOException {
		try {
			//PdfWriter writer = null;
			OutputStream file = new FileOutputStream(new File("D:\\Auto\\Shubham.pdf"));
			
			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document, file);

			// Inserting Image in PDF
			Image image = Image.getInstance("src/pdf/Trabaajo_logo.PNG");
			image.scaleAbsolute(90f, 40f);// image width,height

			// Now Insert Every Thing Into PDF Document
			document.open();// PDF document opened........

			document.add(image);

			

			Paragraph paragraph = new Paragraph();
			Font font=new Font(FontFamily.HELVETICA,12,Font.NORMAL,BaseColor.GRAY);
			 
			document.add(new Paragraph("Xenture Technology",font));
		
			document.add(new Paragraph("1206,Cyber one"));
			paragraph.add("Sec. 30, Vashi ,Navi Mumbai");
			document.add(paragraph);
	      // end header here
			
			
			document.add(new Paragraph("______________________________________________________________________________"));
			document.add(new Paragraph("To"));
			document.add(new Paragraph("Dear Shubham"));// here we add name of
			
			
			
			document.add(new Paragraph("______________________________________________________________________________"));
			document.add(new Phrase("\u00A9 Xenture.co", new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD)));
			document.add(new Paragraph("Document Generated On - " + new Date().toString()));
			

		/*	//Start footer here
			 PdfPTable footer = new PdfPTable(3);
			 try {
		            // set defaults
		            footer.setWidths(new int[]{24, 2, 1});
		            footer.setTotalWidth(527);
		            footer.setLockedWidth(true);
		            footer.getDefaultCell().setFixedHeight(40);
		            footer.getDefaultCell().setBorder(Rectangle.TOP);
		            footer.getDefaultCell().setBorderColor(BaseColor.LIGHT_GRAY);
		            footer.addCell(new Phrase("\u00A9 Xenture.co", new Font(Font.FontFamily.HELVETICA, 12, Font.BOLD)));

		            // add current page count
		            footer.getDefaultCell().setHorizontalAlignment(Element.ALIGN_RIGHT);
		            footer.addCell(new Phrase(String.format("Page %d of", writer.getPageNumber()), new Font(Font.FontFamily.HELVETICA, 8)));
		         // add placeholder for total page count
		          /*  PdfPCell totalPageCount = new PdfPCell(total);
		            totalPageCount.setBorder(Rectangle.TOP);
		            totalPageCount.setBorderColor(BaseColor.LIGHT_GRAY);
		            footer.addCell(totalPageCount);

		            // write page
		            PdfContentByte canvas = writer.getDirectContent();
		           //canvas.beginMarkedContentSequence(PdfName.ARTIFACT);
		            footer.writeSelectedRows(0, -1, 34, 50, canvas);
		            canvas.endMarkedContentSequence();
				
			 } catch(DocumentException de) {
		            throw new ExceptionConverter(de);
		        }*/
			
		
			document.close();
			file.close();
			System.out.println("Pdf created successfully..");
			boolean open = Example.open();
			 open = Example.manipulatePdf();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
