package com.service;

import com.dto.CompensationResponseDto;
import com.dto.LifeCompensationRequestDto;
import com.dto.PropertyCompensationRequestDto;
import com.dto.VehicleCompensationRequestDto;

public interface CompensationService {

    CompensationResponseDto calculateCompensation(VehicleCompensationRequestDto vehicleCompensationRequestDto);

    CompensationResponseDto calculateCompensation(PropertyCompensationRequestDto propertyCompensationRequestDto);

    CompensationResponseDto calculateCompensation(LifeCompensationRequestDto lifeCompensationRequestDto);

}
