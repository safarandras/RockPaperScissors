package com.safarandras.RockPaperScissors.service;

import com.safarandras.RockPaperScissors.dto.DTO;
import com.safarandras.RockPaperScissors.dto.GameWithRuleDTO;
import com.safarandras.RockPaperScissors.dto.GameWithoutRuleDTO;
import com.safarandras.RockPaperScissors.model.Game;
import com.safarandras.RockPaperScissors.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameService {
    private final RandomUtil randomUtil;
    @Autowired
    public GameService(RandomUtil randomUtil) {
        this.randomUtil = randomUtil;
    }

    public DTO playGame(String playerHand, boolean explain) throws IllegalArgumentException{
        Game game = new Game(playerHand, randomUtil);
        boolean hasPlayerWon = game.hasPlayerWon();
        String computerHand = game.getComputerHand().getLabel();
        String rule = game.getRule().getRule();
        if (explain) return new GameWithRuleDTO(computerHand, hasPlayerWon, rule);
        return new GameWithoutRuleDTO(computerHand, hasPlayerWon);
    }
}
