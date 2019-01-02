package com.api;

import com.dto.CompensationResponseDto;
import com.dto.LifeCompensationRequestDto;
import com.dto.PropertyCompensationRequestDto;
import com.dto.VehicleCompensationRequestDto;
import com.service.CompensationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class CompensationApiImpl implements CompensationApi {

    @Autowired
    private CompensationService compensationService;

    @Override
    public CompensationResponseDto calculateCompensation(@Valid @RequestBody VehicleCompensationRequestDto vehicleCompensationRequestDto) {
        return compensationService.calculateCompensation(vehicleCompensationRequestDto);
    }

    @Override
    public CompensationResponseDto calculateCompensation(@Valid @RequestBody PropertyCompensationRequestDto propertyCompensationRequestDto) {
        return compensationService.calculateCompensation(propertyCompensationRequestDto);
    }

    @Override
    public CompensationResponseDto calculateCompensation(@Valid @RequestBody LifeCompensationRequestDto lifeCompensationRequestDto) {
        return compensationService.calculateCompensation(lifeCompensationRequestDto);
    }

}
