package ru.lakeevda.lesson6.Reports.Interfaces;

import ru.lakeevda.lesson6.Documents.Document;

public interface ReportType {
    byte[] create(Document document);
}
