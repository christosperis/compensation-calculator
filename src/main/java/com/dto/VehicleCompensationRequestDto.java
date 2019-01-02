package com.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.Instant;

public class VehicleCompensationRequestDto {

    @NotNull
    @Positive
    private Integer bonusMalus;

    @NotNull
    private Instant firstRegistrationYear;

    @NotNull
    @Positive
    private Double vehicleValue;

    public Integer getBonusMalus() {
        return bonusMalus;
    }

    public void setBonusMalus(Integer bonusMalus) {
        this.bonusMalus = bonusMalus;
    }

    public Instant getFirstRegistrationYear() {
        return firstRegistrationYear;
    }

    public void setFirstRegistrationYear(Instant firstRegistrationYear) {
        this.firstRegistrationYear = firstRegistrationYear;
    }

    public Double getVehicleValue() {
        return vehicleValue;
    }

    public void setVehicleValue(Double vehicleValue) {
        this.vehicleValue = vehicleValue;
    }

}
