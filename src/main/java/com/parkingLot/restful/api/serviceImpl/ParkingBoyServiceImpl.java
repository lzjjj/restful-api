package com.parkingLot.restful.api.serviceImpl;

import com.parkingLot.restful.api.RestfulApiApplication;
import com.parkingLot.restful.api.modal.ParkingBoy;
import com.parkingLot.restful.api.modal.ParkingLot;
import com.parkingLot.restful.api.service.ParkingBoyService;
import com.parkingLot.restful.api.service.ParkingLotService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("ParkingBoyService")
public class ParkingBoyServiceImpl implements ParkingBoyService {
    private List<ParkingBoy> parkingBoyList = RestfulApiApplication.allParkingBoys();

    @Override
    public List <ParkingBoy> findAllParkingBoy() {
        return parkingBoyList;
    }

    @Override
    public ParkingBoy addParkingBoy(ParkingBoy parkingBoy) {
        parkingBoyList.add( parkingBoy );
        return parkingBoy;
    }

    @Override
    public List <ParkingLot> addParkingLot(int id,ParkingLot parkingLot) {
        for(ParkingBoy i :parkingBoyList){
            if(i.getId()==id){
                i.getParkingLotList().add( parkingLot );
                break;
            }
        }
        return parkingBoyList.stream()
                .filter( i->i.getId()==id )
                .collect( Collectors.toList() )
                .get( 0 )
                .getParkingLotList();
    }
}
