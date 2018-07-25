package com.parkingLot.restful.api;

import com.parkingLot.restful.api.modal.ParkingBoy;
import com.parkingLot.restful.api.modal.ParkingLot;
import com.parkingLot.restful.api.serviceImpl.ParkingBoyServiceImpl;
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
public class ParkingBoyServiceTest {
    @Test
    public void should_return_a_parkingBoy_when_add_parkingBoy() {
        ParkingBoyServiceImpl parkingBoyService = new ParkingBoyServiceImpl();
        List<ParkingLot> list = RestfulApiApplication.allParkingLots();
        ParkingBoy parkingBoy = new ParkingBoy( 8,list);
        Assert.assertThat(parkingBoyService.addParkingBoy(parkingBoy),Is.is(parkingBoy));

    }
    @Test
    public void should_return_parkingBoyList_when_findAllParkingBoy() {
        ParkingBoyServiceImpl parkingBoyService = new ParkingBoyServiceImpl();
        List<ParkingBoy> list = RestfulApiApplication.allParkingBoys();
        CompareList compareList = new CompareList();
        Assert.assertThat(compareList.isEqual( parkingBoyService.findAllParkingBoy(), list),Is.is(true));
    }
}
