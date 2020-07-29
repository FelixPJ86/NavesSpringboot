package org.felix.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.felix.entity.Tripulantes;
import org.felix.repository.TripulantesRepository;
import org.felix.service.TripulantesService;
import org.felix.tools.GenerarPersonas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripulantesServiceImpl implements TripulantesService {

	@Autowired
	private TripulantesRepository tpr;

	@Override
	public List<Tripulantes> findAll() {
		return tpr.findAll();
	}

	@Override
	public List<Tripulantes> generarTripulantes(int cantidad, int genero) {		
		List<Tripulantes> lista =new ArrayList<Tripulantes>();
		Tripulantes t;
		Random rd = new Random();
		
		if( cantidad > 0 && cantidad < 30 
			&& genero>=-1 && genero<=1	) {
			for (int i = 0; i < cantidad; i++) {
				String nombre=GenerarPersonas.nombreAleatorio(genero);

					t=new Tripulantes();
					t.setNombre(nombre.split(":")[0]);
					t.setApellido(nombre.split(":")[1]);
					t.setEspecialidad("-");
					t.setEstado("OK");
					t.setExperiencia(rd.nextInt(101));
					t.setNave(1);
					t.setRango("-");
					t.setSalud(100);
					List<Tripulantes> listaFotos = tpr.findAll();
					boolean fotoRepe=true;
					int numFoto;
					numFoto=rd.nextInt(501);
					String fotoNombre="";
					
					while (fotoRepe==true) {
						fotoRepe=false;
						numFoto=rd.nextInt(501);
						if(nombre.split(":")[2].equals("1")) {
							fotoNombre="H_foto ("+numFoto+").png";
						}else {
							fotoNombre="M_foto ("+numFoto+").png";
						}
						for (Tripulantes tri : listaFotos) {
							if(tri.getFoto()!=null && tri.getFoto().equals(fotoNombre)) {
								fotoRepe=true;
							}
													}
					}
					t.setFoto(fotoNombre);
					lista.add(t);
			}	
		}
		
		return tpr.saveAll(lista);
	}

}
