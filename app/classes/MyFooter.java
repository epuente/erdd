package classes;

import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.*;
import models.OficiovaloracionFormatoLogo;
import models.ReporteLogo;

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
			//imgUPEV = Image.getInstance("public/images/LogoDEVReporte.png");
            imgUPEV = Image.getInstance(ReporteLogo.find.byId(1L).getContenido());
		} catch (BadElementException | IOException  e) {
            System.out.println("(classes.MyFooter.java) Error con el archivo LogoDEVReporte.png");
			e.printStackTrace();
		}

        Image escudoPoli = null;
        /*
		try {
			//escudoPoli = Image.getInstance(    "public/images/escudoPoli.png");
            escudoPoli = Image.getInstance(ReporteLogo.find.byId(2L).contenido);
		} catch (BadElementException e1) {
            System.out.println("(classes.MyFooter.java) Error con el archivo escudoPoli.png");
			e1.printStackTrace();
		} catch (MalformedURLException e1) {
            System.out.println("(classes.MyFooter.java) Error MalformedURLException");
			e1.printStackTrace();
		} catch (IOException e1) {
            System.out.println("(classes.MyFooter.java) Error IOException (linea 68)");
			e1.printStackTrace();
		}
        */

		try {
			//escudoPoli = Image.getInstance("public/images/ipn-escudo.jpg");
            escudoPoli = Image.getInstance(ReporteLogo.find.byId(2L).getContenido());
		} catch (BadElementException e) {
            System.out.println("(classes.MyFooter.java) Error BadElementException");
			e.printStackTrace();
		} catch (MalformedURLException e) {
            System.out.println("(classes.MyFooter.java) Error MalformedURLException");
            System.out.println("Error -- "+e.getMessage()+"\n"+e.getCause());
        } catch (IOException ioe) {
            System.out.println("(classes.MyFooter.java) Error IOException (linea 82)");
            System.out.println("Error -- "+ioe.getMessage()+"\n"+ioe.getCause());
		}
        assert escudoPoli != null;
        escudoPoli.scaleToFit(46, 59);
        assert imgUPEV != null;
        imgUPEV.scaleToFit(80, 52);
		//doc.add(imgUPEV);


        PdfPTable tablaEnc = new PdfPTable(new float[]{ 1, 3, 1 });
        tablaEnc.setWidthPercentage(100);
        PdfPCell cell = new PdfPCell();
        cell.setBorder(Rectangle.NO_BORDER);
        cell.addElement(escudoPoli);
        tablaEnc.addCell(cell);

        //Font fontbold = FontFactory.getFont("Cournier-bold", 10, Font.BOLD);
        BaseFont baseFontSemiBold;
        Font semiBold = null;
        try {
            baseFontSemiBold = BaseFont.createFont("/public/fonts/NotoSans-SemiBold.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            semiBold =  new Font(baseFontSemiBold, 10);


        } catch (DocumentException e) {
            System.out.println("ocurrió la excepción DocumentException: "+e.getCause());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("ocurrió la excepción IOException: "+e.getCause());
            throw new RuntimeException(e);
        }
        //PdfPCell cell3 = new PdfPCell(new Phrase("INSTITUTO POLITÉCNICO NACIONAL\nSECRETARÍA ACADÉMICA\nDIRECCIÓN DE EDUCACIÓN VIRTUAL\n"+this.titulo,fontbold));
        PdfPCell cell3 = new PdfPCell(new Phrase("INSTITUTO POLITÉCNICO NACIONAL\nSECRETARÍA ACADÉMICA\nDIRECCIÓN DE EDUCACIÓN VIRTUAL\n"+this.titulo,semiBold));
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
		if (this.emisor != null) {
            if (!this.emisor.contentEquals("admin")
                    && !this.emisor.contentEquals("formatoOV")
                    && !this.emisor.contentEquals("detalleETPRDD")) {
                PdfContentByte cb = writer.getDirectContent();
                Image watermark_image = null;
                try {
                    //watermark_image = Image.getInstance("public/images/watermark3.jpg");
                    watermark_image = Image.getInstance(ReporteLogo.find.byId(3L).getContenido());
                } catch (BadElementException | IOException e) {
                    System.out.println("Error Excepción de bad element-- " + e.getMessage() + "\n" + e.getCause());
                }
                assert watermark_image != null;
                watermark_image.setAbsolutePosition(10, 100);
                try {
                    cb.addImage(watermark_image);
                } catch (DocumentException e) {
                    System.out.println("Error de Excepción de documento -- " + e.getMessage() + "\n" + e.getCause());
                }
            }

            if (this.emisor.contentEquals("formatoOV")) {
                PdfContentByte cb = writer.getDirectContent();
                Image watermark_image = null;
                try {
                    //watermark_image = Image.getInstance("public/images/watermark3.jpg");
                    watermark_image = Image.getInstance(OficiovaloracionFormatoLogo.find.byId(1L).getContenido());
                } catch (BadElementException | IOException e) {
                    System.out.println("Error Excepción de bad element-- " + e.getMessage() + "\n" + e.getCause());
                }
                assert watermark_image != null;
                watermark_image.setAbsolutePosition(0, 0);
                try {
                    cb.addImage(watermark_image);
                } catch (DocumentException e) {
                    System.out.println("Error de Excepción de documento -- " + e.getMessage() + "\n" + e.getCause());
                }
            }
        }
	}
}
