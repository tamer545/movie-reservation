package com.m133.project.projecttimokai;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.logging.Logger;

@Controller
public class MovieController {
    static Logger log = Logger.getLogger("MovieController");

    @GetMapping("/")
    public String indexPage(Model model) {
        model.addAttribute("movie", new Movie());
        return "index";
    }

    @GetMapping("/movie")
    public String movieForm(Model model) {
        model.addAttribute("movie", new Movie());
        return "movie";
    }

    @PostMapping("/movie")
    public String checkMovie(@ModelAttribute @Valid Movie movie, BindingResult bindingResult, Model model) {
        log.info("check movie info/post");
        model.addAttribute("movie", movie);
        if (bindingResult.hasErrors()){
            return "movie";
        }
        return "response";
    }

}
