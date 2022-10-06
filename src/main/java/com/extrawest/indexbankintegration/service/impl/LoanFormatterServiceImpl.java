package com.extrawest.indexbankintegration.service.impl;

import com.extrawest.indexbankintegration.model.BankApplicationForm;
import com.extrawest.indexbankintegration.model.dto.request.BankApplicationFormRequestDto;
import com.extrawest.indexbankintegration.repository.BankApplicationFormRepository;
import com.extrawest.indexbankintegration.service.LoanFormatterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.ZoneId;

@Service
@RequiredArgsConstructor
public class LoanFormatterServiceImpl implements LoanFormatterService {

    private final BankApplicationFormRepository bankApplicationFormRepository;

    @Override
    public BankApplicationForm loanRequestToBankApplicationForm(BankApplicationFormRequestDto bankApplicationFormRequestDto) {
        BankApplicationForm bankApplicationForm = new BankApplicationForm();
        bankApplicationForm.setAddress(bankApplicationFormRequestDto.getRegistrationCity() + " " + bankApplicationFormRequestDto.getRegistrationAddress());
        bankApplicationForm.setDob(bankApplicationFormRequestDto.getDateOfBirth().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
        bankApplicationForm.setInn(bankApplicationFormRequestDto.getTaxpayerCode());
        bankApplicationForm.setLastName(bankApplicationFormRequestDto.getLastName());
        bankApplicationForm.setName(bankApplicationFormRequestDto.getName());
        bankApplicationForm.setPassportNum(bankApplicationFormRequestDto.getPassportSeries() + bankApplicationFormRequestDto.getPassportNumber());
        return bankApplicationFormRepository.save(bankApplicationForm);
    }
}
