package cl.edutecno.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Alumno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String rut;
	private String nombre;
	private String Apellido;
	private String email;
	private Integer edad;
	private String fechaIngreso;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "direccion_id", referencedColumnName = "id")
	private Direccion direccion;
}
