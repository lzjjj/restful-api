package com.parkingLot.restful.api.modal;

import java.util.UUID;

public class Order {
    private String orderID;
    private String receiptID;
    private Integer parkingLotID;
    private String parkingStatus;

    public Order() {
        this.orderID = UUID.randomUUID().toString();
        this.receiptID = UUID.randomUUID().toString();
        this.parkingLotID = null;
        this.parkingStatus = "unPark";
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(String receiptID) {
        this.receiptID = receiptID;
    }

    public Integer getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(Integer parkingLotID) {
        this.parkingLotID = parkingLotID;
    }

    public String getParkingStatus() {
        return parkingStatus;
    }

    public void setParkingStatus(String parkingStatus) {
        this.parkingStatus = parkingStatus;
    }
}
