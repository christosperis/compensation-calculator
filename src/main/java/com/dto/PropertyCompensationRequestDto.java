package com.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.Instant;

public class PropertyCompensationRequestDto {

    @NotNull
    private Instant constructionYear;

    @NotNull
    @Positive
    private Double objectiveValue;

    public PropertyCompensationRequestDto() {
    }

    public Instant getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Instant constructionYear) {
        this.constructionYear = constructionYear;
    }

    public Double getObjectiveValue() {
        return objectiveValue;
    }

    public void setObjectiveValue(Double objectiveValue) {
        this.objectiveValue = objectiveValue;
    }
}
