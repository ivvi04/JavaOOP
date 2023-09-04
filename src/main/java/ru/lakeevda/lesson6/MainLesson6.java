package ru.lakeevda.lesson6;

import ru.lakeevda.lesson6.Documents.Document;
import ru.lakeevda.lesson6.Reports.Report;
import ru.lakeevda.lesson6.Reports.ReportEntrypoint;
import ru.lakeevda.lesson6.Reports.ReportTypes.JSONType;
import ru.lakeevda.lesson6.Reports.ReportTypes.PDFType;
import ru.lakeevda.lesson6.Reports.ReportTypes.XMLType;

public class MainLesson6 {

    public static void main(String[] args) {
        Document document = new Document("123", "It's data needed convert to...'");

        try {
            Report reportPDF = new ReportEntrypoint().create(document, new PDFType());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            Report reportJSON = new ReportEntrypoint().create(document, new JSONType());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        try {
            Report reportXML = new ReportEntrypoint().create(document, new XMLType());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
