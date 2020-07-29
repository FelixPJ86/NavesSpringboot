package org.felix.service;

import java.util.List;

import org.felix.entity.Tripulantes;

public interface TripulantesService {
	
	List<Tripulantes> findAll();
	
	
	List<Tripulantes> generarTripulantes(int cantidad, int genero );

}
