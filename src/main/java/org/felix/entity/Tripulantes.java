package org.felix.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TRIPULANTES")
public class Tripulantes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tripulante_id")
	private Integer tripulanteId;
	
	@Column(name = "nombre")
	private String nombre;
	 
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "rango")
	private String rango;
	
	@Column(name = "estado")
	private String estado;

	@Column(name = "especialidad")
	private String especialidad;
	
	@Column(name = "experiencia")
	private Integer experiencia;
	
	@Column(name = "salud")
	private Integer salud;
	
	@Column(name = "nave_id")
	private Integer nave;
	
	@Column(name = "foto")
	private String foto;
	
	
}
