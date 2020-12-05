package extract;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    try{
	      //Loading an existing document
	      File file = new File("D:/dev/pdf/docs/cataloguepage1.pdf");
	      PDDocument document = PDDocument.load(file);

	      //Instantiate PDFTextStripper class
	      PDFTextStripper pdfStripper = new PDFTextStripper();

	      //Retrieving text from PDF document
	      String text = pdfStripper.getText(document);
	      System.out.println(text.replace("\\r\\n\\r\\n", ""));

	      //Closing the document
	      document.close();
    }catch(Exception e){
    	
    }
	}

}
