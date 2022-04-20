package com.sashassitters.spring5jokesappv2.controller;

import com.sashassitters.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    private String getJoke(final Model model) {
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
