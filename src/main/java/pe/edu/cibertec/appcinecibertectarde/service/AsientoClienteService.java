package pe.edu.cibertec.appcinecibertectarde.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.cibertec.appcinecibertectarde.model.bd.AsientoCliente;
import pe.edu.cibertec.appcinecibertectarde.model.bd.RegistroAsiento;
import pe.edu.cibertec.appcinecibertectarde.model.response.ResultadoResponse;
import pe.edu.cibertec.appcinecibertectarde.repository.AsientoClienteRepository;
import pe.edu.cibertec.appcinecibertectarde.repository.RegistroAsientoRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class AsientoClienteService {
    private AsientoClienteRepository asientoClienteRepository;
    private RegistroAsientoRepository registroAsientoRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.READ_COMMITTED)
    public ResultadoResponse registrarAsientoCliente(RegistroAsiento registroAsiento, List<AsientoCliente> asientoClienteList){

        RegistroAsiento nuevoRegistroAsiento = registroAsientoRepository.save(registroAsiento);
        for (AsientoCliente asiento: asientoClienteList) {
            asiento.setIdrasiento(nuevoRegistroAsiento.getIdrasiento());
            asientoClienteRepository.save(asiento);
        }
        return null;
    }
}
