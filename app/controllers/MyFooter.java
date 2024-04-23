package controllers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Logger;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEvent;
import com.itextpdf.text.pdf.PdfWriter;

public class MyFooter implements PdfPageEvent {
	Font ffont = new Font(Font.FontFamily.UNDEFINED, 5, Font.ITALIC);	
	public String emisor;
	public String titulo;
	
	
	@Override
	public void onChapter(PdfWriter arg0, Document arg1, float arg2,
			Paragraph arg3) {
	}

	@Override
	public void onChapterEnd(PdfWriter arg0, Document arg1, float arg2) {

	}

	@Override
	public void onCloseDocument(PdfWriter arg0, Document arg1) {
	}

	@Override
	public void onEndPage(PdfWriter writer, Document document) {
        PdfContentByte cb = writer.getDirectContent();

        Image imgUPEV = null;
		try {
			imgUPEV = Image.getInstance("public/images/logoUPEV.png");
		} catch (BadElementException | IOException  e) {
			e.printStackTrace();
		}

        Image escudoPoli = null;
		try {
			escudoPoli = Image.getInstance(    "public/images/escudoPoli.png");
			//escudoPoli = Image.getInstance(    routes.Assets.at("/public/images/escudoPoli.png").toString());
		} catch (BadElementException e1) {
			e1.printStackTrace();
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		try {
			escudoPoli = Image.getInstance("public/images/ipn-escudo.jpg");
			//escudoPoli = Image.getInstance(routes.Assets.at("public/images/ipn-escudo.jpg").toString());
		} catch (BadElementException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        escudoPoli.scaleToFit(46, 59);
        imgUPEV.scaleToFit(80, 52);
		//doc.add(imgUPEV);        
        
        
        PdfPTable tablaEnc = new PdfPTable(new float[]{ 1, 3, 1 });		        
        tablaEnc.setWidthPercentage(100);
        PdfPCell cell = new PdfPCell();
        cell.setBorder(Rectangle.NO_BORDER);
        cell.addElement(escudoPoli);
        tablaEnc.addCell(cell);
        
        Font fontbold = FontFactory.getFont("Cournier-bold", 10, Font.BOLD);
        PdfPCell cell3 = new PdfPCell(new Phrase("INSTITUTO POLITÉCNICO NACIONAL\nSECRETARÍA ACADÉMICA\nUNIDAD POLITÉCNICA PARA LA EDUCACIÓN VIRTUAL\n"+this.titulo,fontbold));
        cell3.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell3.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell3.setBorder(Rectangle.NO_BORDER);		        
        tablaEnc.addCell( cell3 );
        
        imgUPEV.setAlignment(Element.ALIGN_RIGHT);
        
        PdfPCell cell2 = new PdfPCell();
        cell2.addElement( imgUPEV  );
        cell2.setHorizontalAlignment(Element.ALIGN_CENTER);
        cell2.setVerticalAlignment(Element.ALIGN_MIDDLE);
        cell2.setBorder(Rectangle.NO_BORDER);
        tablaEnc.addCell( cell2  );		        
        tablaEnc.setWidthPercentage(100);
        
        tablaEnc.setTotalWidth( document.right() - document.left()  );
        
        tablaEnc.writeSelectedRows(0, -1, 0, -1, document.left(), document.top()+70, cb);

        Phrase footer = new Phrase("Página "+writer.getCurrentPageNumber(), ffont);

        ColumnText.showTextAligned(cb, Element.ALIGN_CENTER,
                footer,
                (document.right() - document.left()) / 2 + document.leftMargin(),
                document.bottom() - 20, 0);
	}

	@Override
	public void onGenericTag(PdfWriter arg0, Document arg1, Rectangle arg2,
			String arg3) {
	}

	@Override
	public void onOpenDocument(PdfWriter arg0, Document arg1) {
	}

	@Override
	public void onParagraph(PdfWriter arg0, Document arg1, float arg2) {
	}

	@Override
	public void onParagraphEnd(PdfWriter arg0, Document arg1, float arg2) {

	}
	
	@Override
	public void onSection(PdfWriter arg0, Document arg1, float arg2, int arg3,
			Paragraph arg4) {


	}

	@Override
	public void onSectionEnd(PdfWriter arg0, Document arg1, float arg2) {


	}

	@Override
	public void onStartPage(PdfWriter writer, Document doc) {
		if (this.emisor != null)
		if (!this.emisor.contentEquals("admin") ){
			PdfContentByte cb = writer.getDirectContent();
			Image watermark_image = null;
			try {
				watermark_image = Image.getInstance("public/images/watermark3.jpg");
			} catch (BadElementException | IOException e) {
				e.printStackTrace();
			}
	        watermark_image.setAbsolutePosition(0, 100);
			try {
				cb.addImage(watermark_image);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
		}
	}

}
