package ie.ericsson;

/**
 * Created by smcgrath on 28/09/2017.
 */
public class GumBallMachineTestRunner {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(8);

        System.out.println(gumballMachine.getCount());

        gumballMachine.insertQuarter();
        gumballMachine.turnChrank();

        System.out.println(gumballMachine.getCount());

        gumballMachine.insertQuarter();
        gumballMachine.turnChrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnChrank();

        System.out.println(gumballMachine.getCount());

    }
}
