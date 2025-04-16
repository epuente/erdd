package classes;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import models.Recurso;
import models.RecursoAutor;
import models.ReporteLogo;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.util.Units;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;
import play.mvc.Result;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Calendar;

public class miWord {
    public Long id;
    private String numControl;
    public ByteArrayOutputStream baos;

    public miWord(Long id) {
        this.id = id;
        Recurso r = Recurso.find.byId(this.id);
        if (r!= null && r.numcontrol!=null && !r.numcontrol.isEmpty())
            this.numControl = Recurso.find.byId(this.id).numcontrol;
    }


    public void generarSolicitudEvaluacionWord() throws IOException {
        int tamFuente = 9;
        Recurso r = Recurso.find.fetch("recursosenweb")
                .where().eq("id",this.id)
                //.orderBy("autores.autorfuncion.id")
                .findUnique();
        try (XWPFDocument doc = new XWPFDocument()) {


            // Configurar márgenes
            CTPageMar pageMar = doc.getDocument().getBody().addNewSectPr().addNewPgMar();
            pageMar.setLeft(720);   // Margen izquierdo en twips (1/20 de punto)
            pageMar.setRight(720);  // Margen derecho
            pageMar.setTop(720);    // Margen superior
            pageMar.setBottom(720);  // Margen inferior


            // 1. Configurar política de encabezados
            CTSectPr sectPr = doc.getDocument().getBody().isSetSectPr()
                    ? doc.getDocument().getBody().getSectPr()
                    : doc.getDocument().getBody().addNewSectPr();
            XWPFHeaderFooterPolicy policy = new XWPFHeaderFooterPolicy(doc, sectPr);

            // 2. Crear encabezado DEFAULT
            XWPFHeader header = policy.createHeader(XWPFHeaderFooterPolicy.DEFAULT);

            // 3. Crear tabla en el encabezado (1 fila, 3 columnas)
            XWPFTable tableEnc = header.createTable(1, 3);

            // 4. Configurar ancho de la tabla (100% del ancho de página)
            tableEnc.setWidth("100%");

            // 5. Configurar ancho de columnas
            // Columna 1: 30%
            //setColumnWidth(table, 0, "30%");
            // Columna 2: 40%
            //setColumnWidth(table, 1, "40%");
            // Columna 3: 30%
            //setColumnWidth(table, 2, "30%");

            // 6. Configurar contenido de las celdas
            // Celda 1: Logo
            XWPFTableCell cell1 = tableEnc.getRow(0).getCell(0);
            cell1.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);

            byte[] bLogoDEV = ReporteLogo.find.byId(1L).getContenido();
            InputStream isLogoDEV = new ByteArrayInputStream(bLogoDEV);

            byte[] bEscudoIPN = ReporteLogo.find.byId(2L).getContenido();
            InputStream isEscudoIPN = new ByteArrayInputStream(bEscudoIPN);
            try {


                XWPFParagraph p1 = cell1.addParagraph();
                p1.setAlignment(ParagraphAlignment.LEFT);
                XWPFRun r1 = p1.createRun();
                // Agrega aquí tu imagen si es necesario
                // r1.addPicture(...);

                r1.addPicture(
                        isEscudoIPN,
                        XWPFDocument.PICTURE_TYPE_JPEG,
                        "ipn-escudo.jpg",
                        Units.pixelToEMU(65),
                        Units.pixelToEMU(95)
                );


            } catch (Exception e) {
                e.printStackTrace();
            }

            // Celda 2: Título
            XWPFTableCell cell2 = tableEnc.getRow(0).getCell(1);
            cell2.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);
            XWPFParagraph p2 = cell2.addParagraph();
            p2.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun r2 = p2.createRun();

            XWPFParagraph p1C2 = doc.createParagraph();

            p1C2.createRun().setText("INSTITUTO POLITÉCNICO NACIONAL");


            r2.setText("Reporte de Evaluación Técnico Pedagógica");
            r2.setBold(true);
            r2.setFontSize(9);

            // Celda 3: Fecha
            XWPFTableCell cell3 = tableEnc.getRow(0).getCell(2);
            cell3.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);
            XWPFParagraph p3 = cell3.addParagraph();
            p3.setAlignment(ParagraphAlignment.RIGHT);
            XWPFRun r3 = p3.createRun();
            //r3.setText("Fecha: " + java.time.LocalDate.now());
            //r3.setItalic(true);
            r3.addPicture(
                    isLogoDEV,
                    XWPFDocument.PICTURE_TYPE_PNG,
                    "logoDEVReporte.png",
                    Units.pixelToEMU(58),
                    Units.pixelToEMU(52)
            );

            // 7. Agregar contenido al cuerpo del documento
            /*
            XWPFParagraph bodyPara = doc.createParagraph();
            bodyPara.createRun().setText("Este es el contenido principal del documento.");
            bodyPara.createRun().setText("Funciona correctamente con la versión " +org.apache.poi.Version.getVersion());
            bodyPara.createRun().addBreak();
            bodyPara.createRun().setText("El encabezado contiene una tabla de 3 columnas.");
             */

            // Datos de identidad

            // Crear título
            /*
            XWPFParagraph title = doc.createParagraph();
            title.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun titleRun = title.createRun();
            titleRun.setBold(true);
            titleRun.setFontSize(14);
            titleRun.setText("Tabla Dinámica 12 Columnas");
             */




            // Crear tabla con 12 columnas
            XWPFTable table = doc.createTable(9, 12);
            table.setWidth("100%");
            // Cambia el fontSize
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 12; j++) {
                    // Luego obtienes el párrafo y el run para modificar el formato
                    System.out.println("R"+i+" C"+j);
                    XWPFTableCell cell = table.getRow(i).getCell(j);
                    XWPFParagraph paragraph = cell.getParagraphs().get(0); // Obtener el primer párrafo

// Asegurarte de que hay al menos un Run (puede haber sido creado por setText)
                    if (!paragraph.getRuns().isEmpty()) {
                        XWPFRun run = paragraph.getRuns().get(0);
                        run.setFontSize(9); // Cambiar el tamaño de fuente aquí (12 puntos en este ejemplo)
                        run.setFontFamily("Arial"); // Opcional: cambiar tipo de letra
                    } else {
                        // Si no hay Run, crear uno nuevo
                        XWPFRun newRun = paragraph.createRun();
                        // newRun.setText("Unidad académica");
                        newRun.setFontSize(9);
                    }
                }
            }



            // Configurar encabezado gris
            XWPFTableRow headerRow = table.getRow(0);
            //CTShd headerShading = headerRow.getCtRow().addNewTrPr().addNewShd();
            //headerShading.setFill("D3D3D3");

            // Llenar encabezados
            for (int i = 0; i < 12; i++) {
                //setCell(headerRow.getCell(i), "Col " + i, true);
            }

            setCell(headerRow.getCell(0), "Datos de identidad",  true);
            //setCellTextWithFont(table.getRow(0).getCell(0), "Datos de identidad", tamFuente);
            mergeCellHorizontally(table, 0, 0, 11);


            // Datos de ejemplo (lista de objetos CeldaData)
            java.util.List<CeldaData> fila1 = new ArrayList<>();
            java.util.List<CeldaData> fila2 = new ArrayList<>();
            //fila1.add(new CeldaData("Dato A", 0, 0));  // Celda individual col 0
            //fila1.add(new CeldaData("Combinado B-C", 1, 2)); // Combina cols 1-2


            setCellTextWithFont(table.getRow(1).getCell(0), "Título", tamFuente);
            setCellTextWithFont(table.getRow(1).getCell(1), r.titulo, tamFuente);
            mergeCellHorizontally(table, 1, 0, 0);
            mergeCellHorizontally(table, 1, 1, 11);

            //table.getRow(1).getCell(4).setText(r.titulo);

            setCellTextWithFont(table.getRow(2).getCell(0), "Área del conocimiento", tamFuente);
            setCellTextWithFont(table.getRow(2).getCell(4),  r.areaconocimiento.descripcion, tamFuente);

            setCellTextWithFont(table.getRow(3).getCell(0), "Nivel ", tamFuente );
            setCellTextWithFont(table.getRow(3).getCell(2),  r.niveleducativo.descripcion, tamFuente);
            setCellTextWithFont(table.getRow(3).getCell(5), "Duración en "+r.unidadmedida.descripcion.toLowerCase(), tamFuente);
            setCellTextWithFont(table.getRow(3).getCell(9) ,r.duracion, tamFuente);

            setCellTextWithFont(table.getRow(4).getCell(0), "Unidad académica", tamFuente);
            setCellTextWithFont(table.getRow(4).getCell(2), r.unidadacademica.nombre, tamFuente);
            setCellTextWithFont(table.getRow(4).getCell(7), "Fecha de elaboración del recurso", tamFuente);
            Calendar cal = Calendar.getInstance();
            cal.setTime(r.elaboracion);
            setCellTextWithFont(table.getRow(4).getCell(10),  cal.get(Calendar.DAY_OF_WEEK)+ "/"+cal.get(Calendar.MONTH)+"/"+(cal.get(Calendar.YEAR)), tamFuente  );
            mergeCellHorizontally(table, 4, 0, 1);
            mergeCellHorizontally(table, 4, 2, 6);
            mergeCellHorizontally(table, 4, 7, 9);
            mergeCellHorizontally(table, 4, 10, 11);




            setCellTextWithFont(table.getRow(5).getCell(0), "Programa académico", tamFuente);
            setCellTextWithFont(table.getRow(5).getCell(3),  r.programaacad, tamFuente);
            mergeCellHorizontally(table, 5, 0, 2);
            mergeCellHorizontally(table, 5, 3, 11);

            setCellTextWithFont(table.getRow(6).getCell(0), "Modalidad", tamFuente);
            setCellTextWithFont(table.getRow(6).getCell(3),  r.modalidad.descripcion, tamFuente);
            setCellTextWithFont(table.getRow(6).getCell(7), "Versión", tamFuente);
            setCellTextWithFont(table.getRow(6).getCell(9),  r.version.descripcion, tamFuente);
            mergeCellHorizontally(table, 6, 0, 2);
            mergeCellHorizontally(table, 6, 3, 6);
            mergeCellHorizontally(table, 6, 7, 8);
            mergeCellHorizontally(table, 6, 0, 2);
            mergeCellHorizontally(table, 6, 3, 6);
            mergeCellHorizontally(table, 6, 9, 11);

            // Sinópsis
            setCellTextWithFont(table.getRow(7).getCell(0), "Sinópsis", tamFuente);
            setCellTextWithFont(table.getRow(7).getCell(1),  r.sinopsis, tamFuente);
            mergeCellHorizontally(table, 7, 0, 0);
            mergeCellHorizontally(table, 7, 1, 11);

            // Formato de entrega
            if (r.formatoentrega!=null) {
                setCellTextWithFont(table.getRow(8).getCell(0), "Formato de entrega", tamFuente);
                setCellTextWithFont(table.getRow(8).getCell(3), r.formatoentrega.descripcion, tamFuente);
                mergeCellHorizontally(table, 8, 0, 2);
                mergeCellHorizontally(table, 8, 3, 11);
            }

            // url recurso
            if (!r.url.isEmpty()) {
                XWPFTableRow row = table.createRow();
                setCellTextWithFont(table.getRow(9).getCell(0), "Url del recurso", tamFuente);
                setCellTextWithFont(table.getRow(9).getCell(3), r.url, tamFuente);
                mergeCellHorizontally(table, 9, 0, 2);
                mergeCellHorizontally(table, 9, 3, 11);
            }

            // Requiere usuario y password
            if (!r.recursosenweb.isEmpty()){
                XWPFTableRow row = table.createRow();
                int numRenglones = table.getNumberOfRows()-1;
                System.out.println("nr "+numRenglones);
                setCellTextWithFont(table.getRow(numRenglones).getCell(0), "Usuario", tamFuente);
                setCellTextWithFont(table.getRow(numRenglones).getCell(3), r.recursosenweb.get(0).usuario, tamFuente);
                setCellTextWithFont(table.getRow(numRenglones).getCell(6), "Clave de acceso", tamFuente);
                setCellTextWithFont(table.getRow(numRenglones).getCell(9), r.recursosenweb.get(0).password, tamFuente);
                mergeCellHorizontally(table, numRenglones, 0, 2);
                mergeCellHorizontally(table, numRenglones, 3, 5);
                mergeCellHorizontally(table, numRenglones, 6, 8);
                mergeCellHorizontally(table, numRenglones, 9, 11);
            }




            // Combinacion de celdas



            mergeCellHorizontally(table, 2, 0, 3);
            mergeCellHorizontally(table, 2, 4, 11);

            // nivel, duración
            mergeCellHorizontally(table, 3, 0, 1);
            mergeCellHorizontally(table, 3, 2, 4);
            mergeCellHorizontally(table, 3, 5, 8);
            mergeCellHorizontally(table, 3, 9, 11);

            // Unidad académica, fecha de  elaboración


            // Programa académico


            // Modalidad, versión



            // Establecer el color del borde
            CTTblBorders borders = table.getCTTbl().getTblPr().getTblBorders();
            borders.addNewTop().setVal(STBorder.SINGLE);
            borders.getTop().setSz(BigInteger.valueOf(4)); // Tamaño del borde
            borders.getTop().setSpace(BigInteger.valueOf(0));
            borders.getTop().setColor("C0C0C0");


            // Fija altura y alineacion vertical de las celdas de la tabla Datos de Identidad
            for ( XWPFTableRow elRenglonr  : table.getRows()) {
                elRenglonr.setHeight(400);
                for ( XWPFTableCell laCelda : elRenglonr.getTableCells()){
                    laCelda.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);
                }

            }


            /*
            fila1.add(new CeldaData("Dato D", 3, 3));  // Celda individual col 3
            fila1.add(new CeldaData("Gran combinación", 4, 7)); // Combina cols 4-7
            fila1.add(new CeldaData("Dato H", 8, 8));  // Celda individual col 8
            fila1.add(new CeldaData("Final", 9, 11)); // Combina cols 9-11

            java.util.List<CeldaData> fila2 = new ArrayList<>();
            fila2.add(new CeldaData("X", 0, 2));  // Combina cols 0-2
            fila2.add(new CeldaData("Y", 3, 5));  // Combina cols 3-5
            fila2.add(new CeldaData("Z", 6, 11)); // Combina cols 6-11

             */

            // Agregar filas a la tabla
            //addDynamicRow(table, fila1);
            //addDynamicRow(table, fila2);




            // TABLA AUTORES POR FUNCION
            // Crear tabla con 12 columnas
            {
                XWPFParagraph bodyPara = doc.createParagraph();
                bodyPara.createRun().addBreak();

                XWPFTable tableAF = doc.createTable(1, 12);
                tableAF.setWidth("100%");
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 12; j++) {
                        //System.out.println("R"+i+" C"+j);
                        XWPFTableCell cell = table.getRow(i).getCell(j);
                        XWPFParagraph paragraph = cell.getParagraphs().get(0); // Obtener el primer párrafo
                        // Asegurarte de que hay al menos un Run (puede haber sido creado por setText)
                        if (!paragraph.getRuns().isEmpty()) {
                            XWPFRun run = paragraph.getRuns().get(0);
                            run.setFontSize(9); // Cambiar el tamaño de fuente aquí (12 puntos en este ejemplo)
                            run.setFontFamily("Arial"); // Opcional: cambiar tipo de letra
                        } else {
                            // Si no hay Run, crear uno nuevo
                            XWPFRun newRun = paragraph.createRun();
                            // newRun.setText("Unidad académica");
                            newRun.setFontSize(9);
                        }
                    }
                }
                // Configurar encabezado gris
                XWPFTableRow headerRowAF = tableAF.getRow(0);
                //CTShd headerShading = headerRow.getCtRow().addNewTrPr().addNewShd();
                //headerShading.setFill("D3D3D3");

                // Llenar encabezados
                for (int i = 0; i < 12; i++) {
                   // setCell(headerRowAF.getCell(i), "Col " + i, true);
                }

                setCell(headerRowAF.getCell(0), "Autores por función",  true);
                mergeCellHorizontally(tableAF, 0, 0, 11);

                int renglon=1;
                for (RecursoAutor autor : r.autores){
                    tableAF.createRow();
                    setCellTextWithFont(tableAF.getRow(renglon).getCell(0), autor.autorfuncion.descripcion, tamFuente);
                    setCellTextWithFont(tableAF.getRow(renglon).getCell(6), autor.nombreCompleto(), tamFuente);
                    mergeCellHorizontally(tableAF, renglon, 0, 5);
                    mergeCellHorizontally(tableAF, renglon, 6, 11);
                    renglon++;
                    tableAF.createRow();
                    setCellTextWithFont(tableAF.getRow(renglon).getCell(0), "Teléfono", tamFuente);
                    setCellTextWithFont(tableAF.getRow(renglon).getCell(3), autor.correo.telefono, tamFuente);
                    mergeCellHorizontally(tableAF, renglon, 0, 2);
                    mergeCellHorizontally(tableAF, renglon, 3, 5);
                    setCellTextWithFont(tableAF.getRow(renglon).getCell(6), "Correo electrónico", tamFuente);
                    setCellTextWithFont(tableAF.getRow(renglon).getCell(9), autor.correo.email, tamFuente);
                    mergeCellHorizontally(tableAF, renglon, 6, 8);
                    mergeCellHorizontally(tableAF, renglon, 9, 11);
                    renglon++;
                    tableAF.createRow();
                    setCellTextWithFont(tableAF.getRow(renglon).getCell(0), "Firma", tamFuente);

                    XWPFParagraph paragraph = tableAF.getRow(renglon).getCell(0).addParagraph();
                    XWPFRun run = paragraph.createRun();
                    run.addBreak();


                    mergeCellHorizontally(tableAF, renglon, 0, 11);
                }
                // Establecer el color del borde
                CTTblBorders bordersAF = tableAF.getCTTbl().getTblPr().getTblBorders();
                bordersAF.addNewTop().setVal(STBorder.SINGLE);

                bordersAF.getTop().setSz(BigInteger.valueOf(4));
                bordersAF.getTop().setSpace(BigInteger.valueOf(10));
                bordersAF.getTop().setColor("C0C0C0");

                // Fija altura y alineacion vertical de las celdas de la tabla de Autores
                for ( XWPFTableRow elRenglonr  : tableAF.getRows()) {
                    elRenglonr.setHeight(400);
                    for ( XWPFTableCell laCelda : elRenglonr.getTableCells()){
                        laCelda.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);
                    }

                }

            }




            // 8. Guardar documento
            try (FileOutputStream out = new FileOutputStream("DocumentoConTablaEnEncabezadoJAJA.docx")) {
                doc.write(out);
                System.out.println("Documento creado exitosamente con tabla en el encabezado");

                ByteArrayOutputStream otro = new ByteArrayOutputStream();
                doc.write(otro);
                otro.close();
                this.baos = otro;
            }
        } catch (InvalidFormatException e) {
            throw new RuntimeException(e);
        }






        //return ok("ok");
    }


    static void mergeCellHorizontally(XWPFTable table, int row, int fromCol, int toCol) {
        for(int colIndex = fromCol; colIndex <= toCol; colIndex++) {
            XWPFTableCell cell = table.getRow(row).getCell(colIndex);
            CTHMerge hmerge = CTHMerge.Factory.newInstance();
            if(colIndex == fromCol) {
                hmerge.setVal(STMerge.RESTART);
            } else {
                hmerge.setVal(STMerge.CONTINUE);
                for (int i = cell.getParagraphs().size(); i > 0; i--) {
                    cell.removeParagraph(0);
                }
                cell.addParagraph();
            }
            CTTcPr tcPr = cell.getCTTc().getTcPr();
            if (tcPr != null) {
                tcPr.setHMerge(hmerge);
            } else {
                tcPr = CTTcPr.Factory.newInstance();
                tcPr.setHMerge(hmerge);
                cell.getCTTc().setTcPr(tcPr);
            }
        }
    }


    /**
     * Clase para representar los datos de cada celda/combinación
     */
    static class CeldaData {
        String contenido;
        int columnaInicio;
        int columnaFin;

        public CeldaData(String contenido, int columnaInicio, int columnaFin) {
            this.contenido = contenido;
            this.columnaInicio = columnaInicio;
            this.columnaFin = columnaFin;
        }
    }



    /**
     * Método auxiliar para configurar celdas
     */
    private static void setCell(XWPFTableCell cell, String texto, boolean isHeader) {
        /*
        System.out.println("cell:"+cell);
        System.out.println("cell:"+cell.getCTTc());
        System.out.println("cell:"+cell.getCTTc().addNewTcPr());
        */
        cell.getCTTc().addNewTcPr();
        XWPFParagraph paragraph = cell.getParagraphs().get(0);
        paragraph.setAlignment(ParagraphAlignment.RIGHT);
        XWPFRun run = paragraph.createRun();
        run.setText(texto);

        if (isHeader) {
            cell.setColor("D3D3D3");
            cell.getCTTc().getTcPr().addNewShd().setFill("D3D3D3");
            run.setBold(true);
        }
    }



    // Método seguro para cambiar texto y formato
    public static void setCellTextWithFont(XWPFTableCell cell, String text, int fontSize) {
        // Limpiar contenido existente
        //for (XWPFParagraph p : cell.getParagraphs()) {
        //    cell.removeParagraph(cell.getParagraphs().indexOf(p));
        //}


        cell.removeParagraph(cell.getParagraphs().indexOf(  cell.getParagraphs().get(0)  ));


        // Crear nuevo párrafo y run
        XWPFParagraph paragraph = cell.addParagraph();
        //paragraph.setAlignment(ParagraphAlignment.LEFT); // Opcional: alineación

        XWPFRun run = paragraph.createRun();
        run.setText(text);
        run.setFontSize(fontSize);

        // Opcional: otros formatos
        run.setFontFamily("Cournier");
        // run.setBold(true);
        // run.setColor("000000");

    }




}
