package br.edu.ifpb.companyreportstool.service.report;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import br.edu.ifpb.companyreportstool.service.exporters.JSONExporter;
import br.edu.ifpb.companyreportstool.service.exporters.ReportExporter;
import org.springframework.stereotype.Service;

@Service
public class ExpenseReportJSON extends ExpenseReport {
    public ExpenseReportJSON(ExpenseRepository expenseRepository) {
        super(expenseRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new JSONExporter();
    }
}
