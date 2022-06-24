package dragoncave;

import java.util.Scanner;

public class InputControl {

    static Scanner input = new Scanner(System.in);

    public String getInput(boolean inPlayAgain) {

        try {

            String answer = input.next();

            //if asking for left or right
            if (!inPlayAgain) {
                //if user input correct answers
                if (answer.equals("l") || answer.equals("r")) {
                    return answer;
                }

                //otherwise ask again
                System.out.println("Wrong Input Try Again. l / r?");
                return getInput(inPlayAgain);

            }

            //when asking for yes or no
            if (answer.equals("y") || answer.equals("n")) {
                return answer;
            }

            System.out.println("Wrong Input Try Again. y / n?");
            return getInput(inPlayAgain);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //if anyting goes abismally wrong try again
        return getInput(inPlayAgain);

    }

}
