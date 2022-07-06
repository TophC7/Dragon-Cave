package dragoncave;

public class InputControl {

    /**
     * Makes sure answer is l or r promting for input again when its not
     * 
     * @param answer - answer from player
     * @return l or r
     */
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

    /**
     * Makes sure answer is y or n promting for input again when its not
     * 
     * @param answer - answer from player
     * @return y or n
     */
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
