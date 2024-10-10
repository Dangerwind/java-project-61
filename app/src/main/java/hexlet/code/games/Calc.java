package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Welcome;

import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Calc {
    public static void run() {
        String[] signConferter = {" + ", " - ", " * "};
        String[][] gameData = new String[3][2];
// стандартное приветствие любой игры
        var userName = Welcome.getName();
        System.out.println("What is the result of the expression?");


        for (int i = 0; i < ROUNDS; i++) {
            var firstNum = new Random().nextInt(0, 100);
            var secondNum = new Random().nextInt(0, 100);
            var sign = new Random().nextInt(3);
            int resultAnswer = 0;
            gameData[i][0] = Integer.toString(firstNum).concat(signConferter[sign]).concat(Integer.toString(secondNum));

            switch (sign) {
                case 0 :
                    resultAnswer = firstNum + secondNum;
                    break;
                case 1 :
                    resultAnswer = firstNum - secondNum;
                    break;
                case 2 :
                    resultAnswer = firstNum * secondNum;
                    break;
                default: break;
            }
            gameData[i][1] = Integer.toString(resultAnswer);
        }

        Engine.run(gameData, userName);
    }
}
