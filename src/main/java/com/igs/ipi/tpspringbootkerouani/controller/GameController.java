package com.igs.ipi.tpspringbootkerouani.controller;

import com.igs.ipi.tpspringbootkerouani.service.GameService;
import com.igs.ipi.tpspringbootkerouani.model.GameModel;
import com.igs.ipi.tpspringbootkerouani.service.PartieEnCours;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GameController {

    private GameService gameService;
    private PartieEnCours partieEnCours;

    public GameController(GameService gameService, PartieEnCours partieEnCours) {
        this.gameService = gameService;
        this.partieEnCours = partieEnCours;
    }

    @RequestMapping("/game/new")
    public ModelAndView newGame(){
        ModelAndView mav = new ModelAndView();
        GameModel gameModel = gameService.newGame();
        partieEnCours.setGameModel(gameModel);
        mav.addObject("game", gameModel);
        mav.setViewName("game");
        return mav;
    }

    @RequestMapping("/game")
    public ModelAndView game(){
        ModelAndView mav = new ModelAndView();
        GameModel gameModel = gameService.newGame();
        mav.addObject("game", gameModel);
        mav.setViewName("game");
        return mav;
    }
}
