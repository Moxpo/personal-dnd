import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NewCharacter {

    public static void createCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets create a character");
        System.out.println("What is your name?:");
        String userName = scanner.nextLine();
        System.out.println("What is your level? (1 if beginning)");
        int userLevel = scanner.nextInt();
        System.out.println("Welcome " + userName + " Let me generate your stats:");

        ArrayList<Integer> startingStats = new ArrayList<>();
        Dice dice = new Dice();
        for (int i = 0; i < 6; i++){
            int startRoll = dice.rollAndKeepHighest("4d6", 3);
            startingStats.add(startRoll);
        }

        Character player = new Character(userName, userLevel, startingStats.get(0), startingStats.get(1),
                startingStats.get(2), startingStats.get(3), startingStats.get(4), startingStats.get(5));
        System.out.println("Your character: " + player);

        Modifier modifier = new Modifier();
        System.out.println("Your Strength mod is : " + modifier.calculate(player.getStrength()));
        System.out.println("Your Dexterity mod is : " + modifier.calculate(player.getDexterity()));
        System.out.println("Your Constitution mod is : " + modifier.calculate(player.getConstitution()));
        System.out.println("Your Intelligence mod is : " + modifier.calculate(player.getIntelligence()));
        System.out.println("Your Wisdom mod is : " + modifier.calculate(player.getWisdom()));
        System.out.println("Your Charisma mod is : " + modifier.calculate(player.getWisdom()));


        int playerAC = player.calculateAC(modifier);
        System.out.println("Your character's Armor Class: " + playerAC);


    }
}