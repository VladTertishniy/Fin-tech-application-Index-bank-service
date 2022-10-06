package com.extrawest.indexbankintegration.controller;

import com.extrawest.indexbankintegration.model.dto.request.BankApplicationFormRequestDto;
import com.extrawest.indexbankintegration.model.dto.request.LoanRequestDto;
import com.extrawest.indexbankintegration.service.LoanFormatterService;
import com.extrawest.indexbankintegration.util.PathUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(PathUtil.LOANS_ROOT_PATH)
@AllArgsConstructor
public class LoanController {

    private final LoanFormatterService loanFormatterService;

    @PostMapping(PathUtil.SEND_LOAN_REQUEST_PATH)
    public ResponseEntity<String> getLoanRequest(@RequestBody @Valid BankApplicationFormRequestDto bankApplicationFormRequestDto) {
        return ResponseEntity.ok(loanFormatterService.loanRequestToBankApplicationForm(bankApplicationFormRequestDto).toString());
    }
}
