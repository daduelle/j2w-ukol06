package cz.czechitas.java2webapps.ukol6.controller;

import cz.czechitas.java2webapps.ukol6.service.CitatyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 */
@Controller
public class CitatyController {

    private final CitatyService citaty;

    @Autowired
    public CitatyController(CitatyService citaty) {
        this.citaty = citaty;
    }

    @GetMapping("/")
    public ModelAndView nahodnyCitat() {
        ModelAndView modelAndView = new ModelAndView("citat");
        modelAndView.addObject("citat", citaty.nahodnyCitat());
        return modelAndView;
    }

    @GetMapping("/{index}")
    public ModelAndView konkretniCitat(@PathVariable int index) {
        ModelAndView modelAndView = new ModelAndView("citat");
        modelAndView.addObject("citat", citaty.konkretniCitat(index));
        return modelAndView;
    }
}
