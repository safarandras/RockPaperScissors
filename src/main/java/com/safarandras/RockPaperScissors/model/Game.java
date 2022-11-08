package com.safarandras.RockPaperScissors.model;

import com.safarandras.RockPaperScissors.util.RandomUtil;

public class Game {
    private final Hand playerHand;
    private final Hand computerHand;

    public Game(String handLabel, RandomUtil random){
        if (Hand.getHandByLabel(handLabel) == null) throw new IllegalArgumentException();
        playerHand = Hand.getHandByLabel(handLabel);
        int handValue = random.nextInt(2);
        computerHand = Hand.values()[handValue];
    }

    public boolean hasPlayerWon(){
        return playerHand == Hand.PAPER && computerHand == Hand.ROCK ||
                playerHand == Hand.ROCK && computerHand == Hand.SCISSORS ||
                playerHand == Hand.SCISSORS && computerHand == Hand.PAPER;
    }

    public Hand getPlayerHand() {
        return playerHand;
    }

    public Hand getComputerHand(){
        return computerHand;
    }
}
