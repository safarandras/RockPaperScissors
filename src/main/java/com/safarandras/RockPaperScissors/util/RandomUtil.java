package com.safarandras.RockPaperScissors.util;

import org.springframework.stereotype.Component;

import java.util.Random;
@Component
public class RandomUtil {
    private static final Random RANDOM = new Random();

    public int nextInt(int range){
        return RANDOM.nextInt(range);
    }
}
