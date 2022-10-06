package com.extrawest.indexbankintegration.model.dto.request;

import com.extrawest.indexbankintegration.model.ApplicationForm;
import com.extrawest.indexbankintegration.model.SaleType;
import com.extrawest.indexbankintegration.model.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanRequestDto {
    private long id;
    private LocalDateTime createdWhen;
    private LocalDateTime updatedWhen;
    private Status status;
    private SaleType saleType;
    private Long salePointId;
    private Long operatorId;
    private Long buyerId;
    private ApplicationForm applicationForm;
    private long income;
    private long loanAmount;
    private LocalDateTime loanTermFrom;
    private LocalDateTime loanTermTo;
    private long commission;
}
