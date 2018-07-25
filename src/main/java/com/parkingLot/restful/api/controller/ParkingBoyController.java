package com.parkingLot.restful.api.controller;

import com.parkingLot.restful.api.modal.ParkingBoy;
import com.parkingLot.restful.api.modal.ParkingLot;
import com.parkingLot.restful.api.service.ParkingBoyService;
import com.parkingLot.restful.api.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ParkingBoyController {
    @Autowired
    private ParkingBoyService parkingBoyService;

    @PostMapping("/parkingBoys")
    @ResponseBody
    public ParkingBoy addParkingLot(@RequestBody ParkingBoy parkingBoy) {
        return parkingBoyService.addParkingBoy( parkingBoy );
    }

    @GetMapping("/parkingBoys")
    @ResponseBody
    public List <ParkingBoy> findAllParkingBoy() {
        return parkingBoyService.findAllParkingBoy();
    }

//    @PostMapping("/parkingBoys/parkingBoy/{id}/parkingLots")
//    @ResponseBody
//    public List <ParkingLot> addParkingLot(@PathVariable Integer id ,@RequestBody ParkingLot parkingLot) {
//        return parkingBoyService.addParkingLot(id, parkingLot);
//    }
}
