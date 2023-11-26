package pe.edu.cibertec.appcinecibertectarde.service;

import lombok.AllArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Rol;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Usuario;
import pe.edu.cibertec.appcinecibertectarde.repository.RolRepository;
import pe.edu.cibertec.appcinecibertectarde.repository.UsuarioRepository;

import java.util.Arrays;
import java.util.HashSet;


@Service
@AllArgsConstructor
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    private RolRepository rolRepository;
    private BCryptPasswordEncoder bcryptPasswordEnconder
            = new BCryptPasswordEncoder();

    public Usuario saveUser(Usuario usuario){
        usuario.setPassword(
                bcryptPasswordEnconder.encode(usuario.getPassword()));
        usuario.setActivo(true);
        Rol usuarioRol = rolRepository.findByNomrol("USER");
        usuario.setRoles(new HashSet<>(Arrays.asList(usuarioRol)));
        return usuarioRepository.save(usuario);
    }

}
