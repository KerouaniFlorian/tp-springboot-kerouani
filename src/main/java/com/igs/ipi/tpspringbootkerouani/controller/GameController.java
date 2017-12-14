package com.igs.ipi.tpspringbootkerouani.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

    @RequestMapping("/game/new")
    public ModelAndView newGame(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("game");
        return mav;
    }
}
