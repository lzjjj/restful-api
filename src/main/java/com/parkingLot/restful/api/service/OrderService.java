package com.parkingLot.restful.api.service;

import com.parkingLot.restful.api.modal.Order;

import java.util.List;

public interface OrderService {
    public Order createOrder();
    public List<Order> findAllOrders();
    public Order robTicket(String orderID,int parkingBoyID);
    public Boolean unPark(String orderID);
}
