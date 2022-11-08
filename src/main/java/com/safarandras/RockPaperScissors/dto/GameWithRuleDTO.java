package com.safarandras.RockPaperScissors.dto;

import java.io.Serializable;

public class GameWithRuleDTO extends DTO implements Serializable {
    private  boolean hasPlayerWon;
    private  String computerHand;
    private  String rule;

    public GameWithRuleDTO(String computerHand, boolean hasPlayerWon, String rule) {
        this.hasPlayerWon = hasPlayerWon;
        this.computerHand = computerHand;
        this.rule = rule;
    }

    public boolean isHasPlayerWon() {
        return hasPlayerWon;
    }

    public void setHasPlayerWon(boolean hasPlayerWon) {
        this.hasPlayerWon = hasPlayerWon;
    }

    public String getComputerHand() {
        return computerHand;
    }

    public void setComputerHand(String computerHand) {
        this.computerHand = computerHand;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    @Override
    public String toString() {
        return "GameWithRuleDTO{" +
                "hasPlayerWon=" + hasPlayerWon +
                ", computerHand=" + computerHand +
                ", rule=" + rule +
                '}';
    }
}
