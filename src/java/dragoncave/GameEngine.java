package dragoncave;

import java.util.Random;
import java.util.Scanner;

public class GameEngine {

    static Scanner input = new Scanner(System.in);
    static InputControl inputControl = new InputControl();

    // private final InputControl input = new InputControl();
    private final Cave leftCave = new Cave();
    private final Cave rightCave = new Cave();
    private Random rand = new Random();

    public void play() {

        // check for player replay input
        boolean restart = false;

        do {

            // creates flag to determine which cave has evil dragon
            int rng = rand.nextInt(2);

            // if 0 left cave has evil dragon
            // Otherwise rigt cave has evil drgaon
            if (rng == 0) {
                leftCave.setDragon(new Dragon(true));
                rightCave.setDragon(new Dragon(false));
            } else {
                leftCave.setDragon(new Dragon(false));
                rightCave.setDragon(new Dragon(true));
            }

            // Displays game introduction
            gameIntroduction();

            // gets player direction choice
            String direction = inputControl.getLR(input.next());

            // Checks which cave players wishes to go and displays its outcome
            if (direction.equals("l")) {
                leftCave.displayOutcome();
            } else {
                rightCave.displayOutcome();
            }

            // aks player if they wish to keep playing
            restart = playAgain(inputControl.getYN(input.next()));

        } while (restart);

    }

    private void gameIntroduction() {

        System.out.println(
                "\nYou find yourself in a most curious situation \n" +
                        "A land full of dragons. They seem to be everywhere no matter where you go. \n" +
                        "You walk and walk and find yourself standing in front of a Cave.  \n" +
                        "You enter and are given a choice left or right.\n" +
                        "What will be your choice? l / r");

    }

    private boolean playAgain(String input) {

        System.out.println("Would you like to play again? y / n");

        return input.equals("y");
    }

}
