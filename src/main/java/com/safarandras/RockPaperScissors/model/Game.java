package com.safarandras.RockPaperScissors.model;

import com.safarandras.RockPaperScissors.util.RandomUtil;

public class Game {
    private final Hand playerHand;
    private final Hand computerHand;
    private final Rule rule;

    public Game(String handLabel, RandomUtil random) throws IllegalArgumentException{
        if (Hand.getHandByLabel(handLabel) == null) throw new IllegalArgumentException();
        playerHand = Hand.getHandByLabel(handLabel);
        int handValue = random.nextInt(3);
        computerHand = Hand.values()[handValue];
        if (playerHand == Hand.ROCK && computerHand == Hand.SCISSORS) rule = Rule.ROCK_WINS;
        else if (playerHand == Hand.ROCK && computerHand == Hand.PAPER) rule = Rule.ROCK_LOSES;
        else if (playerHand == Hand.PAPER && computerHand == Hand.ROCK) rule = Rule.PAPER_WINS;
        else if (playerHand == Hand.PAPER && computerHand == Hand.SCISSORS) rule = Rule.PAPER_LOSES;
        else if (playerHand == Hand.SCISSORS && computerHand == Hand.PAPER) rule = Rule.SCISSORS_WINS;
        else if (playerHand == Hand.SCISSORS && computerHand == Hand.ROCK) rule = Rule.SCISSORS_LOSES;
        else rule = Rule.TIE;
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

    public Rule getRule(){return rule;}
}
