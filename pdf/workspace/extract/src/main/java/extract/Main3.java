package extract;

import com.spire.pdf.*;
import com.spire.pdf.exporting.text.SimpleTextExtractionStrategy;

import java.awt.geom.Rectangle2D;
import java.io.*;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiate a PdfDocument object
		PdfDocument pdf = new PdfDocument();
		//Load the Pdf file
		pdf.loadFromFile("D:/dev/pdf/docs/cataloguepage1.pdf");

		StringBuilder sb= new StringBuilder();

		//Extract text from every page of the Pdf
		for (PdfPageBase page: (Iterable<PdfPageBase>) pdf.getPages()) {
		    sb.append(page.extractText(true));
		}

		try {
		    //Write the text into a .txt file 
		    FileWriter writer = new FileWriter("ExtractText.txt");
		    writer.write(sb.toString().replace("\r\n", "").replace("\t", ""));
		    writer.flush();
		} catch (IOException e) {
		    e.printStackTrace();
		}

		//Close the PdfDocument object
		pdf.close();

	}

}
