package dragoncave;

public class InputControl {

    public String getLR(String answer) {
        try {
            if (answer.equals("l") || answer.equals("r")) {
                return answer;
            }

            throw new WrongInputException("Not l or r");

        } catch (WrongInputException e) {
            System.out.println("Wrong Input Try Again. l / r?");
            return getLR(answer);
        }
    }

    public String getYN(String answer) {
        try {

            if (answer.equals("y") || answer.equals("n")) {
                return answer;
            }

            throw new WrongInputException("Not y or n");

        } catch (Exception e) {
            System.out.println("Wrong Input Try Again. y / n?");
            return getYN(answer);
        }
    }
}
