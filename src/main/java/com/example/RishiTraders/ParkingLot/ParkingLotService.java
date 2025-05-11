package com.example.RishiTraders.ParkingLot;

import com.example.RishiTraders.ParkingLot.ParkingFeeMethods.ParkingFeeInterface;
import lombok.Data;

import java.util.Date;
import java.util.HashMap;
import java.util.PriorityQueue;

@Data
public class ParkingLotService {
    private String parkingLotId;
    private Integer initialFloors;
    private Integer totalSlots;
    private Integer highestFloorNumber;

}
