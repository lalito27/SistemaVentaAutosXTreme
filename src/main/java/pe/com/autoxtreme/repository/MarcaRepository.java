package pe.com.autoxtreme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.autoxtreme.model.Marca;

@Repository
public interface MarcaRepository extends CrudRepository<Marca, Integer>{

}
