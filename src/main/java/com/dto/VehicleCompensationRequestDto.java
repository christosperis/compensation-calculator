package com.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.Instant;

public class VehicleCompensationRequestDto {

    @NotNull
    @Positive
    private Integer bonusMalus;

    @NotNull
    @Min(1950)
    private Integer firstRegistrationYear;

    @NotNull
    @Positive
    private Double vehicleValue;

    public VehicleCompensationRequestDto() {
    }

    public Integer getBonusMalus() {
        return bonusMalus;
    }

    public void setBonusMalus(Integer bonusMalus) {
        this.bonusMalus = bonusMalus;
    }

    public Integer getFirstRegistrationYear() {
        return firstRegistrationYear;
    }

    public void setFirstRegistrationYear(Integer firstRegistrationYear) {
        this.firstRegistrationYear = firstRegistrationYear;
    }

    public Double getVehicleValue() {
        return vehicleValue;
    }

    public void setVehicleValue(Double vehicleValue) {
        this.vehicleValue = vehicleValue;
    }

}
