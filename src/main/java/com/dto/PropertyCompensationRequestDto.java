package com.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;


public class PropertyCompensationRequestDto {

    @NotNull
    @Positive
    private Integer constructionYear;

    @NotNull
    @Positive
    private Double objectiveValue;

    public PropertyCompensationRequestDto() {
    }

    public Integer getConstructionYear() {
        return constructionYear;
    }

    public void setConstructionYear(Integer constructionYear) {
        this.constructionYear = constructionYear;
    }

    public Double getObjectiveValue() {
        return objectiveValue;
    }

    public void setObjectiveValue(Double objectiveValue) {
        this.objectiveValue = objectiveValue;
    }
}
