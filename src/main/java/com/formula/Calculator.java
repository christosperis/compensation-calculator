package com.formula;

import com.dto.CompensationResponseDto;
import com.dto.LifeCompensationRequestDto;
import com.dto.PropertyCompensationRequestDto;
import com.dto.VehicleCompensationRequestDto;
import org.springframework.stereotype.Component;

@Component
public class Calculator implements CompensationFormula {

    /*
      Write your own calculation formula
     */

    @Override
    public CompensationResponseDto calculateVehicleCompensation(VehicleCompensationRequestDto vehicleCompensationRequestDto) {
        return new CompensationResponseDto(8500L, 500.41);
    }

    @Override
    public CompensationResponseDto calculatePropertyCompensation(PropertyCompensationRequestDto propertyCompensationRequestDto) {
        return new CompensationResponseDto(9500L, 52.11);
    }

    @Override
    public CompensationResponseDto calculateLifeCompensation(LifeCompensationRequestDto lifeCompensationRequestDto) {
        return new CompensationResponseDto(10000L, 10.50);
    }

}
