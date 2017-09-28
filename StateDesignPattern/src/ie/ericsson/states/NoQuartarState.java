package ie.ericsson.states;

import ie.ericsson.GumballMachine;

/**
 * Created by smcgrath on 28/09/2017.
 */
public class NoQuartarState implements State {
    GumballMachine gumballMachine;
    public NoQuartarState(GumballMachine newMachine){
        this.gumballMachine = newMachine;
    }
    @Override
    public void insertQuartar() {
        System.out.println("You entered a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuatar() {
        System.out.println("You havent entered a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there is no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You must pay first");
    }
}
