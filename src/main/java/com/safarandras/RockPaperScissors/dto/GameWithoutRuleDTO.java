package com.safarandras.RockPaperScissors.dto;

import java.io.Serializable;

public class GameWithoutRuleDTO extends DTO implements Serializable{
    private boolean hasPlayerWon;
    private String computerHand;

    public GameWithoutRuleDTO() {
    }

    public GameWithoutRuleDTO(String computerHand, boolean hasPlayerWon) {
        this.hasPlayerWon = hasPlayerWon;
        this.computerHand = computerHand;
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

    @Override
    public String toString() {
        return "GameWithoutRuleDTO{" +
                "hasPlayerWon=" + hasPlayerWon +
                ", computerHand=" + computerHand +
                '}';
    }
}
