package com.parkingLot.restful.api.controller;

import com.parkingLot.restful.api.modal.ParkingLot;
import com.parkingLot.restful.api.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ParkingLotController {
    @Autowired
    private ParkingLotService ParkingLotService;

    @PostMapping("/parkingLots")
    @ResponseBody
    public ParkingLot addParkingLot(@RequestBody ParkingLot parkingLot) {
        return ParkingLotService.addParkingLot( parkingLot );
    }
    @GetMapping("/parkingLots")
    @ResponseBody
    public List<ParkingLot> findAllParkingLot() {
        return ParkingLotService.findAllParkingLot(  );
    }

}
