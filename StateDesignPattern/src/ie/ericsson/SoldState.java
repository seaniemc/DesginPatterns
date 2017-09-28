package ie.ericsson;

/**
 * Created by smcgrath on 28/09/2017.
 */
public class SoldState implements State {
    GumballMachine gumballMachine;

    public SoldState(GumballMachine newGumballMachine) {
        this.gumballMachine = newGumballMachine;
    }

    @Override
    public void insertQuartar() {
        System.out.println("Please we have just given a gumball");
    }

    @Override
    public void ejectQuatar() {
        System.out.println("Sorry yoiu hsve already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turnoing tw3ice wouldnt get another one");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        }else{
            System.out.println("Out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
