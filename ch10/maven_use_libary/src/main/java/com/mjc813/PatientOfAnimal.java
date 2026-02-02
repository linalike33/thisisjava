package com.mjc813;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class PatientOfAnimal {
    private String name;
    private String id;
    private Date dayOfHospitalize;
    private Date dayOfDischarge;
    private int countOfVisitation;
}
