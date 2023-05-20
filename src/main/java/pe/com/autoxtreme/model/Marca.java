package pe.com.autoxtreme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "marca")

public class Marca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "IdMarca", nullable = false)
	private int idmarca;
	@Column (name = "Descripcion", length = 45) 
	private String descripcion;
	
}
