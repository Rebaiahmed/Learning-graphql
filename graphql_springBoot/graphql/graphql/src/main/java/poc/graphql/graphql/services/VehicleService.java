package poc.graphql.graphql.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import poc.graphql.graphql.dao.Vehicle;
import poc.graphql.graphql.dao.repository.VehicleRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehicleService {

    private final VehicleRepository vehicleRepository ;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }


    @Transactional(readOnly = true)
    public List<Vehicle> getAllVehicles(int count) {
        return this.vehicleRepository.findAll().stream().limit(count).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Optional<Vehicle> getVehicle(int id) {
        return this.vehicleRepository.findById(id);
    }

    public Vehicle createVehicle(String type, String modelCode, String brandName, String launchDate) {
        final Vehicle vehicle = new Vehicle();
        vehicle.setType(type);
        vehicle.setModelCode(modelCode);
        vehicle.setBrandName(brandName);
        vehicle.setLaunchDate(LocalDate.parse(launchDate));
        return this.vehicleRepository.save(vehicle);
    }
}
