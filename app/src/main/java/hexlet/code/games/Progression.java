package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Welcome;

import java.util.Random;

import static hexlet.code.Engine.ROUNDS;

public class Progression {
    public static void run() {
        String[][] gameData = new String[3][2];
// стандартное приветствие любой игры
        var userName = Welcome.getName();
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < ROUNDS; i++) {
            int modNum = new Random().nextInt(1, 10);
            int startNum = new Random().nextInt(50);
            int lengthNum = new Random().nextInt(5, 11);
            int missingNum = new Random().nextInt(lengthNum);
            gameData[i][0] = "";

            for (int j = 0; j < lengthNum; j++) {
                if (missingNum == j) {
                    gameData[i][0] = gameData[i][0].concat(" ..");
                    gameData[i][1] = Integer.toString(startNum);
                } else {
                    gameData[i][0] = gameData[i][0].concat(" ").concat(Integer.toString(startNum));
                }
                startNum = startNum + modNum;
            }
        }
        Engine.run(gameData, userName);
    }
}
