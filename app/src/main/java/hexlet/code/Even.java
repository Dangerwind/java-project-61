package hexlet.code;

// import java.util.Scanner;
import java.util.Random;
import static hexlet.code.Engine.ROUNDS;

public class Even {
    public static void run() {
        String[][] gameData = new String[3][2];
// стандартное приветствие любой игры
        var userName = Welcome.getName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < ROUNDS; i++) {
            var randomNum = new Random().nextInt(0, 100);
            gameData[i][0] = Integer.toString(randomNum);
            gameData[i][1] = randomNum % 2 == 0 ? "yes" : "no";
        }
        if (Engine.run(gameData)) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("Let's try again, " + userName + "!");
        }
    }
}
