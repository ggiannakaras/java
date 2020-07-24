package coursera.pattern.state;

public class HasOneDollarState implements State {

    @Override
    public void insertDollar( VendingMachine vendingMachine ) {
        System.out.println( "already have one dollar" );
    }

    @Override
    public void ejectMoney( VendingMachine vendingMachine ) {
        System.out.println( "returning money" );
        vendingMachine.ejectMoney();
        vendingMachine.setState(
                vendingMachine.getIdleState()
        );
    }

    @Override
    public void dispense( VendingMachine vendingMachine ) {
        System.out.println( "releasing product" );
        if (vendingMachine.getCount() > 1) {
            vendingMachine.dispense();
            vendingMachine.setState(
                    vendingMachine.getIdleState()
            );
        } else {
            vendingMachine.dispense();
            vendingMachine.setState(
                    vendingMachine.getOutOfStockState() );
        }
    }
}
