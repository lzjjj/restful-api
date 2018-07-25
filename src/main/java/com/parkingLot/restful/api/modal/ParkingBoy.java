package com.parkingLot.restful.api.modal;

import java.util.List;
import java.util.Objects;

public class ParkingBoy {
    private Integer id;
    private List<ParkingLot> parkingLotList;

    public ParkingBoy(Integer id, List <ParkingLot> parkingLotList) {
        this.id = id;
        this.parkingLotList = parkingLotList;
    }

    public ParkingBoy() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkingBoy)) return false;
        ParkingBoy that = (ParkingBoy) o;
        return Objects.equals( id, that.id ) &&
                Objects.equals( parkingLotList, that.parkingLotList );
    }

}
