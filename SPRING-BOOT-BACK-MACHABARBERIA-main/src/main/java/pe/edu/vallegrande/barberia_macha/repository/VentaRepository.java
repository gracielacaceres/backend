package pe.edu.vallegrande.barberia_macha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.barberia_macha.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
