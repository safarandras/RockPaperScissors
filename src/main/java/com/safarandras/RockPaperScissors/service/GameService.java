package com.safarandras.RockPaperScissors.service;

import com.safarandras.RockPaperScissors.dto.GameDTO;
import com.safarandras.RockPaperScissors.dto.GameWithRuleDTO;
import com.safarandras.RockPaperScissors.dto.GameWithoutRuleDTO;
import com.safarandras.RockPaperScissors.model.Game;
import com.safarandras.RockPaperScissors.model.Hand;
import com.safarandras.RockPaperScissors.model.Rule;
import com.safarandras.RockPaperScissors.util.RandomUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class GameService {
    private final RandomUtil randomUtil;

    public GameService(RandomUtil randomUtil) {
        this.randomUtil = randomUtil;
    }

    public GameDTO playGame(String playerHand, boolean explain) throws IllegalArgumentException{
        Game game = new Game(playerHand, randomUtil);
        Hand computerHand = game.getComputerHand();
        boolean hasPlayerWon = game.hasPlayerWon();
        Rule rule = game.getRule();
        if (explain) return new GameWithRuleDTO(computerHand, hasPlayerWon, rule);
        return new GameWithoutRuleDTO(computerHand, hasPlayerWon);
    }
}
