package cl.jesus.registropersona.controller;

import cl.jesus.registropersona.model.Persona;
import cl.jesus.registropersona.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("list", personaService.getAll());
        return "index";
    }

    @GetMapping("/save/{id}")
    public String showSave(@PathVariable("id") Long id, Model model) {
        if (id != null && id != 0) {
            model.addAttribute("persona", personaService.get(id));
        } else {
            model.addAttribute("persona", new Persona());
        }
        return "save";
    }

    @PostMapping("/save")
    public String save(Persona persona, RedirectAttributes redirectAttributes) {
        personaService.save(persona);
        String mensaje = "Persona guardada satisfactoriamente: " + persona.getNombre();
        redirectAttributes.addFlashAttribute("mensaje", mensaje);
        return "redirect:/";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id, Model model) {
        personaService.delete(id);

        return "redirect:/";
    }

}
