package ru.lakeevda.lesson6.Reports;

import ru.lakeevda.lesson6.Documents.Document;
import ru.lakeevda.lesson6.Reports.Interfaces.ReportType;

public class ReportEntrypoint {

    public Report create(Document document, ReportType reportType) {
        return new Report(reportType.create(document));
    }

}
