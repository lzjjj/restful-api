package com.parkingLot.restful.api;

import com.parkingLot.restful.api.modal.Order;
import com.parkingLot.restful.api.modal.ParkingBoy;
import com.parkingLot.restful.api.modal.ParkingLot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulApiApplication.class, args);
	}

	public static List<ParkingLot> allParkingLots() {
		List<ParkingLot> parkingLotList = new ArrayList<>(  );
		parkingLotList.add(new ParkingLot(1,5,1));
		parkingLotList.add(new ParkingLot(2,5,2));
		return parkingLotList;
	}

	public static List<ParkingBoy> allParkingBoys() {
		List<ParkingBoy> parkingBoyList = new ArrayList<>(  );
		parkingBoyList.add(new ParkingBoy(1));
		parkingBoyList.add(new ParkingBoy(2));
		return parkingBoyList;
	}
	public static List<Order> allOrders() {
		List<Order> allOrders = new ArrayList<>(  );
		allOrders.add(new Order());
		allOrders.add(new Order());
		return allOrders;
	}
}
