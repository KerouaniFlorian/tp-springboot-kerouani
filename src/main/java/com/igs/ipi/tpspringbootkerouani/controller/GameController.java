package com.igs.ipi.tpspringbootkerouani.controller;

import com.igs.ipi.tpspringbootkerouani.service.GameService;
import com.igs.ipi.tpspringbootkerouani.model.GameModel;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

    private GameService gameService;

    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @RequestMapping("/game/new")
    public ModelAndView newGame(){
        ModelAndView mav = new ModelAndView();
        GameModel gameModel = gameService.newGame();
        mav.addObject("game", gameModel);
        mav.setViewName("game");
        return mav;
    }
}
