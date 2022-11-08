package com.safarandras.RockPaperScissors.model;

import java.util.HashMap;
import java.util.Map;

public enum Rule {
    ROCK_WINS("Rock wins against scissors"),
    ROCK_LOSES("Rock loses against paper"),
    PAPER_WINS("Paper wins against rock"),
    PAPER_LOSES("Paper loses against scissors"),
    SCISSORS_WINS("Scissors wins against paper"),
    SCISSORS_LOSES("Scissors loses against rock"),
    TIE("Matching hands tie");

    private final String rule;

    Rule(String rule){
        this.rule = rule;
    }

    public String getRule() {
        return rule;
    }

    public Map<Rule, String> getALlRules(){
        Map<Rule, String> rules = new HashMap<>();
        for (Rule rule : Rule.values()){
            rules.put(rule, rule.getRule());
        }
        return rules;
    }
}
