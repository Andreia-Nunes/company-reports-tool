package br.edu.ifpb.companyreportstool.service.exporters;

import br.edu.ifpb.companyreportstool.service.exporters.ReportExporter;

import java.util.List;
import java.util.stream.Collectors;

public class JSONExporter implements ReportExporter {

    @Override
    public String exportHeader(String titulo) {
        return "{ header: \"" + titulo + "\",";
    }

    @Override
    public String exportBody(String subtitulo, List<String> dados) {
        return "main: { title: \"" + subtitulo + "\", " +
                "content: \"" + dados.stream().collect(Collectors.joining(",")) + "\",";
    }

    @Override
    public String exportFooter(String rodape) {
        return "footer: \"" + rodape + "\"}";
    }
}
