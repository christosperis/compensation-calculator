package com.service;

import com.dto.CompensationResponseDto;
import com.dto.LifeCompensationRequestDto;
import com.dto.PropertyCompensationRequestDto;
import com.dto.VehicleCompensationRequestDto;
import com.formula.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompensationServiceImpl implements CompensationService {

    @Autowired
    private Calculator calculator;

    @Override
    public CompensationResponseDto calculateCompensation(VehicleCompensationRequestDto vehicleCompensationRequestDto) {
        return calculator.calculateVehicleCompensation(vehicleCompensationRequestDto);
    }

    @Override
    public CompensationResponseDto calculateCompensation(PropertyCompensationRequestDto propertyCompensationRequestDto) {
        return calculator.calculatePropertyCompensation(propertyCompensationRequestDto);
    }

    @Override
    public CompensationResponseDto calculateCompensation(LifeCompensationRequestDto lifeCompensationRequestDto) {
        return calculator.calculateLifeCompensation(lifeCompensationRequestDto);
    }

}
