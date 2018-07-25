package com.parkingLot.restful.api.service;

import com.parkingLot.restful.api.modal.ParkingLot;

import java.util.List;
public interface ParkingLotService {
    public List<ParkingLot> findAllParkingLot();
    public ParkingLot addParkingLot(ParkingLot parkingLot);
}
