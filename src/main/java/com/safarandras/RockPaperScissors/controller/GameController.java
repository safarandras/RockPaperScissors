package com.safarandras.RockPaperScissors.controller;

import com.safarandras.RockPaperScissors.dto.DTO;
import com.safarandras.RockPaperScissors.dto.ErrorMessageDTO;
import com.safarandras.RockPaperScissors.dto.PlayerHandDTO;
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
    public ResponseEntity<DTO> playGame(@RequestParam boolean explain, @RequestBody PlayerHandDTO body){
        try{
            return ResponseEntity.ok(gameService.playGame(body.getPlayerHand(), explain));
        }
        catch (IllegalArgumentException e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ErrorMessageDTO(
                    String.format("Given word '%s' does not mach any hand(rock, paper, scissors)", body.getPlayerHand())));
        }
    }
}
