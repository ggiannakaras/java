package coursera.pattern.state;

public class OutOfStockState implements State {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("Out of stock");
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("returning money");
        vendingMachine.ejectMoney();
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("Out of stock cannot dispense");
    }
}
