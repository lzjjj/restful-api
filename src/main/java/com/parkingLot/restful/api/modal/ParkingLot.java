package com.parkingLot.restful.api.modal;

public class ParkingLot {
    private Integer id;
    private Integer size;

    public ParkingLot(Integer id, Integer size) {
        this.id = id;
        this.size = size;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
