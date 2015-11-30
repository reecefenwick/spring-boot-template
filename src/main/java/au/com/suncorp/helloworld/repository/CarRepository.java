package au.com.suncorp.helloworld.repository;

import au.com.suncorp.helloworld.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Car entity.
 */
public interface CarRepository extends JpaRepository<Car, Long> {

}
