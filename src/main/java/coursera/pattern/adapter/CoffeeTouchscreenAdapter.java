package coursera.pattern.adapter;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
    private OldCoffeeMachine oldCoffeeMachine;

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMachine.selectB();
    }

    public void setOldCoffeeMachine(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }
}
