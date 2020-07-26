package coursera.pattern.state;

public class VendingMachine {

    private State idleState;
    private State hasOneDollarState;
    private State outOfStockState;
    private State currentState;
    private int count;

    public VendingMachine( int count ) {
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
        outOfStockState = new OutOfStockState();
        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
            currentState = outOfStockState;
            this.count = 0;
        }
    }

    public void setState(State state) {
        currentState = state;
    }

    public void insertDollar() {
        currentState.insertDollar( this );
    }

    public void ejectMoney() {
        currentState.ejectMoney( this );
    }

    public void dispense() {
        currentState.dispense( this );
    }

    public State getHasOneDollarState() {
        return hasOneDollarState;
    }

    public int getCount() {
        return count;
    }

    public State getIdleState() {
        return idleState;
    }

    public State getOutOfStockState() {
        return outOfStockState;
    }
}
