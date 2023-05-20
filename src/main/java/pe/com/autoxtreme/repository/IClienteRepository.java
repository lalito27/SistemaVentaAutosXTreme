package pe.com.autoxtreme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.autoxtreme.model.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, String> {
}
