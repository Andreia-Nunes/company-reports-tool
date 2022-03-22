package br.edu.ifpb.companyreportstool.service.report;

import br.edu.ifpb.companyreportstool.repository.TaxRepository;
import br.edu.ifpb.companyreportstool.service.exporters.HTMLExporter;
import br.edu.ifpb.companyreportstool.service.exporters.ReportExporter;
import org.springframework.stereotype.Service;

@Service
public class TaxReportHTML extends TaxReport {
    public TaxReportHTML(TaxRepository taxRepository) {
        super(taxRepository);
    }

    @Override
    public ReportExporter getExporter() {
        return new HTMLExporter();
    }
}
