package com.formula;

import com.dto.CompensationResponseDto;
import com.dto.LifeCompensationRequestDto;
import com.dto.PropertyCompensationRequestDto;
import com.dto.VehicleCompensationRequestDto;

public interface CompensationFormula {

    CompensationResponseDto calculateVehicleCompensation(VehicleCompensationRequestDto vehicleCompensationRequestDto);

    CompensationResponseDto calculatePropertyCompensation(PropertyCompensationRequestDto propertyCompensationRequestDto);

    CompensationResponseDto calculateLifeCompensation(LifeCompensationRequestDto lifeCompensationRequestDto);

}
