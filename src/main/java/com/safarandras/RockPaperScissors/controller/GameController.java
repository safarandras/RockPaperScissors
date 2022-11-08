package com.safarandras.RockPaperScissors.controller;

import com.safarandras.RockPaperScissors.dto.GameDTO;
import com.safarandras.RockPaperScissors.model.Rule;
import com.safarandras.RockPaperScissors.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class GameController {
    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @RequestMapping("/rules")
    public Map<Rule,String> getRules(){
        return Rule.getAllRules();
    }

    @RequestMapping(path = "/play", method = POST)
    public ResponseEntity<GameDTO> playGame(@RequestParam boolean explain, @RequestBody String playerHand){
        try{
            return new ResponseEntity<>(gameService.playGame(playerHand, explain), HttpStatus.OK);
        }
        catch (IllegalArgumentException e){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
