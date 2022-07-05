package dragoncave;

public class Dragon {

    private String outcome;

    public Dragon(boolean evil) {

        if(evil){
            outcome = "You approach the cave...\nIt is dark and gloomy...\nA large Dragon jumps out in front of you! He opens his jaws and...\nGobbles you down in one bite!";
        } else {
            outcome = "You approach the cave...\nAs you go further it gets warm and bright...\nNearing the end a large dragon appears...\nThey welcome you in and share their tresure with you!";
        }

    }

    public String getOutcome() {
        return outcome;
    }

}
