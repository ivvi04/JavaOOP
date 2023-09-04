package ru.lakeevda.lesson6.Reports.ReportTypes;

import ru.lakeevda.lesson6.Documents.Document;
import ru.lakeevda.lesson6.Reports.Interfaces.ReportType;

public class PDFType implements ReportType {
    @Override
    public byte[] create(Document document) {
        throw new UnsupportedOperationException("Unimplemented method 'create' PDF");
    }
}
