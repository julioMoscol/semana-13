package pe.edu.cibertec.appcinecibertectarde.controller.administracion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Estado;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Sala;
import pe.edu.cibertec.appcinecibertectarde.model.dto.request.SalaDto;
import pe.edu.cibertec.appcinecibertectarde.model.response.ResultadoResponse;
import pe.edu.cibertec.appcinecibertectarde.service.SalaService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/sala")
public class SalaController {
    private SalaService salaService;
    @GetMapping("/frmSala")
    public String frmSala(Model model){
        model.addAttribute("listasalas",
                salaService.listarSalas());
        return "administracion/frmSala";
    }
    @PostMapping("/registrar")
    @ResponseBody
    public ResultadoResponse registrarSala(@RequestBody SalaDto salaDto){
        return salaService.guardarActualizarSala(salaDto);
    }
    @GetMapping("/listar")
    @ResponseBody
    public List<Sala> listarSalas(){
        return salaService.listarSalas();
    }


}
