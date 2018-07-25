package com.parkingLot.restful.api;

import com.parkingLot.restful.api.modal.ParkingLot;
import com.parkingLot.restful.api.serviceImpl.ParkingLotServiceImpl;
import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ParkingLotServiceTest {
    @Test
    public void should_return_a_parkingLot_when_add_parkingLot() {
        ParkingLotServiceImpl parkingLotService = new ParkingLotServiceImpl();
        ParkingLot parkingLot = new ParkingLot( 8,5);
        Assert.assertThat(parkingLotService.addParkingLot(parkingLot),Is.is(parkingLot));

    }
}
