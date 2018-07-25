package com.parkingLot.restful.api.serviceImpl;

import com.parkingLot.restful.api.RestfulApiApplication;
import com.parkingLot.restful.api.modal.Order;
import com.parkingLot.restful.api.modal.ParkingBoy;
import com.parkingLot.restful.api.modal.ParkingLot;
import com.parkingLot.restful.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service("OrderService")
public class OrderServiceImpl implements OrderService {
    private List <Order> OrderList = RestfulApiApplication.allOrders();
    @Autowired
    private ParkingLotServiceImpl parkingLotService;
    private ParkingBoyServiceImpl parkingBoyService;

    @Override
    public Order createOrder() {
        Order order = new Order();
        OrderList.add( order );
        return order;
    }

    @Override
    public List <Order> findAllOrders() {
        return OrderList;
    }

    @Override
    public Order robTicket(String orderID, int parkingBoyID) {

        ParkingLot parkingLot = parkingLotService.findAllParkingLot()
                .stream()
                .filter( i -> i.getbID() == parkingBoyID )
                .collect( Collectors.toList() ).get( 0 );
        if (!parkingLot.isFull()) {
            parkingLot.setCurrentNum( parkingLot.getCurrentNum() + 1 );
            Order order = OrderList.stream()
                    .filter( i -> i.getOrderID().equals( orderID ) )
                    .collect( Collectors.toList() )
                    .get( 0 );
            order.setParkingLotID( parkingLot.getlID() );
            order.setParkingStatus( "park" );
            return order;
        }
        throw new RuntimeException();
    }

    @Override
    public Boolean unPark(String orderID) {

       Order order = OrderList.stream()
               .filter(i->i.getOrderID()
                       .equals( orderID ))
               .collect( Collectors.toList() )
               .get( 0 );
       if(order.getParkingStatus().equals( "park" )){
           ParkingLot parkingLot = parkingLotService.findAllParkingLot()
                   .stream()
                   .filter( i -> i.getlID() == order.getParkingLotID() )
                   .collect( Collectors.toList() ).get( 0 );
           parkingLot.setCurrentNum( parkingLot.getCurrentNum()-1 );
           OrderList.remove( order );
           return true;
       }
        throw new RuntimeException();
    }
}
