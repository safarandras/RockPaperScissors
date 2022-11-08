package com.safarandras.RockPaperScissors.dto;

import com.safarandras.RockPaperScissors.model.Hand;
import com.safarandras.RockPaperScissors.model.Rule;

public class GameWithRuleDTO {
    private final boolean hasPlayerWon;
    private final Hand computerHand;
    private final Rule rule;

    public GameWithRuleDTO(Hand computerHand, boolean hasPlayerWon, Rule rule) {
        this.hasPlayerWon = hasPlayerWon;
        this.computerHand = computerHand;
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "GameWithRuleDTO{" +
                "hasPlayerWon=" + hasPlayerWon +
                ", computerHand=" + computerHand.getLabel() +
                ", rule=" + rule.getRule() +
                '}';
    }
}
