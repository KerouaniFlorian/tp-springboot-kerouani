package com.igs.ipi.tpspringbootkerouani.service;

import com.igs.ipi.tpspringbootkerouani.model.GameModel;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    public GameModel newGame(){
        GameModel gameModel = new GameModel();
        gameModel.setNom1("Pierre");
        gameModel.setNom2("Dylan");
        return gameModel;
    }
}
