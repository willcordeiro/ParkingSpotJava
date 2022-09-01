package com.api.parkingcontrol.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {
    
    @Autowired
    ParkingSpotService parkingSpotService;

    public ParkingSpotService(ParkingSpotService parkingSpotService){
        this.parkingSpotService = parkingSpotService;
    }
}
