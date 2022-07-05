package dragoncave;

public class InputControl {

    public String getLR(String answer) {
        try {
            if (answer.equals("l") || answer.equals("r")) {
                return answer;
            }

            throw new WrongInputException("Not l or r");

        } catch (WrongInputException e) {
            boolean wrong = true;

            do {

                System.out.println("Wrong Input Try Again. l / r?");

                answer = GameEngine.getInput().next();

                if (answer.equals("l") || answer.equals("r")) {
                    wrong = false;
                }

            } while (wrong);

            return answer;
        }
    }

    public String getYN(String answer) {
        try {

            if (answer.equals("y") || answer.equals("n")) {
                return answer;
            }

            throw new WrongInputException("Not y or n");

        } catch (WrongInputException e) {

            boolean wrong = true;

            do {

                System.out.println("Wrong Input Try Again. y / n?");

                answer = GameEngine.getInput().next();

                if (answer.equals("y") || answer.equals("n")) {
                    wrong = false;
                }

            } while (wrong);

            return answer;

        }
    }
}
