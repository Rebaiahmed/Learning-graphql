package poc.graphql.graphql.dao.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.graphql.graphql.dao.Vehicle;


@Repository
public  interface VehicleRepository  extends JpaRepository<Vehicle, Integer> {
}
