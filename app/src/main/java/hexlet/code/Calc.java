package hexlet.code;

import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Calc {
    public static void run() {
        String[][] gameData = new String[3][2];
// стандартное приветствие любой игры
        var userName = Welcome.getName();
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < ROUNDS; i++) {
            var firstNum = new Random().nextInt(0, 100);
            var secondNum = new Random().nextInt(0, 100);
            var sign = new Random().nextInt(3);

            switch (sign) {
                case 0 :
                    gameData[i][0] = Integer.toString(firstNum).concat(" + ").concat(Integer.toString(secondNum));
                    gameData[i][1] = Integer.toString(firstNum + secondNum);
                    break;
                case 1 :
                    gameData[i][0] = Integer.toString(firstNum).concat(" - ").concat(Integer.toString(secondNum));
                    gameData[i][1] = Integer.toString(firstNum - secondNum);
                    break;
                case 2 :
                    gameData[i][0] = Integer.toString(firstNum).concat(" * ").concat(Integer.toString(secondNum));
                    gameData[i][1] = Integer.toString(firstNum * secondNum);
                    break;
                default: break;
            }
        }
        if (Engine.run(gameData)) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
