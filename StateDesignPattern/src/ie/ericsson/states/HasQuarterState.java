package ie.ericsson.states;

import ie.ericsson.GumballMachine;

/**
 * Created by smcgrath on 28/09/2017.
 */
public class HasQuarterState implements State {
    GumballMachine gumballMachine;
    public HasQuarterState(GumballMachine newGumballMachine) {
        this.gumballMachine = newGumballMachine;
    }

    @Override
    public void insertQuartar() {
        System.out.println("you can't insert another quarter");
    }

    @Override
    public void ejectQuatar() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned the cr...");
        gumballMachine.setState(gumballMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball released");
    }
}
