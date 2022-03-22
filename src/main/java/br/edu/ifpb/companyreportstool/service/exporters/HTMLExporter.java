package br.edu.ifpb.companyreportstool.service.exporters;

import br.edu.ifpb.companyreportstool.service.exporters.ReportExporter;

import java.util.List;
import java.util.stream.Collectors;

public class HTMLExporter implements ReportExporter {
    @Override
    public String exportHeader(String titulo) {
        return "<header><h1>" + titulo + "</h1></header>";
    }

    @Override
    public String exportBody(String subtitulo, List<String> dados) {
        return "<main><h2>" + subtitulo + "</h2>" +
        "<p><ul><li>" + dados.stream().collect(Collectors.joining("</li><li>")) + "</li></ul></p></main>";
    }

    @Override
    public String exportFooter(String rodape) {
        return "<footer>" + rodape + "</footer>";
    }
}
