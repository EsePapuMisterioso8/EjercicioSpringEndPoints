package mx.fes.aragon.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "fes")
public class Inicio {

    @GetMapping("Inicio")
    public String getInicio(Model model) {
        model.addAttribute("saludo", "Soy tu padre");
        return "index";
    }

    @GetMapping("principal")
    public String getPrincipal(Model model) {
        model.addAttribute("saludo", "Soy tu padre");
        return "principal";
    }

    @GetMapping("paginaUno")
    public String getPaginaUno(Model model){
        return "paginaUno";
    }

    @GetMapping("paginaDos")
    public String getPaginaDos(Model model){
        return "paginaDos";
    }

    @GetMapping("paginaTres")
    public String getPaginaTres(Model model){
        return "paginaTres";
    }


}
