package dragoncave;

public class Cave {

    // dragon inhibiting cave
    private Dragon dragon;

    public void setDragon(Dragon dragon) {
        this.dragon = dragon;
    }

    public void displayOutcome() {

        System.out.println(dragon.getOutcome());

    }

}
