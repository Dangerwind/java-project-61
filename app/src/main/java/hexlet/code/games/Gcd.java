package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Welcome;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS;

public class Gcd {
    public static void run() {
        String[][] gameData = new String[3][2];
// стандартное приветствие любой игры
        var userName = Welcome.getName();
        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < ROUNDS; i++) {
            int firstNum = new Random().nextInt(100);
            int secondNum = new Random().nextInt(100);
            gameData[i][0] = Integer.toString(firstNum).concat(" ").concat(Integer.toString(secondNum));
            gameData[i][1] = Integer.toString(euclidCalculation(firstNum, secondNum));
        }
        Engine.run(gameData, userName);
    }

    private static int euclidCalculation(int aNumber, int bNumber) {
        int remainder = aNumber % bNumber;
        while (remainder > 0) {
            aNumber = bNumber;
            bNumber = remainder;
            remainder = aNumber % bNumber;
        }
        return bNumber;
    }
}
