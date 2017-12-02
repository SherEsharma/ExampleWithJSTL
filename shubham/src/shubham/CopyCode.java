package shubham;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CopyCode {
public static void main(String[] args) throws IOException {
	try{
	FileInputStream Fread= new FileInputStream("D:\\project_18.11.2017\\shubham\\src\\shubham\\CopyCode.java");
	
	  FileOutputStream Fwrite=new FileOutputStream("D:\\Auto\\Hello.txt") ; 
      System.out.println("File is Copied"); 
      int c; 
      while((c=Fread.read())!=-1) 
      Fwrite.write((char)c); 
      Fread.close(); 
      Fwrite.close(); 
	System.out.println(Fread.toString());
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}
}
