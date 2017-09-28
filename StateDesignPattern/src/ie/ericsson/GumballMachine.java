package ie.ericsson;

/**
 * Created by smcgrath on 28/09/2017.
 */
public class GumballMachine {
    State soldState;
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State winnerState;

    State state;

    public int getCount() {
        return count;
    }

    int count;

    public GumballMachine(int numberGumballs){
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        noQuarterState = new NoQuartarState(this);
        hasQuarterState = new HasQuarterState(this);

        this.count = numberGumballs;
        if(numberGumballs >0 ){
            state = noQuarterState;
        }else {
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuartar();
    }

    public void ejectQuarter(){
        state.ejectQuatar();
    }

    public void turnChrank(){
        state.turnCrank();
        state.dispense();
    }

    public void releaseBall(){
        System.out.println("A gumball comes rolling out of the slot..");
        if(count != 0){
            count = count -1;
        }
    }
    //===========getters and setters=================//
    public State getSoldState() {
        return soldState;
    }

    public void setSoldState(State soldState) {
        this.soldState = soldState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(State soldOutState) {
        this.soldOutState = soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(State noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(State hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(State winnerState) {
        this.winnerState = winnerState;
    }

    public void setState(State state) {
        this.state = state;
    }

}
