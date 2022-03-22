package br.edu.ifpb.companyreportstool.service.report;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import br.edu.ifpb.companyreportstool.service.exporters.JSONExporter;
import br.edu.ifpb.companyreportstool.service.exporters.ReportExporter;
import org.springframework.stereotype.Service;

@Service
public class TaxReportJSON extends TaxReport {
    public TaxReportJSON(TaxRepository taxRepository) {
        super(taxRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new JSONExporter();
    }
}
