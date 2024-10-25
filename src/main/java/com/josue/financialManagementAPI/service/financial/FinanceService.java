package com.josue.financialManagementAPI.service.financial;

import com.josue.financialManagementAPI.model.FinancialSummary;
import com.josue.financialManagementAPI.model.User;

import java.time.LocalDate;

public interface FinanceService {
    /*
        List<FinancialSummary> findAll();
        FinancialSummary findById(String id);*/
    FinancialSummary generateSummary(User user, LocalDate from, LocalDate to);

}