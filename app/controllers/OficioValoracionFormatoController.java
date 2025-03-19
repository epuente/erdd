package controllers;


import classes.miPdf;
import classes.PdfFondo;
import classes.PdfFondoPreview;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.SqlRow;
import com.avaje.ebean.Update;
import com.avaje.ebean.annotation.Transactional;
import com.fasterxml.jackson.databind.JsonNode;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import controllers.util.ControladorSeguro;
import models.*;
import models.Version;
import org.json.JSONException;
import org.json.JSONObject;
import play.data.DynamicForm;
import play.data.Form;
import play.libs.Json;
import play.mvc.Http;
import play.mvc.Result;
import views.html.catalogos.OficioValoracionFormato.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static play.data.Form.form;

public class OficioValoracionFormatoController extends ControladorSeguro {

    public static Result list(){
        List<OficiovaloracionFormato> formatos = OficiovaloracionFormato.find.orderBy().asc("id").findList();
        return ok(   list.render( formatos ));
    }

    public static Result create(){
        Form<OficiovaloracionFormato> ovForm = form(OficiovaloracionFormato.class);

        SqlRow sqlrow = Ebean.createSqlQuery("select max(version) as vt from oficiovaloracion_formato ").findUnique();

        int maximo = sqlrow.getInteger("vt");
        return ok (createForm.render(ovForm, (maximo+1) ));
    }

    public static Result edit(Long id){
        System.out.println("Desde OficioValoracionFormatoController.edit");
        OficiovaloracionFormato x = OficiovaloracionFormato.find
                        .fetch("imagenFondo")
                        .where().eq("id", id)
                        .findUnique();

        SqlRow sqlrow = Ebean.createSqlQuery("select max(version) as vt from oficiovaloracion_formato ").findUnique();

        int maximo = sqlrow.getInteger("vt");

        Form<OficiovaloracionFormato> ovForm = form(OficiovaloracionFormato.class).fill(x);
        return ok (editForm.render(ovForm, x.version ));
    }






    public static Result soloFormatoImagen(Long idFormato){
        byte[] r = muestraFormatoBlanco(idFormato);
        response().setContentType("application/pdf");
        response().setHeader("Content-Disposition", "inline");
        System.out.println("---------------------");
        return ok (r);
    }

    // Muestra solo la imagen de fondo en un archivo pdf
    public static byte[] muestraFormatoBlanco(Long idFmto){
        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        String emisor="formatoOV";
        System.out.println("Generando oficio de valoración en blanco en PDF ...");
        OficiovaloracionFormato ovf = OficiovaloracionFormato.find
                .byId(idFmto);
        Document doc = new Document(PageSize.LETTER, 40,40,140,95);
        PdfWriter docWriter;
        try {
            docWriter = PdfWriter.getInstance(doc, baosPDF);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

        BaseFont baseFont;
        BaseFont baseFontBold;
        BaseFont baseMontserrat = null;

        Font fontMontserrat;







        //Encabezado del reporte pdf
        PdfFondo auxPie = new PdfFondo();
        auxPie.emisor = emisor;
        auxPie.titulo = "Reporte de Evaluación Técnico Pedagógica";
        docWriter.setPageEvent(auxPie);

        doc.addTitle("Reporte de Evaluación Técnico Pedagógica");
        doc.addCreationDate();
        doc.addCreator("SERDD");

        PdfPTable tablaInicial = new PdfPTable(6);
        tablaInicial.setWidthPercentage(100);
        //tablaInicial.setSpacingBefore(5);
        tablaInicial.setSpacingAfter(-12);
        PdfPCell celdaInicial = new PdfPCell();
        //celdaInicial.setPaddingLeft(6f);
        //celdaInicial.setBorderColor(BaseColor.LIGHT_GRAY);


        doc.open();


        // Cuerpo1


        // inicia tabla


        // cuerpo2   (resultado de la evaluación)

        // despedida

        // despedida director dev

        // c.c.p.
        // Datos de la direccion  correspondiente (EMS, ES o Posgrado)

        // iniciales

        // folio recepción


        // CCD 2023

        doc.close();
        docWriter.close();
        return baosPDF.toByteArray();
    }


    // Muestra el formato del oficio de valoración con sus secciones
    // Toma los parametros del formulario que lo llama
    // Recibe los parametros como json
    public static Result previewFormato() throws JSONException {
        System.out.println("\n\n\nDesde OficioValoracionFormatoController.previewFormato");
        JsonNode json = request().body().asJson();

        //System.out.println(json);

        String encabezado = json.findValue("encabezado").textValue();
        String asunto = json.findValue("asunto").textValue();
        String cuerpo1 = json.findValue("cuerpo1").textValue();
        String cuerpo2 = json.findValue("cuerpo2").textValue();
        String cuerpo3 = json.findValue("cuerpo3").textValue();
        String cuerpo4 = json.findValue("cuerpo4").textValue();
        String cuerpo5 = json.findValue("cuerpo5").textValue();
        String despedida = json.findValue("despedida").textValue();
        String direccionDEV = json.findValue("direccionDEV").textValue();

        // Upload directo
        //Save to file
        InputStream is = null;
        byte[] byteFile = null;
        if (1==2) {
            try {
                System.out.println(" --PROBANDO DIRECT UPLOAD--");
                is = new FileInputStream(request().body().asRaw().asFile());

                File file = request().body().asRaw().asFile();
                Path p = Paths.get(file.getPath());
                byteFile = Files.readAllBytes(p);

                String contentType = request().getHeader("Content-Type");
                String nombreArchivo = file.getName();

                System.out.println(contentType);
                System.out.println(nombreArchivo);

            } catch (FileNotFoundException e) {
                System.out.println("Ocurrío una excepción de archivo no encontrado " + e.getMessage());
                throw new RuntimeException(e);
            } catch (IOException ioe) {
                System.out.println("Ocurrío una excepción de IO " + ioe.getMessage());
                throw new RuntimeException(ioe);
            }
        }
        String fecha =  "10-03-2025";
        String recepcion = "000/2025";
        String iniciales = "ABC/DEF/GHI/jkl";

        byte[] r = previewGeneraOficioValoracionByte(
                                                        encabezado, asunto,
                                                        cuerpo1, cuerpo2, cuerpo3, cuerpo4, cuerpo5,
                                                        despedida, direccionDEV,
                                                        5, "DEV/000/0000/2025",
                                                        fecha, recepcion, iniciales,
                                                        byteFile);
        response().setContentType("application/pdf");
        response().setHeader("Content-Disposition", "inline");
        return ok (r);
    }


    // Regresa el pdf generado como un arreglo de bytes
    // Toma la imagen de fondo de la DB
    private static byte[] previewGeneraOficioValoracionByte(
            String encabezado, String asunto, String cuerpo1, String cuerpo2, String cuerpo3, String cuerpo4, String cuerpo5, String despedida, String  direccionDEV,
            long idFmto, String folio, String fecha, String folRecepcion, String iniciales,
            byte[] byteFile){
        SimpleDateFormat sdf0 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("d 'de' MMMM 'de' yyyy");

        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        miPdf mipdf = new miPdf(idFmto);
        mipdf.baos = baosPDF;

        String emisor="formatoOV";

        Document doc = new Document(PageSize.LETTER, 40,40,140,95);
        PdfWriter docWriter;
        try {
            docWriter = PdfWriter.getInstance(doc, mipdf.baos);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

        BaseFont baseFont;
        BaseFont baseFontBold;
        BaseFont baseMontserrat = null;

        Font fontMontserrat;



        try {
            baseFont = BaseFont.createFont("/public/fonts/NotoSans-Regular.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            baseFontBold = BaseFont.createFont("/public/fonts/NotoSans-Bold.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            baseMontserrat = BaseFont.createFont("/public/fonts/Montserrat-Regular.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

        } catch (DocumentException e) {
            System.out.println("Excepcionnnnnn "+e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Font fontboldTitulo = new Font(baseFontBold, 10);
        Font fontbold = new Font(baseFontBold, 10);
        Font fontCuerpo =  new Font(baseFont, 9);
        fontMontserrat = new Font(baseMontserrat, 7);


        //Encabezado del reporte pdf
        PdfFondo auxPie = new PdfFondo();
        auxPie.emisor = emisor;
        auxPie.titulo = "Reporte de Evaluación Técnico Pedagógica";
        docWriter.setPageEvent(auxPie);

        doc.addTitle("Reporte de Evaluación Técnico Pedagógica");
        doc.addCreationDate();
        doc.addCreator("SERDD");

        try {
            PdfPTable tablaInicial = new PdfPTable(6);
            tablaInicial.setWidthPercentage(100);
            tablaInicial.setSpacingAfter(-12);
            PdfPCell celdaInicial = new PdfPCell();

            Paragraph parrafo = new Paragraph();
            parrafo.setFont(fontMontserrat);
            parrafo.setSpacingBefore(10f);
            parrafo.setAlignment(Element.ALIGN_LEFT);
            parrafo.setMultipliedLeading(1.1f);

            doc.open();

            PdfPTable tabla = new PdfPTable(tablaInicial);
            PdfPCell celda = new PdfPCell( celdaInicial  );
            // label folio (que en realidad es el número de oficio)
            celda.setPhrase(new Phrase("Folio", fontbold));
            celda.setColspan(3);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);

            celda = new PdfPCell( new Phrase(encabezado, fontboldTitulo)  );
            celda.setPadding(5);
            celda.setColspan(3);
            celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);

            doc.add(tabla);

            // folio (número de oficio)
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase( new Phrase(folio,fontCuerpo));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // Label Asunto
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(40);
            tabla.setSpacingBefore(25);
            tabla.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Asunto", fontbold));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            //Asunto
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase(asunto, fontCuerpo));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // fecha
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_RIGHT);

            Date laFecha = sdf0.parse(fecha);

            System.out.println("cadena recibida "+fecha);
            System.out.println("fecha convertida "+laFecha);
            System.out.println("fecha convertida formato dd-mm-yyyy "+sdf0.format(laFecha));
            System.out.println("fecha convertida "+sdf.format(laFecha));

            celda.setPhrase(new Phrase("Ciudad de México, "+ sdf.format(laFecha)  , fontCuerpo));

            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // Para
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);

            celda.setHorizontalAlignment(Element.ALIGN_LEFT);

            String textoDirector = "[nombreDirector]\nDirector(a) de el(la) unidad académica del Instituto Politécnico Nacional\nPRESENTE";


            parrafo.setFont(fontbold);
            parrafo.setAlignment(Element.ALIGN_JUSTIFIED);
            parrafo.add(textoDirector);
            doc.add(parrafo);

            // Cuerpo1
            String folioOficioSolicitud = " folioDeLaSolicitud";
            String folioOficioSolicitudRecibido = "fechaSolicitudREcibido";

            System.out.println("cuerpo1 "+cuerpo1);
            System.out.println("folioOficioSolicitud "+folioOficioSolicitud);

            String stringAux = cuerpo1
                    .replace("[folio]", folioOficioSolicitud)
                    .replace("[fechaFolio]", folioOficioSolicitudRecibido);
            parrafo.clear();
            parrafo.setFont(fontCuerpo);
            parrafo.add(stringAux);
            doc.add(parrafo);
            System.out.println("...fin de cuerpo1");


            // inicia tabla
            String ua = "";
            String titulo = "nombre del RDD";
            String autores = "";

            //List<String> lstAutores = r.autores.stream().map(m -> m.nombreCompleto()).collect(Collectors.toList());

            List<String> lstAutores = new ArrayList<>();

            autores = String.join(", ", lstAutores);
            tabla = new PdfPTable(2);
            tabla.setWidths(new int[]{80,200});
            tabla.setWidthPercentage(100);
            //tabla.setSpacingBefore(2);
            // tabla rdd (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);  celda.setPaddingBottom(6f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("RDD"  , fontbold));
            tabla.addCell(celda);

            // tabla rdd (valor)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla autores (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Autores"  , fontbold));
            tabla.addCell(celda);

            // tabla autores (valores)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f); celda.setPaddingBottom(6f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla Unidad académica (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Unidad académica"  , fontbold));
            tabla.addCell(celda);

            // tabla Unidad académica (valor)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f); celda.setPaddingBottom(6f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla nivel (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Nivel"  , fontbold));
            tabla.addCell(celda);

            // tabla nivel (valor)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla área conocimiento (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Área de conocimiento"  , fontbold));
            tabla.addCell(celda);

            // tabla área conocimiento (valor)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla version (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("Versión"  , fontbold));
            tabla.addCell(celda);

            // tabla version (valor)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla categoría (calificacion)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Categoría"  , fontbold));
            tabla.addCell(celda);

            //
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("  " , fontCuerpo));
            tabla.addCell(celda);

            tabla.setSpacingBefore(10f);
            doc.add(tabla);
            // termimna tabla

            // cuerpo2   (resultado de la evaluación)
            String evaluacion = "Calificación";
            String aux2 = cuerpo2
                    .replace("[evaluación]", evaluacion);
            parrafo.clear();
            parrafo.add(aux2);
            doc.add(parrafo);
            System.out.println("...fin de cuerpo2");

            // alojado (tiene url?) / cuerpo3
            boolean usaCuenta = true;
            parrafo.clear();
            parrafo.add(cuerpo3);
            doc.add(parrafo);
            // ¿requiere user/pass?  cuerpo4 y cuerpo5
            if (usaCuenta){
                parrafo.clear();
                parrafo.add(cuerpo4);
                doc.add(parrafo);
            } else {
                parrafo.clear();
                parrafo.add(cuerpo5);
                doc.add(parrafo);
            }




            System.out.println("...fin de acceso");



            // despedida
            if (despedida!=null){
                parrafo.clear();
                parrafo.add(despedida);
                doc.add(parrafo);
                System.out.println("...fin de despedida");
            }

            // despedida director dev
            String textoDirectorDEV = "[directorDEV]";
            String directorDevGenero  = "";

            parrafo.clear();
            parrafo.setFont(fontbold);
            parrafo.add("ATENTAMENTE\n\"La Técnica al servicio de la Patria\"\n"+textoDirectorDEV+"\nDirector"+directorDevGenero);
            doc.add(parrafo);
            System.out.println("...fin de ATENTAMENTE");

            // c.c.p.
            // Datos de la direccion  correspondiente (EMS, ES o Posgrado)
            String textoDirNivel="";

            textoDirNivel = "nombre del director de EMS o ES o posgrado del IPN. Para su conocimiento.";




            tabla = new PdfPTable(2);
            tabla.setWidths(new int[]{10,200});
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase( "c.c.p. " , fontMontserrat));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            celda.setPhrase(new Phrase( textoDirNivel+"\nInteresado."  , fontMontserrat));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // iniciales
            if (iniciales!=null && !iniciales.isEmpty()){
                parrafo.clear();
                parrafo.setSpacingBefore(2f);
                parrafo.setFont(fontMontserrat);
                parrafo.add(iniciales);
                doc.add(parrafo);
            }


            // folio recepción
            parrafo.clear();
            parrafo.setSpacingBefore(2f);
            parrafo.setFont(fontMontserrat);
            parrafo.add("Folio recepción: "+folRecepcion);
            doc.add(parrafo);


            // CCD 2023
            parrafo.clear();
            parrafo.setSpacingBefore(2f);
            parrafo.setFont(fontMontserrat);
            parrafo.add("CCD 2023: [¿?]");
            doc.add(parrafo);

        } catch (DocumentException e) {
            System.out.println("Error. Ocurrió una excepción (¿?) "+e.getMessage());
            throw new RuntimeException(e);
        } catch (ParseException e) {
            System.out.println("Error en la conversion - (ParseException)");
            throw new RuntimeException(e);
        }
        doc.close();
        docWriter.close();
        return mipdf.baos.toByteArray();
    }



    // Recibe la forma via formdata
    public static Result previewFormato2()  {
        System.out.println("\n\n\nDesde OficioValoracionFormatoController.previewFormato2");
        Form<OficiovaloracionFormato> forma = form(OficiovaloracionFormato.class).bindFromRequest();
        System.out.println(forma);

        String encabezado = forma.field("encabezado").value();
        String asunto = forma.field("asunto").value();
        String cuerpo1 = forma.field("cuerpo1").value();
        String cuerpo2 = forma.field("cuerpo2").value();
        String cuerpo3 = forma.field("cuerpo3").value();
        String cuerpo4 = forma.field("cuerpo4").value();
        String cuerpo5 = forma.field("cuerpo5").value();
        String despedida = forma.field("despedida").value();
        String direccionDEV = forma.field("direccionDEV").value();
        String version = forma.field("laVersion").value();

        InputStream is = null;
        byte[] byteFile = null;

        try {
            System.out.println("....¿?");
            Http.MultipartFormData body = request().body().asMultipartFormData();
            Http.MultipartFormData.FilePart filePart = body.getFile("file");
            System.out.println("....fp "+filePart);
            System.out.println("....version "+version);
            // Se eligió un nuevo archivo para el fondo
            if (filePart != null) {
                String fileName = filePart.getFilename();
                File file = filePart.getFile();
                Path p = Paths.get(file.getPath());
                byteFile = Files.readAllBytes(p);
                String contentType = filePart.getContentType();
                System.out.println(contentType);
                System.out.println(fileName);
            } else {
                // No se eligió un nuevo archivo para el fondo, se toma el que tiene en la db
                if (version != null) {
                    OficiovaloracionFormato ovf = Ebean.find(OficiovaloracionFormato.class)
                            .fetch("imagenFondo").where().eq("version", Long.parseLong(version)).findUnique();
                    if (ovf != null) {
                        byteFile = ovf.getImagenFondo().getContenido();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ocurrío una excepción de archivo no encontrado " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException ioe) {
            System.out.println("Ocurrío una excepción de IO " + ioe.getMessage());
            throw new RuntimeException(ioe);
        }

        String fecha =  "10-03-2025";
        String recepcion = "000/2025";
        String iniciales = "ABC/DEF/GHI/jkl";

        byte[] r = previewFormaGeneraOficioValoracionByte(
                encabezado, asunto,
                cuerpo1, cuerpo2, cuerpo3, cuerpo4, cuerpo5,
                despedida, direccionDEV,
                5, "DEV/000/0000/2025",
                fecha, recepcion, iniciales,
                byteFile);
        response().setContentType("application/pdf");
        response().setHeader("Content-Disposition", "inline");
        return ok (r);
    }




    public static Result upload() throws IOException {
        Http.MultipartFormData body = request().body().asMultipartFormData();
        DynamicForm df = form().bindFromRequest();
        System.out.println("Desde upload");
        System.out.println(df);
        Http.MultipartFormData.FilePart filePart = body.getFile("file");

        String encabezado = df.get("encabezado");
        String asunto = df.get("asunto");
        String cuerpo1 = df.get("cuerpo1");
        String cuerpo2 = df.get("cuerpo2");
        String cuerpo3 = df.get("cuerpo3");
        String cuerpo4 = df.get("cuerpo4");
        String cuerpo5 = df.get("cuerpo5");
        String despedida = df.get("despedida");
        String direccionDEV = df.get("direccionDEV");

        String fecha =  "10-03-2025";
        String recepcion = "000/2025";
        String iniciales = "ABC/DEF/GHI/jkl";
        byte[] byteFile = null;

        System.out.println("encabezado"+df.get("encabezado"));



        if (filePart != null) {
            String fileName = filePart.getFilename();
            File file = filePart.getFile();

            Path p = Paths.get(file.getPath());
            byteFile = Files.readAllBytes(p);


            System.out.println("filename "+fileName);
            System.out.println("contentype "+filePart.getContentType());

            // Aquí puedes procesar el archivo, por ejemplo, guardarlo en el servidor
            System.out.println("File uploaded: " + fileName);
        }
        //else {
        //    return badRequest("File not found in request.");
        //}
        byte[] r = previewGeneraOficioValoracionByte(
                encabezado, asunto,
                cuerpo1, cuerpo2, cuerpo3, cuerpo4, cuerpo5,
                despedida, direccionDEV,
                5, "DEV/000/0000/2025",
                fecha, recepcion, iniciales,
                byteFile);
        response().setContentType("application/pdf");
        response().setHeader("Content-Disposition", "inline");
        return ok (r);
    }



    // Arma el oficio de valoración con la info del formulario
    // Toma la imagen de fondo del formulario
    // Regresa el pdf generado como un arreglo de bytes
    private static byte[] previewFormaGeneraOficioValoracionByte(
            String encabezado, String asunto, String cuerpo1, String cuerpo2, String cuerpo3, String cuerpo4, String cuerpo5, String despedida, String  direccionDEV,
            long idFmto, String folio, String fecha, String folRecepcion, String iniciales,
            byte[] byteFile){

        System.out.println("\n\n\n\n\n\nDesde OficioValoracionFormatoController.previewFormaGeneraOficioValoracionByte......");

        System.out.println(".... byteFile "+(byteFile==null));

        SimpleDateFormat sdf0 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("d 'de' MMMM 'de' yyyy");

        ByteArrayOutputStream baosPDF = new ByteArrayOutputStream();
        miPdf mipdf = new miPdf(idFmto);
        mipdf.baos = baosPDF;

        String emisor="formatoOV";

        Document doc = new Document(PageSize.LETTER, 40,40,140,95);
        PdfWriter docWriter;
        try {
            docWriter = PdfWriter.getInstance(doc, mipdf.baos);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }

        BaseFont baseFont;
        BaseFont baseFontBold;
        BaseFont baseMontserrat = null;

        Font fontMontserrat;



        try {
            baseFont = BaseFont.createFont("/public/fonts/NotoSans-Regular.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            baseFontBold = BaseFont.createFont("/public/fonts/NotoSans-Bold.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

            baseMontserrat = BaseFont.createFont("/public/fonts/Montserrat-Regular.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);

        } catch (DocumentException e) {
            System.out.println("Excepcionnnnnn "+e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Font fontboldTitulo = new Font(baseFontBold, 10);
        Font fontbold = new Font(baseFontBold, 10);
        Font fontCuerpo =  new Font(baseFont, 9);
        fontMontserrat = new Font(baseMontserrat, 7);


        //Encabezado/pie del reporte pdf con el archivo de imagen que esta en el formulario (no del que esta en la DB)
        PdfFondoPreview auxPie = new PdfFondoPreview();
        auxPie.emisor = emisor;
        auxPie.titulo = "Reporte de Evaluación Técnico Pedagógica";
        auxPie.setFlujoBytes(byteFile);
        auxPie.direccionDEV= direccionDEV;
        docWriter.setPageEvent(auxPie);

        doc.addTitle("Formato para el oficio de valoración");
        doc.addCreationDate();
        doc.addCreator("SERDD");

        try {
            PdfPTable tablaInicial = new PdfPTable(6);
            tablaInicial.setWidthPercentage(100);
            tablaInicial.setSpacingAfter(-12);
            PdfPCell celdaInicial = new PdfPCell();

            Paragraph parrafo = new Paragraph();
            parrafo.setFont(fontMontserrat);
            parrafo.setSpacingBefore(10f);
            parrafo.setAlignment(Element.ALIGN_LEFT);
            parrafo.setMultipliedLeading(1.1f);

            doc.open();

            PdfPTable tabla = new PdfPTable(tablaInicial);
            PdfPCell celda = new PdfPCell( celdaInicial  );
            // label folio (que en realidad es el número de oficio)
            celda.setPhrase(new Phrase("Folio", fontbold));
            celda.setColspan(3);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);

            celda = new PdfPCell( new Phrase(encabezado, fontboldTitulo)  );
            celda.setPadding(5);
            celda.setColspan(3);
            celda.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);

            doc.add(tabla);

            // folio (número de oficio)
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase( new Phrase(folio,fontCuerpo));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // Label Asunto
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(40);
            tabla.setSpacingBefore(25);
            tabla.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Asunto", fontbold));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            //Asunto
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase(asunto, fontCuerpo));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // fecha
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_RIGHT);

            Date laFecha = sdf0.parse(fecha);

            System.out.println("cadena recibida "+fecha);
            System.out.println("fecha convertida "+laFecha);
            System.out.println("fecha convertida formato dd-mm-yyyy "+sdf0.format(laFecha));
            System.out.println("fecha convertida "+sdf.format(laFecha));

            celda.setPhrase(new Phrase("Ciudad de México, "+ sdf.format(laFecha)  , fontCuerpo));

            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // Para
            tabla = new PdfPTable(1);
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);

            celda.setHorizontalAlignment(Element.ALIGN_LEFT);

            String textoDirector = "[nombreDirector]\nDirector(a) de el(la) unidad académica del Instituto Politécnico Nacional\nPRESENTE";


            parrafo.setFont(fontbold);
            parrafo.setAlignment(Element.ALIGN_JUSTIFIED);
            parrafo.add(textoDirector);
            doc.add(parrafo);

            // Cuerpo1
            String folioOficioSolicitud = " folioDeLaSolicitud";
            String folioOficioSolicitudRecibido = "fechaSolicitudREcibido";

            System.out.println("cuerpo1 "+cuerpo1);
            System.out.println("folioOficioSolicitud "+folioOficioSolicitud);

            String stringAux = cuerpo1
                    .replace("[folio]", folioOficioSolicitud)
                    .replace("[fechaFolio]", folioOficioSolicitudRecibido);
            parrafo.clear();
            parrafo.setFont(fontCuerpo);
            parrafo.add(stringAux);
            doc.add(parrafo);
            System.out.println("...fin de cuerpo1");


            // inicia tabla
            String ua = "";
            String titulo = "nombre del RDD";
            String autores = "";

            //List<String> lstAutores = r.autores.stream().map(m -> m.nombreCompleto()).collect(Collectors.toList());

            List<String> lstAutores = new ArrayList<>();

            autores = String.join(", ", lstAutores);
            tabla = new PdfPTable(2);
            tabla.setWidths(new int[]{80,200});
            tabla.setWidthPercentage(100);
            //tabla.setSpacingBefore(2);
            // tabla rdd (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);  celda.setPaddingBottom(6f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("RDD"  , fontbold));
            tabla.addCell(celda);

            // tabla rdd (valor)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla autores (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Autores"  , fontbold));
            tabla.addCell(celda);

            // tabla autores (valores)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f); celda.setPaddingBottom(6f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla Unidad académica (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Unidad académica"  , fontbold));
            tabla.addCell(celda);

            // tabla Unidad académica (valor)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f); celda.setPaddingBottom(6f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla nivel (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Nivel"  , fontbold));
            tabla.addCell(celda);

            // tabla nivel (valor)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla área conocimiento (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Área de conocimiento"  , fontbold));
            tabla.addCell(celda);

            // tabla área conocimiento (valor)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla version (label)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("Versión"  , fontbold));
            tabla.addCell(celda);

            // tabla version (valor)
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("  "  , fontCuerpo));
            tabla.addCell(celda);

            // tabla categoría (calificacion)
            celda = new PdfPCell(celdaInicial);
            celda.setPaddingLeft(6f);
            celda.setMinimumHeight(20f);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase("Categoría"  , fontbold));
            tabla.addCell(celda);

            //
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPaddingLeft(6f); celda.setMinimumHeight(20f);
            celda.setPhrase(new Phrase("  " , fontCuerpo));
            tabla.addCell(celda);

            tabla.setSpacingBefore(10f);
            doc.add(tabla);
            // termimna tabla

            // cuerpo2   (resultado de la evaluación)
            String evaluacion = "Calificación";
            String aux2 = cuerpo2
                    .replace("[evaluación]", evaluacion);
            parrafo.clear();
            parrafo.add(aux2);
            doc.add(parrafo);
            System.out.println("...fin de cuerpo2");

            // alojado (tiene url?) / cuerpo3
            boolean usaCuenta = true;
            parrafo.clear();
            parrafo.add(cuerpo3);
            doc.add(parrafo);
            // ¿requiere user/pass?  cuerpo4 y cuerpo5
            if (usaCuenta){
                parrafo.clear();
                parrafo.add(cuerpo4);
                doc.add(parrafo);
            } else {
                parrafo.clear();
                parrafo.add(cuerpo5);
                doc.add(parrafo);
            }




            System.out.println("...fin de acceso");



            // despedida
            if (despedida!=null){
                parrafo.clear();
                parrafo.add(despedida);
                doc.add(parrafo);
                System.out.println("...fin de despedida");
            }

            // despedida director dev
            String textoDirectorDEV = "[directorDEV]";
            String directorDevGenero  = "";

            parrafo.clear();
            parrafo.setFont(fontbold);
            parrafo.add("ATENTAMENTE\n\"La Técnica al servicio de la Patria\"\n"+textoDirectorDEV+"\nDirector"+directorDevGenero);
            doc.add(parrafo);
            System.out.println("...fin de ATENTAMENTE");

            // c.c.p.
            // Datos de la direccion  correspondiente (EMS, ES o Posgrado)
            String textoDirNivel="";

            textoDirNivel = "nombre del director de EMS o ES o posgrado del IPN. Para su conocimiento.";




            tabla = new PdfPTable(2);
            tabla.setWidths(new int[]{10,200});
            tabla.setWidthPercentage(100);
            tabla.setSpacingBefore(10);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_LEFT);
            celda.setPhrase(new Phrase( "c.c.p. " , fontMontserrat));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            celda = new PdfPCell(celdaInicial);
            celda.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
            celda.setPhrase(new Phrase( textoDirNivel+"\nInteresado."  , fontMontserrat));
            celda.setBorder(Rectangle.NO_BORDER);
            tabla.addCell(celda);
            doc.add(tabla);

            // iniciales
            if (iniciales!=null && !iniciales.isEmpty()){
                parrafo.clear();
                parrafo.setSpacingBefore(2f);
                parrafo.setFont(fontMontserrat);
                parrafo.add(iniciales);
                doc.add(parrafo);
            }


            // folio recepción
            parrafo.clear();
            parrafo.setSpacingBefore(2f);
            parrafo.setFont(fontMontserrat);
            parrafo.add("Folio recepción: "+folRecepcion);
            doc.add(parrafo);


            // CCD 2023
            parrafo.clear();
            parrafo.setSpacingBefore(2f);
            parrafo.setFont(fontMontserrat);
            parrafo.add("CCD 2023: [¿?]");
            doc.add(parrafo);

        } catch (DocumentException e) {
            System.out.println("Error. Ocurrió una excepción (DocumentException) "+e.getCause());
            throw new RuntimeException(e);
        } catch (ParseException e) {
            System.out.println("Error en la conversion - (ParseException)");
            throw new RuntimeException(e);
        }
        doc.close();
        docWriter.close();
        return mipdf.baos.toByteArray();
    }


    // Graba un nuevo formato del oficio de valoracion que esta en el visor en la ventana modal
    // Recibe un formdata
    @Transactional
    public static Result saveFormato() throws IOException, JSONException {
        System.out.println("\n\n\nDesde OficioValoracionFormatoController.saveFormato");
        Form<OficiovaloracionFormato> forma = form(OficiovaloracionFormato.class).bindFromRequest();
        System.out.println(forma);

        JSONObject jObject = new JSONObject();
        jObject.put("estado", "error");

        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart filePart = body.getFile("file");
        byte[] byteFile;

        Form<OficiovaloracionFormato> aForm = form(OficiovaloracionFormato.class).bindFromRequest();
        OficiovaloracionFormato objeto = aForm.get();

        System.out.println("....fp "+filePart);
        if (filePart != null) {
            String fileName = filePart.getFilename();
            File file = filePart.getFile();
            Path p = Paths.get(file.getPath());
            byteFile = Files.readAllBytes(p);
            String contentType = filePart.getContentType();
            System.out.println(contentType);
            System.out.println(fileName);

            OficiovaloracionFormatoLogo fondo = new OficiovaloracionFormatoLogo();
            fondo.oficiovaloracionformato = objeto;
            fondo.nombrearchivo = fileName;
            fondo.contenttype = contentType;
            fondo.setContenido(byteFile);

            objeto.setImagenFondo(fondo);
        }

        // ¿Este es el activo?
        if (objeto.activo){
            List<OficiovaloracionFormato> z = OficiovaloracionFormato.find.where().eq("activo", true).findList();
            z.forEach(y -> {
                y.activo = false;
                y.update();
            });
        }

        objeto.save();
        jObject.put("estado", "agregado");
        jObject.put("mensaje", "Se ha agregado correctamente la versión "+objeto.version+". <br>");
        return ok(  Json.parse(jObject.toString()) );
    }


    // Actualiza el formato del oficio de valoración que esta en el visor en la ventana modal
    // Recibe un formdata
    @Transactional
    public static Result updateFormato() throws IOException, JSONException {
        System.out.println("\n\n\nDesde OficioValoracionFormatoController.updateFormato");
        Form<OficiovaloracionFormato> forma = form(OficiovaloracionFormato.class).bindFromRequest();
        System.out.println(forma);
        String version = forma.field("laVersion").value();

        OficiovaloracionFormato ovf = OficiovaloracionFormato.find.where().eq("version", version).findUnique();
        System.out.println("en DB: "+ovf.id);
        System.out.println("version: "+version);

        JSONObject jObject = new JSONObject();
        jObject.put("estado", "error");
        jObject.put("mensaje", "No fue posible la actualización del formato de la versión "+version);

        Http.MultipartFormData body = request().body().asMultipartFormData();
        Http.MultipartFormData.FilePart filePart = body.getFile("file");
        byte[] byteFile;

        Form<OficiovaloracionFormato> aForm = form(OficiovaloracionFormato.class).bindFromRequest();
        OficiovaloracionFormato objeto = aForm.get();

        System.out.println("....fp "+filePart);
        if (filePart != null) {
            String fileName = filePart.getFilename();
            File file = filePart.getFile();
            Path p = Paths.get(file.getPath());
            byteFile = Files.readAllBytes(p);
            String contentType = filePart.getContentType();
            System.out.println(contentType);
            System.out.println(fileName);

            OficiovaloracionFormatoLogo fondo = new OficiovaloracionFormatoLogo();
            fondo.oficiovaloracionformato = objeto;
            fondo.nombrearchivo = fileName;
            fondo.contenttype = contentType;
            fondo.setContenido(byteFile);

            objeto.setImagenFondo(fondo);
        }
        objeto.id = ovf.id;
       // objeto.activo = activo;
        objeto.version = ovf.version;


        // ¿Este es el activo?
        if (objeto.activo){
            List<OficiovaloracionFormato> z = OficiovaloracionFormato.find.where().eq("activo", true).findList();
            z.forEach(y -> {
                y.activo = false;
                y.update();
            });
        }

        objeto.update();

        jObject.put("estado", "actualizado");
        jObject.put("mensaje", "Se actualizó el formato de la versión "+objeto.version+".<br>");
        return ok (Json.parse(jObject.toString()));
    }


}
