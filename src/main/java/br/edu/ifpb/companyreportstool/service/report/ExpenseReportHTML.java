package br.edu.ifpb.companyreportstool.service.report;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import br.edu.ifpb.companyreportstool.service.exporters.HTMLExporter;
import br.edu.ifpb.companyreportstool.service.exporters.ReportExporter;
import org.springframework.stereotype.Service;

@Service
public class ExpenseReportHTML extends ExpenseReport {
    public ExpenseReportHTML(ExpenseRepository expenseRepository) {
        super(expenseRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new HTMLExporter();
    }
}
