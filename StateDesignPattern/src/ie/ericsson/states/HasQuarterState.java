package ie.ericsson.states;

import ie.ericsson.GumballMachine;

import java.util.Random;

/**
 * Created by smcgrath on 28/09/2017.
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());
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
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)){
            gumballMachine.setState(gumballMachine.getWinnerState());
        }else{
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("No gumball released");
    }
}
