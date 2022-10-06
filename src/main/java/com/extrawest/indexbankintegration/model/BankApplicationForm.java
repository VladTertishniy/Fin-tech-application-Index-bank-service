package com.extrawest.indexbankintegration.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "application-forms")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class BankApplicationForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String lastName;
    private long dob;
    private String passportNum;
    private String inn;
    private String address;
}
