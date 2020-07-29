package org.felix.repository;

import org.felix.entity.Tripulantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TripulantesRepository extends JpaRepository<Tripulantes, Integer>{

}
