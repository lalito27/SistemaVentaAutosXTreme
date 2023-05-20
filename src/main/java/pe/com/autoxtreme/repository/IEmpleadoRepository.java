package pe.com.autoxtreme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.autoxtreme.model.Empleado;

@Repository
public interface IEmpleadoRepository extends JpaRepository<Empleado, Integer> {
    Empleado findByUserAndClave(String user, String clave);

}
