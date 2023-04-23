import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Dice dice = new Dice();
        Scanner scanner = new Scanner(System.in);
        System.out.println("roll a dice");
        String userInput = scanner.nextLine();
        System.out.println("Result : " + userInput + " : " + dice.roll(userInput) );
    }

}
