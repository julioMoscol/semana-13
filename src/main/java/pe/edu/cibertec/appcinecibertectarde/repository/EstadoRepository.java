package pe.edu.cibertec.appcinecibertectarde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,
        Integer> {
}
