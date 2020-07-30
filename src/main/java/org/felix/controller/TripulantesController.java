package org.felix.controller;


import java.util.List;

import org.felix.entity.Tripulantes;
import org.felix.modelDTO.TripulantesDTO;
import org.felix.modelDTO.mapper.TripulantesMapper;
import org.felix.service.TripulantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class TripulantesController {
	
	@Autowired
	private TripulantesService triService;
		
	@Autowired
	private TripulantesMapper tpMapper;
	
//	@GetMapping("/rest/tripulantes")
//	public ResponseEntity<List<TripulantesDTO>> findAll(){
//		List<Tripulantes> l =	triService.findAll();
//		return new ResponseEntity<List<TripulantesDTO>>(tpMapper.tripulantesToDTO(l),HttpStatus.OK);		
//	}
//	
//	@PostMapping("/rest/tripulantes")
//	public ResponseEntity<List<TripulantesDTO>> generarTripulantes(int cantidad, int genero ){
//
//		return new ResponseEntity<List<TripulantesDTO>>(tpMapper.tripulantesToDTO(triService.generarTripulantes(cantidad, genero)),HttpStatus.OK);
//		
//	}
	
	
	
	
}
