package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Welcome;

import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Even {
    public static void run() {
        String[][] gameData = new String[3][2];
// стандартное приветствие любой игры
        var userName = Welcome.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < ROUNDS; i++) {
            var randomNum = new Random().nextInt(100);
            gameData[i][0] = Integer.toString(randomNum);
            gameData[i][1] = randomNum % 2 == 0 ? "yes" : "no";
        }
        Engine.run(gameData, userName);
    }
}
