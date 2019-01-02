package com.api;

import com.dto.CompensationResponseDto;
import com.dto.LifeCompensationRequestDto;
import com.dto.PropertyCompensationRequestDto;
import com.dto.VehicleCompensationRequestDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/api")
public interface CompensationApi {

    @PostMapping(path = "/vehicle/compensation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    CompensationResponseDto calculateCompensation(VehicleCompensationRequestDto vehicleCompensationRequestDto);

    @PostMapping(path = "/property/compensation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    CompensationResponseDto calculateCompensation(PropertyCompensationRequestDto propertyCompensationRequestDto);

    @PostMapping(path = "/life/compensation", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    CompensationResponseDto calculateCompensation(LifeCompensationRequestDto propertyCompensationRequestDto);

}
