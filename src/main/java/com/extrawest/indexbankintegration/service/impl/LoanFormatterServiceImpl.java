package com.extrawest.indexbankintegration.service.impl;

import com.extrawest.indexbankintegration.model.BankApplicationForm;
import com.extrawest.indexbankintegration.model.dto.request.BankApplicationFormRequestDto;
import com.extrawest.indexbankintegration.model.mapper.BankApplicationFormMapper;
import com.extrawest.indexbankintegration.repository.BankApplicationFormRepository;
import com.extrawest.indexbankintegration.service.LoanFormatterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoanFormatterServiceImpl implements LoanFormatterService {

    private final BankApplicationFormRepository bankApplicationFormRepository;
    private final BankApplicationFormMapper bankApplicationFormMapper;
    @Override
    public BankApplicationForm loanRequestToBankApplicationForm(BankApplicationFormRequestDto bankApplicationFormRequestDto) {
        BankApplicationForm bankApplicationForm = bankApplicationFormMapper.toModel(bankApplicationFormRequestDto);
        return bankApplicationFormRepository.save(bankApplicationForm);
    }
}
