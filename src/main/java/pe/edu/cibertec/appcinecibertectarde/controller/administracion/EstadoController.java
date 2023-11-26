package pe.edu.cibertec.appcinecibertectarde.controller.administracion;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.appcinecibertectarde.model.bd.Estado;
import pe.edu.cibertec.appcinecibertectarde.model.response.ResultadoResponse;
import pe.edu.cibertec.appcinecibertectarde.service.EstadoService;

import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping("/administracion/estado")
public class EstadoController {

    private EstadoService estadoService;

    @GetMapping("/frmEstado")
    public String frmEstado(Model model){
        model.addAttribute("listaestados", estadoService.listarEstados());
        return "administracion/frmEstado";
    }

    @PostMapping("/registrar")
    @ResponseBody
    public ResultadoResponse registrarEstado(@RequestBody Estado objEstado){
        return estadoService.registrarEstado(objEstado);
    }
    @GetMapping("/listar")
    @ResponseBody
    public List<Estado> listarEstados(){
        return estadoService.listarEstados();
    }
    @DeleteMapping("/eliminar")
    @ResponseBody
    public ResultadoResponse eliminarEstado(@RequestBody Estado objEstado){
        return estadoService.eliminarEstado(objEstado.getIdestado());
    }

}
