package classes;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import javax.persistence.Lob;
import java.io.ByteArrayInputStream;
import java.io.IOException;


/* Esta clase sirve para los eventos de los documentos pdf (itextpdf)
   Hace el footer y header para los pdfs
   Toma la imágen de fondo del formulario enviado al método del controlador
   Se le asigna asi:
        PdfFondoPreview auxPie = new PdfFondoPreview();
        docWriter.setPageEvent(auxPie);
 */
public class PdfFondoPreview implements PdfPageEvent {
    //Font ffont = new Font(Font.FontFamily.UNDEFINED, 5, Font.ITALIC);
    public String emisor;
    public String titulo;
    public String direccionDEV;
    @Lob
    public byte[] flujoBytes;


    public byte[] getFlujoBytes() {
        return flujoBytes;
    }


    public void setFlujoBytes(byte[] flujoBytes) {
        this.flujoBytes = flujoBytes;
    }




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
            PdfPCell cell2 = new PdfPCell(new Paragraph(direccionDEV, fontPie));

            cell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell2.setHorizontalAlignment(Element.ALIGN_LEFT);
            cell1.setBorder(Rectangle.NO_BORDER);
            cell2.setBorder(Rectangle.NO_BORDER);


            table.addCell(cell1);
            table.addCell(cell2);

            //table.writeSelectedRows(0, -1, doc.leftMargin(), doc.bottomMargin() - 5, writer.getDirectContent());

            table.writeSelectedRows(0, -1, doc.leftMargin(),  90, writer.getDirectContent());


            if (this.emisor != null) {
                if (this.emisor.contentEquals("formatoOV")) {
                    PdfContentByte cb = writer.getDirectContent();
                    Image imagenFondo = null;
                    System.out.println("intentando con la imagen....");
                    try {
                        //imagenFondo = Image.getInstance(OficiovaloracionFormatoLogo.find.byId(1L).getContenido());
                        System.out.println("....10");
                        System.out.println(".... \n   "+this.getFlujoBytes());
                        ByteArrayInputStream bis = new ByteArrayInputStream(this.getFlujoBytes());
                        System.out.println("....20");
                       // Image image = Image.getInstance(bis);
                        System.out.println("....30");


                        imagenFondo = Image.getInstance(this.getFlujoBytes());
                        //imagenFondo = image;

                        System.out.println("despues de asignar la imagen....");
                        //System.out.println("watermark_image " + imagenFondo);
                    } catch (BadElementException | IOException e) {
                        System.out.println("Error Excepción de bad element-- " + e.getMessage() + "\n" + e.getCause());
                    }
                    assert imagenFondo != null;
                    imagenFondo.setAbsolutePosition(0, 0);

                    System.out.println("depues de posicionar la imagen....");

                    int indentation = 0;
                    float scaler = ((doc.getPageSize().getWidth() - doc.leftMargin()
                            - doc.rightMargin() - indentation) / imagenFondo.getWidth()) * 100;
                    System.out.println("scaler "+scaler);
                    imagenFondo.scalePercent((float) (scaler+3.14));
                    System.out.println("despues de escalar");


                    try {
                        //cb.addImage(imagenFondo);
                        // Mediante el uso de canvas se envía la imagen de fondo realmente al fondo del documento
                        canvas.addImage(imagenFondo);
                        System.out.println("despues de agregar imagen al pdfContentByte....");
                    } catch (DocumentException e) {
                        System.out.println("Error de Excepción de documento -- " + e.getMessage() + "\n" + e.getCause());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción ( ttgbn) "+e.getCause());
        }

    }
}
