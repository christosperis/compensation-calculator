package com.dto;

public class CompensationResponseDto {

    private Long compensation;

    private Double premiumAmount;

    public CompensationResponseDto(Long compensation, Double premiumAmount) {
        this.compensation = compensation;
        this.premiumAmount = premiumAmount;
    }

    public Long getCompensation() {
        return compensation;
    }

    public void setCompensation(Long compensation) {
        this.compensation = compensation;
    }

    public Double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(Double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
}
