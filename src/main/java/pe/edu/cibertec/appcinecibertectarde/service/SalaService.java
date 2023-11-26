package pe.edu.cibertec.appcinecibertectarde.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Estado;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Sala;
import pe.edu.cibertec.appcinecibertectarde.model.dto.request.SalaDto;
import pe.edu.cibertec.appcinecibertectarde.model.response.ResultadoResponse;
import pe.edu.cibertec.appcinecibertectarde.repository.SalaRepository;
import java.util.List;

@AllArgsConstructor
@Service
public class SalaService {
    private SalaRepository salaRepository;
    public List<Sala> listarSalas(){
        return salaRepository.findAll();
    }
    public ResultadoResponse guardarActualizarSala(SalaDto salaDto){
        String mensaje = "Sala registrada correctamente";
        boolean respuesta = true;
        try{
            Sala nuevaSala = new Sala();
            if(salaDto.getIdsala() > 0){
                nuevaSala.setIdsala(salaDto.getIdsala());
            }
            nuevaSala.setDescsala(salaDto.getDescsala());
            nuevaSala.setAsientos(salaDto.getAsientos());
            Estado estado = new Estado();
            estado.setIdestado(salaDto.getIdestado());
            nuevaSala.setEstado(estado);
            salaRepository.save(nuevaSala);
        }catch (Exception ex){
            mensaje = "Sala NO registrada";
            respuesta = false;
        }
        return ResultadoResponse.builder()
                .mensaje(mensaje).respuesta(respuesta).build();
    }
}
