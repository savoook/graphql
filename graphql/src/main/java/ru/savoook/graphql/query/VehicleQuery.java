package ru.savoook.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.savoook.graphql.entity.Vehicle;
import ru.savoook.graphql.service.VehicleService;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class VehicleQuery implements GraphQLQueryResolver {

    private VehicleService vehicleService;

    public List<Vehicle> getVehicles(final int count) {
        return vehicleService.getAllVehicles(count);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return vehicleService.getVehicle(id);
    }
}
