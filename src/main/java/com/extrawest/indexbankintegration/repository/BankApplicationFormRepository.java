package com.extrawest.indexbankintegration.repository;

import com.extrawest.indexbankintegration.model.BankApplicationForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankApplicationFormRepository extends JpaRepository<BankApplicationForm, Long> {
}
