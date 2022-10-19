package com.extrawest.indexbankintegration.model.mapper;

import com.extrawest.indexbankintegration.model.BankApplicationForm;
import com.extrawest.indexbankintegration.model.dto.request.BankApplicationFormRequestDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.time.ZoneId;

@Mapper(componentModel = "spring", imports = ZoneId.class)
public interface BankApplicationFormMapper {
    @Mapping(target = "dob", expression = "java(bankApplicationFormRequestDto.getDateOfBirth().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli())")
    @Mapping(target = "passportNum", expression = "java(bankApplicationFormRequestDto.getPassportSeries() + bankApplicationFormRequestDto.getPassportNumber())")
    @Mapping(target = "inn", source = "taxpayerCode")
    @Mapping(target = "address", expression = "java(bankApplicationFormRequestDto.getRegistrationCity() + \" \" + bankApplicationFormRequestDto.getRegistrationAddress())")
    BankApplicationForm toModel(BankApplicationFormRequestDto bankApplicationFormRequestDto);
}
