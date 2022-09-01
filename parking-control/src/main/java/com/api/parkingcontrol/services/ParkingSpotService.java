package com.api.parkingcontrol.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import java.util.List;
@Service
public class ParkingSpotService {
    

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    public boolean existsByLicensePlateCar(String licensePlateCar){
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }
    public boolean existsByApartmentAndBlock(String ApartmentAndBlock, String block){
        return parkingSpotRepository.existsByApartmentAndBlock(ApartmentAndBlock, block);
    }

    public boolean existsByParkingSpotNumber(String ParkingSpotNumber ){
        return parkingSpotRepository.existsByParkingSpotNumber(ParkingSpotNumber);
    }

    public List<ParkingSpotModel> findAll(){
        return parkingSpotRepository.findAll();
    }
}
