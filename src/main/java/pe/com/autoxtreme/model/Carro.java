package pe.com.autoxtreme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "carro")
@Data
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "IdCarro", nullable = false)
    private int id;

    @Column (name = "Descripcion", length = 45)
    private String descripcion;

    @Column(name = "IdMarca")
    private int idmarca;

    @Column(name = "Origen")
    private String origen;

    @Column(name = "Combustible")
    private String Combustible;

    @Column(name = "Precio")
    private double precio;

    @Column(name = "Stock")
    private int stock;
    
	@ManyToOne
	@JoinColumn(name = "IdMarca", insertable = false, updatable = false)
	Marca objMarca;
	
}


