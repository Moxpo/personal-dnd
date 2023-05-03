import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NewCharacter {

    public static void createCharacter(String userName, String csvPath) {

        if (csvPath == null || csvPath.isEmpty()) {
            System.out.println("Welcome " + userName + " Let me generate your stats:");

            ArrayList<Integer> startingStats = new ArrayList<>();
            Dice dice = new Dice();
            for (int i = 0; i < 6; i++) {
                int startRoll = dice.rollAndKeepHighest("4d6", 3);
                startingStats.add(startRoll);
            }

            Character player = new Character(userName, startingStats.get(0), startingStats.get(1),
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

            player.saveCharacter();

        } else {
            boolean userNotFound = false;
            try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");
                    if (values[0].equals(userName)) {
                        int strength = Integer.parseInt(values[1]);
                        int dexterity = Integer.parseInt(values[2]);
                        int constitution = Integer.parseInt(values[3]);
                        int intelligence = Integer.parseInt(values[4]);
                        int wisdom = Integer.parseInt(values[5]);
                        int charisma = Integer.parseInt(values[6]);

                        Character player = new Character(userName, strength, dexterity, constitution, intelligence, wisdom, charisma);
                        System.out.println("Your character: " + player);

                        Modifier modifier = new Modifier();
                        System.out.println("Your Strength mod is : " + modifier.calculate(player.getStrength()));
                        System.out.println("Your Dexterity mod is : " + modifier.calculate(player.getDexterity()));
                        System.out.println("Your Constitution mod is : " + modifier.calculate(player.getConstitution()));
                        System.out.println("Your Intelligence mod is : " + modifier.calculate(player.getIntelligence()));
                        System.out.println("Your Wisdom mod is : " + modifier.calculate(player.getWisdom()));
                        System.out.println("Your Charisma mod is : " + modifier.calculate(player.getCharisma()));

                        int playerAC = player.calculateAC(modifier);
                        System.out.println("Your character's Armor Class: " + playerAC);
                        return;

                    }

                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (userNotFound = true){
                System.out.println("Character not found in saved files");

            }
        }
    }
}