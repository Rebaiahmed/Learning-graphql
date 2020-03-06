package poc.graphql.graphql.query;


import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import poc.graphql.graphql.dao.Vehicle;
import poc.graphql.graphql.services.VehicleService;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService ;

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }
    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }
}
