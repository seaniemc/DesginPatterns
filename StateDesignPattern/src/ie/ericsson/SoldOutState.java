package ie.ericsson;

/**
 * Created by smcgrath on 28/09/2017.
 */
public class SoldOutState implements State {
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine newGumballMachine) {
        this.gumballMachine = newGumballMachine;
    }

    @Override
    public void insertQuartar() {
        System.out.println("You cant insert a coin, Sorry machine is sold out");
    }

    @Override
    public void ejectQuatar() {
        System.out.println("Sorry machine is sold out");
    }

    @Override
    public void turnCrank() {
        System.out.println("You cant turn the crank, Sorry machine is sold out");
    }

    @Override
    public void dispense() {
        System.out.println("nothing to dispense");
    }
}
