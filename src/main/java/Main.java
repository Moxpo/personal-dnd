import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        System.out.println("Welcome to the Dungeon");


        do {
            System.out.println("Please make a selection");
            System.out.println("1. Create new character");
            System.out.println("2. Load existing character");
            int userChoice = scanner.nextInt();

            switch(userChoice) {
                case 1:
                    validInput = true;
                    NewCharacter.createCharacter();
                    break;
                case 2:
                    validInput = true;
                    System.out.println("two");
                    break;
                default:
                    System.out.println("Invalid input, please select 1 or 2");
            }
        }
        while (!validInput);

    }
}