package com.parkingLot.restful.api.modal;

import java.util.List;

public class ParkingBoy {
    private Integer id;
    private List<ParkingLot> parkingLotList;

    public ParkingBoy(Integer id, List <ParkingLot> parkingLotList) {
        this.id = id;
        this.parkingLotList = parkingLotList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List <ParkingLot> getParkingLotList() {
        return parkingLotList;
    }

    public void setParkingLotList(List <ParkingLot> parkingLotList) {
        this.parkingLotList = parkingLotList;
    }

}
