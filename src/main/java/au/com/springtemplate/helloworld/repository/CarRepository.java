package au.com.springtemplate.helloworld.repository;

import au.com.springtemplate.helloworld.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Car entity.
 */
public interface CarRepository extends JpaRepository<Car, Long> {

}
