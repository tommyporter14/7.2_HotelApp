package co.grandcircus.HotelApp;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelRepository extends MongoRepository<Hotel, String>{

	List<Hotel> findAll();

	List<Hotel> findByCity(String city, Sort sort);
}