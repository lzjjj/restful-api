package com.parkingLot.restful.api.controller;

import com.parkingLot.restful.api.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingLotController {
    @Autowired
    private ParkingLotService ParkingLotService;
}
