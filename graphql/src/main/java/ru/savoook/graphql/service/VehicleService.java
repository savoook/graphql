package ru.savoook.graphql.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.savoook.graphql.entity.Vehicle;
import ru.savoook.graphql.repository.VehicleRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository ;

    public VehicleService(final VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository ;
    }

    @Transactional
    public Vehicle createVehicle(final String type,final String modelCode, final String brandName, final String launchDate) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        return vehicleRepository.save(vehicle);
    }
//    @Transactional(readOnly = true)
    public List<Vehicle> getAllVehicles(final int count) {
        List<Vehicle> all = vehicleRepository.findAll();
        return all.stream().limit(count).collect(Collectors.toList());
    }
//    @Transactional(readOnly = true)
    public Optional<Vehicle> getVehicle(final int id) {
        return vehicleRepository.findById(id);
    }
}