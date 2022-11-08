package com.safarandras.RockPaperScissors.dto;

public class GamePlayerHandDTO {
    private String playerHand;

    public GamePlayerHandDTO() {
    }

    public GamePlayerHandDTO(String playerHand) {
        this.playerHand = playerHand;
    }

    public String getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(String playerHand) {
        this.playerHand = playerHand;
    }

    @Override
    public String toString() {
        return "GamePlayerHandDTO{" +
                "playerHand='" + playerHand + '\'' +
                '}';
    }
}
