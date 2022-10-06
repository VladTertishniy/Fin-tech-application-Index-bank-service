package com.extrawest.indexbankintegration.model.dto.request;

import com.extrawest.indexbankintegration.model.EmploymentType;
import com.extrawest.indexbankintegration.model.Gender;
import com.extrawest.indexbankintegration.model.PassportType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BankApplicationFormRequestDto {
    @NotBlank
    private String name;
    @NotBlank
    private String lastName;
    @NotBlank
    private String surname;
    @NotBlank
    private String registrationCity;
    @NotBlank
    private String registrationAddress;
    @NotBlank
    private String passportSeries;
    @NotBlank
    private String passportNumber;
    @NotNull
    private PassportType passportType;
    @NotBlank
    private String taxpayerCode;
    @NotNull
    private LocalDateTime dateOfBirth;
    @NotNull
    private Gender gender;
    @NotNull
    private EmploymentType employmentType;
    @NotBlank
    private String email;
    @NotBlank
    private String phoneNumber;
    private boolean isWorkOfficially;
}
