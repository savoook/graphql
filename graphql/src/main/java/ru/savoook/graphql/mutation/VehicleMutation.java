package ru.savoook.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.savoook.graphql.entity.Vehicle;
import ru.savoook.graphql.service.VehicleService;

@Component
@RequiredArgsConstructor
public class VehicleMutation implements GraphQLMutationResolver {

    private VehicleService vehicleService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }
}
