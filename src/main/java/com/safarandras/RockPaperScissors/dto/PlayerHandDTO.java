package com.safarandras.RockPaperScissors.dto;

public class PlayerHandDTO extends DTO {
    private String playerHand;

    public PlayerHandDTO() {
    }

    public PlayerHandDTO(String playerHand) {
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
                "playerHand=" + playerHand + '\'' +
                '}';
    }
}
