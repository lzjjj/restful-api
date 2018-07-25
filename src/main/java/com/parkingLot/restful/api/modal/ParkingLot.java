package com.parkingLot.restful.api.modal;

import java.util.Objects;

public class ParkingLot {
    private Integer lID;
    private Integer size;
    private Integer bID;

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }

    private Integer currentNum;

    public Integer getlID() {
        return lID;
    }

    public void setlID(Integer lID) {
        this.lID = lID;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getbID() {
        return bID;
    }

    public void setbID(Integer bID) {
        this.bID = bID;
    }

    public ParkingLot(Integer lID, Integer size, Integer bID) {
        this.lID = lID;
        this.size = size;
        this.bID = bID;
        this.currentNum = 0;
    }
    public boolean isFull(){
        if(currentNum<size){
            return false;
        }
        return true;
    }
    public ParkingLot() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkingLot)) return false;
        ParkingLot that = (ParkingLot) o;
        return Objects.equals( lID, that.lID ) &&
                Objects.equals( size, that.size ) &&
                Objects.equals( bID, that.bID );
    }


}
