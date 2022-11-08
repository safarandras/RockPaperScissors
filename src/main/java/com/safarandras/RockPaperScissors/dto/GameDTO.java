package com.safarandras.RockPaperScissors.dto;

import com.safarandras.RockPaperScissors.model.Hand;

public class GameDTO {
    private final boolean hasPlayerWon;
    private final Hand computerHand;

    public GameDTO(Hand computerHand, boolean hasPlayerWon) {
        this.hasPlayerWon = hasPlayerWon;
        this.computerHand = computerHand;
    }

    @Override
    public String toString() {
        return "GameDTO{" +
                "hasPlayerWon=" + hasPlayerWon +
                ", computerHand=" + computerHand.getLabel() +
                '}';
    }
}
