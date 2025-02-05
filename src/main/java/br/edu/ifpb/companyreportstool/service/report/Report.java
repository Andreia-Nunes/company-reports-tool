package br.edu.ifpb.companyreportstool.service.report;

import br.edu.ifpb.companyreportstool.service.exporters.ReportExporter;

public abstract class  Report {
    public String generateReport(){
        return writeHeader() + writeBody() + writeFooter();
    }

    public String writeHeader(){
        return getExporter().exportHeader("Company Report");
    }

    public String writeFooter(){
        return getExporter().exportFooter("2022 - Design Patterns IFPB");
    }

    public abstract String writeBody();
    public abstract ReportExporter getExporter();

}
