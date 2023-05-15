package pe.com.autoxtreme.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pe.com.autoxtreme.model.Empleado;

@Repository
public interface EmpleadoRepository extends CrudRepository<Empleado, Integer> {
    Empleado findByUserAndClave(String user, String clave);

}
