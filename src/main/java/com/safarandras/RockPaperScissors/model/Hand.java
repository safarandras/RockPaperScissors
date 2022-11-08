package com.safarandras.RockPaperScissors.model;

public enum Hand {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");

    private final String label;

    Hand(String label){
        this.label=label;
    }

    public String getLabel() {
        return label;
    }

    public static Hand getHandByLabel(String label){
        for (Hand hand:Hand.values()){
            if (hand.getLabel().equalsIgnoreCase(label))
                return hand;
        }
        return null;
    }
}

