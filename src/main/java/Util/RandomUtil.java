package Util;

import java.util.Random;

public class RandomUtil {
    private static final Random RANDOM = new Random();

    public int nextInt(int range){
        return RANDOM.nextInt(range);
    }
}
