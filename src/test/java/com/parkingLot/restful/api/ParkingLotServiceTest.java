package com.parkingLot.restful.api;

import com.parkingLot.restful.api.modal.ParkingLot;
import com.parkingLot.restful.api.serviceImpl.ParkingLotServiceImpl;
import com.parkingLot.restful.api.util.CompareList;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingLotServiceTest {
    @Test
    public void should_return_a_parkingLot_when_add_parkingLot() {
        ParkingLotServiceImpl parkingLotService = new ParkingLotServiceImpl();
        ParkingLot parkingLot = new ParkingLot( 8,5,null);
        Assert.assertThat(parkingLotService.addParkingLot(parkingLot),Is.is(parkingLot));

    }
    @Test
    public void should_return_parkingLotList_when_findAllParkingLot() {
        ParkingLotServiceImpl parkingLotService = new ParkingLotServiceImpl();
        List<ParkingLot> list = RestfulApiApplication.allParkingLots();
        CompareList compareList = new CompareList();
        Assert.assertThat(compareList.isEqual( parkingLotService.findAllParkingLot(), list),Is.is(true));
    }
    @Test
    public void should_return_a_parkingLot_when_add_parkingLot_for_a_boy() {
        ParkingLotServiceImpl parkingLotService = new ParkingLotServiceImpl();
        ParkingLot parkingLot = new ParkingLot( 8,5,null);
        parkingLotService.addParkingLot( parkingLot );
        Assert.assertThat(parkingLotService.updateParkingLot(8,1),Is.is(parkingLot));

    }
}
