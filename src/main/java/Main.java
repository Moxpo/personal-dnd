import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Dice dice = new Dice();
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("roll a dice");
        String userInput = scanner.nextLine();
        System.out.println("Result : " + userInput + " : " + dice.roll(userInput) );
        */

        System.out.println("Welcome to the Dungeon!");
        System.out.println("Lets create a character");
        System.out.println("What is your name?:");
        String userName = scanner.nextLine();
        System.out.println("What is your level? (1 if beginning)");
        int userLevel = scanner.nextInt();
        System.out.println("Welcome " + userName + " Let me generate your stats:");
        ArrayList<Integer> startingStats = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            int startRoll = dice.rollAndKeepHighest("4d6", 3);
            startingStats.add(startRoll);
        }
        Character player = new Character(userName, userLevel, startingStats.get(0), startingStats.get(1), startingStats.get(2), startingStats.get(3),
                startingStats.get(4), startingStats.get(5));
        System.out.println("Your character: " + player);




        }


    }


