package br.edu.ifpb.companyreportstool.service.exporters;

import java.util.List;

public interface ReportExporter {
    String exportHeader(String titulo);
    String exportBody(String subtitulo, List<String> dados);
    String exportFooter(String rodape);
}
