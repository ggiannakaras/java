package coursera.pattern.state;

 interface State {
     void insertDollar( VendingMachine vendingMachine );
     void ejectMoney( VendingMachine vendingMachine );
     void dispense( VendingMachine vendingMachine );
}