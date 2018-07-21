package com.ausminersunited;

import java.util.Random;

public class Mathf {
    // Returns true an input percentage of the time. If 2 is input, would return true 2% of the time.
    public static boolean ChanceCheck(int percent) {
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        boolean check = false;
        if (n <= percent) {
            check = true;
        }
        return check;
    }
}
