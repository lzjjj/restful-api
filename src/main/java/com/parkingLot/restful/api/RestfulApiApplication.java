package com.parkingLot.restful.api;

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
		parkingLotList.add(new ParkingLot(1,5));
		parkingLotList.add(new ParkingLot(2,5));
		return parkingLotList;
	}

	public static List<ParkingBoy> allParkingBoys() {
		List<ParkingBoy> parkingBoyList = new ArrayList<>(  );
		parkingBoyList.add(new ParkingBoy(1,RestfulApiApplication.allParkingLots()));
		parkingBoyList.add(new ParkingBoy(2,RestfulApiApplication.allParkingLots()));
		return parkingBoyList;
	}
}
