package com.example.demo.repositories;




import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.EnableIncident;

@Repository
public interface IncidentMongoRepository  extends MongoRepository<EnableIncident,Integer> {
	
	
	List<EnableIncident> findByEmail(String email);
	List<EnableIncident> findByAssignedTo(String name);
	Optional<EnableIncident> findById(String id);
	int countByStatus(String status);
	long countByStatusAndEmail(String status, String email);
	int countByDateOfIncidentBetween(Date startDateAsDate, Date endDateAsDate);
	int countByPriority(String string);
	
	


}