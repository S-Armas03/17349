package mx.uv.listi.a17349.saludar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class PlantillaControlador {
    @GetMapping("/plantilla/{parametro}")
    public String plantilla(Model modelo, @PathVariable String parametro){
        modelo.addAttribute("usuario",parametro);
        return "archivo";
    }
}