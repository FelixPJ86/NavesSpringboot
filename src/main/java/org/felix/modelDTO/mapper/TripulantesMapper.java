package org.felix.modelDTO.mapper;

import java.util.List;

import org.felix.entity.Tripulantes;
import org.felix.modelDTO.TripulantesDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TripulantesMapper {

	TripulantesDTO tripulanteToDTO(Tripulantes t);
	
	List<TripulantesDTO> tripulantesToDTO(List<Tripulantes> t);
	
}
