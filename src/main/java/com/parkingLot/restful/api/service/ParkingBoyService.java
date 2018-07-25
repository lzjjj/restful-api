package com.parkingLot.restful.api.service;

import com.parkingLot.restful.api.modal.ParkingBoy;
import com.parkingLot.restful.api.modal.ParkingLot;

import java.util.List;

public interface ParkingBoyService {
    public List<ParkingBoy> findAllParkingBoy();
    public ParkingBoy addParkingBoy(ParkingBoy parkingBoy);
}
