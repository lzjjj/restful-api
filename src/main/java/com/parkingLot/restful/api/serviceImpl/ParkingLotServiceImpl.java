package com.parkingLot.restful.api.serviceImpl;

import com.parkingLot.restful.api.RestfulApiApplication;
import com.parkingLot.restful.api.modal.ParkingLot;
import com.parkingLot.restful.api.service.ParkingLotService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ParkingLotService")
public class ParkingLotServiceImpl implements ParkingLotService {
    private List<ParkingLot> parkingLotList = RestfulApiApplication.allParkingLots();

    @Override
    public List <ParkingLot> findAllParkingLot() {
        return parkingLotList;
    }

    @Override
    public ParkingLot addParkingLot(ParkingLot parkingLot) {
        parkingLotList.add( parkingLot );
        return parkingLot;
    }

}
