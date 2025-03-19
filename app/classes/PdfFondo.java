package classes;

import java.io.IOException;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import models.OficiovaloracionFormato;
import models.OficiovaloracionFormatoLogo;
import models.ReporteLogo;

/* Esta clase sirve para los eventos de los documentos pdf (itextpdf)
   Hace el footer y header para los pdfs
   Toma la imágen de fondo de la db
   Se le asigna asi:
        PdfFondo auxPie = new PdfFondo();
        docWriter.setPageEvent(auxPie);
 */
public class PdfFondo implements PdfPageEvent {
    //Font ffont = new Font(Font.FontFamily.UNDEFINED, 5, Font.ITALIC);
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
        document.setMargins(40, 40, 230, 75);

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
        try {
            PdfContentByte canvas = writer.getDirectContentUnder();
            // Texto de la dirección de la DEV
            OficiovaloracionFormato f = OficiovaloracionFormato.find.byId(1L);
            BaseFont baseMontserrat = BaseFont.createFont("/public/fonts/Montserrat-Regular.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            BaseFont baseGeomanist = BaseFont.createFont("/public/fonts/geomanist-medium.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
            //Font fontFooter = FontFactory.getFont("Cournier", 7);
            Font fontFooter = new Font(baseMontserrat, 7);

            PdfPTable table = new PdfPTable(2);
            table.setWidthPercentage(100);
            table.setWidths(new int[]{75, 200});
            table.setTotalWidth(doc.getPageSize().getWidth() - doc.leftMargin() - doc.rightMargin());

            BaseColor baseColorPie = new BaseColor(77, 25, 42); // color poli
            Font fontPie = new Font(baseGeomanist, 7, Font.NORMAL,  baseColorPie);

            PdfPCell cell1 = new PdfPCell(new Paragraph("", fontFooter));
            //PdfPCell cell2 = new PdfPCell(new Paragraph(f.direccionDEV, fontFooter));
            PdfPCell cell2 = new PdfPCell(new Paragraph(f.direccionDEV, fontPie));

            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell1.setBorder(Rectangle.NO_BORDER);
            cell2.setBorder(Rectangle.NO_BORDER);


            table.addCell(cell1);
            table.addCell(cell2);

            //table.writeSelectedRows(0, -1, doc.leftMargin(), doc.bottomMargin() - 5, writer.getDirectContent());

            table.writeSelectedRows(0, -1, doc.leftMargin(),  90, writer.getDirectContent());


            if (this.emisor != null) {
                if (!this.emisor.contentEquals("admin") && !this.emisor.contentEquals("formatoOV")) {
                    PdfContentByte cb = writer.getDirectContent();
                    Image imagen = null;
                    try {
                        //watermark_image = Image.getInstance("public/images/watermark3.jpg");
                        imagen = Image.getInstance(ReporteLogo.find.byId(3L).getContenido());

                        imagen.scaleAbsolute(2550,3300);
                    } catch (BadElementException | IOException e) {
                        System.out.println("Error Excepción de bad element-- " + e.getMessage() + "\n" + e.getCause());
                    }
                    assert imagen != null;
                    imagen.setAbsolutePosition(10, 100);

                    try {
                        cb.addImage(imagen);
                    } catch (DocumentException e) {
                        System.out.println("Error de Excepción de documento -- " + e.getMessage() + "\n" + e.getCause());
                    }
                }

                if (this.emisor.contentEquals("formatoOV")) {
                    PdfContentByte cb = writer.getDirectContent();
                    Image imagenFondo = null;
                    try {
                        //watermark_image = Image.getInstance("public/images/watermark3.jpg");
                        imagenFondo = Image.getInstance(OficiovaloracionFormatoLogo.find.byId(1L).getContenido());

                        //System.out.println("watermark_image " + imagenFondo);
                    } catch (BadElementException | IOException e) {
                        System.out.println("Error Excepción de bad element-- " + e.getMessage() + "\n" + e.getCause());
                    }
                    assert imagenFondo != null;
                    imagenFondo.setAbsolutePosition(0, 0);


                    int indentation = 0;
                    float scaler = ((doc.getPageSize().getWidth() - doc.leftMargin()
                            - doc.rightMargin() - indentation) / imagenFondo.getWidth()) * 100;
                    System.out.println("scaler "+scaler);
                    imagenFondo.scalePercent((float) (scaler+3.14));


                    try {
                        //cb.addImage(imagenFondo);
                        canvas.addImage(imagenFondo);
                    } catch (DocumentException e) {
                        System.out.println("Error de Excepción de documento -- " + e.getMessage() + "\n" + e.getCause());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción  (332dg)"+e.getMessage());
        }

    }
}
