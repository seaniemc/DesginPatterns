package ie.ericsson.states;

import ie.ericsson.GumballMachine;

/**
 * Created by smcgrath on 28/09/2017.
 */
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine newGumBallMachine){
        this.gumballMachine = newGumBallMachine;
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

    }
}
