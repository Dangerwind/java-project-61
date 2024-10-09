package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");

        Scanner sc = new Scanner(System.in);
        int gameNumber = sc.nextInt();
        System.out.println(" ");

        switch (gameNumber) {
            case 1 : Cli.greet();
                break;
            case 2 : Even.run();
               break;
            case 3 : Calc.run();
                break;
            default: break;
        }

    }
}
