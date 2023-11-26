package pe.edu.cibertec.appcinecibertectarde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Sala;

@Repository
public interface SalaRepository
        extends JpaRepository<Sala, Integer> {

}
