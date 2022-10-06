package com.extrawest.indexbankintegration.service;

import com.extrawest.indexbankintegration.model.BankApplicationForm;
import com.extrawest.indexbankintegration.model.dto.request.BankApplicationFormRequestDto;
import com.extrawest.indexbankintegration.model.dto.request.LoanRequestDto;

public interface LoanFormatterService {
    BankApplicationForm loanRequestToBankApplicationForm(BankApplicationFormRequestDto bankApplicationFormRequestDto);
}
