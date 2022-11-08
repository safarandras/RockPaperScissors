package com.safarandras.RockPaperScissors.service;

import com.safarandras.RockPaperScissors.util.RandomUtil;

public class GameService {
    private final RandomUtil randomUtil;

    public GameService(RandomUtil randomUtil) {
        this.randomUtil = randomUtil;
    }
}
