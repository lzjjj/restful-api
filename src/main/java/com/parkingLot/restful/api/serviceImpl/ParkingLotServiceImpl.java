package com.parkingLot.restful.api.serviceImpl;

import com.parkingLot.restful.api.RestfulApiApplication;
import com.parkingLot.restful.api.modal.ParkingLot;
import com.parkingLot.restful.api.service.ParkingLotService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    @Override
    public ParkingLot updateParkingLot(int lID, int bID) {
         ParkingLot parkingLot = parkingLotList
                .stream()
                .filter( i->i.getlID()== lID)
                .collect( Collectors.toList() )
                .get( 0 );
        parkingLot.setbID( bID );
        return parkingLot;
    }
}
