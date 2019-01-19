package com.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class LifeCompensationRequestDto {

    @NotNull
    @Min(1)
    private Integer securedAge;

    @NotNull
    private MedicalRecord medicalRecord;

    @NotNull
    @Positive
    private Double insuredValue;

    public LifeCompensationRequestDto() {
    }

    public Integer getSecuredAge() {
        return securedAge;
    }

    public void setSecuredAge(Integer securedAge) {
        this.securedAge = securedAge;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public Double getInsuredValue() {
        return insuredValue;
    }

    public void setInsuredValue(Double insuredValue) {
        this.insuredValue = insuredValue;
    }
}
