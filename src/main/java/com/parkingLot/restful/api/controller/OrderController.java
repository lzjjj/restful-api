package com.parkingLot.restful.api.controller;

import com.parkingLot.restful.api.modal.Order;
import com.parkingLot.restful.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/orders")
    @ResponseBody
    public Order createOrder() {
        return orderService.createOrder();
    }

    @GetMapping("/orders")
    @ResponseBody
    public List <Order> findAllOrders() {
        return orderService.findAllOrders();
    }

    @PutMapping("/orders/{orderID}/{parkingLotID}")
    @ResponseBody
    public Order robTicket(@PathVariable String orderID, @PathVariable Integer parkingLotID) {
        System.out.println( orderID );
        return orderService.robTicket( orderID, parkingLotID );
    }

    @DeleteMapping("/orders/{orderID}")
    @ResponseBody
    public Boolean unPark(@PathVariable String orderID) {
        System.out.println( orderID );
        return orderService.unPark( orderID);
    }
}
