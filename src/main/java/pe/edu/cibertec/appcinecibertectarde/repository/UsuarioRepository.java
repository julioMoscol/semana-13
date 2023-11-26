package pe.edu.cibertec.appcinecibertectarde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Usuario;

import java.util.List;

@Repository
public interface UsuarioRepository extends
        JpaRepository<Usuario, Integer>
{
    Usuario findByNomusuario(String nomusuario);
/*
    @Query(value = "{call sp_obtenerUsuario(:nomusuario)}",
    nativeQuery = true)
    Usuario buscarPorNomusuario(
            @Param("nomusuario") String nomusuario);

 */

}