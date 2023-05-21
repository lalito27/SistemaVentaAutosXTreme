package pe.com.autoxtreme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.autoxtreme.model.Marca;

@Repository
public interface IMarcaRepository extends JpaRepository<Marca, Integer>{

}
