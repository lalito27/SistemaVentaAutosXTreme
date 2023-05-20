package pe.com.autoxtreme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.com.autoxtreme.model.Carro;

public interface ICarroRepository extends JpaRepository<Carro, String> {
}
