package br.edu.ifpb.companyreportstool.service.report;

import br.edu.ifpb.companyreportstool.repository.ExpenseRepository;
import br.edu.ifpb.companyreportstool.service.report.Report;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public abstract class ExpenseReport extends Report {

    private final ExpenseRepository expenseRepository;

    public ExpenseReport(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public String writeBody() {
        List<String> dados = expenseRepository.findAll().stream().map(Objects::toString).collect(Collectors.toList());

        return getExporter().exportBody("This is the Expense Report", dados);
    }
}

