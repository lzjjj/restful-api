package com.parkingLot.restful.api.modal;

import java.util.List;
import java.util.Objects;

public class ParkingBoy {
    private Integer id;

    public ParkingBoy(Integer id) {
        this.id = id;
    }

    public ParkingBoy() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkingBoy)) return false;
        ParkingBoy that = (ParkingBoy) o;
        return Objects.equals( id, that.id );
    }

}
