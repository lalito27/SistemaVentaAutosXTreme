package pe.com.autoxtreme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "carro")
@Data
public class Carro {
    @Id
    @Column(name = "IdCarro")
    private int id;

    @Column(name = "Descripcion")
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
}
