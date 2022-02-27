package codility;

public class Stack {

    private StackNode top;

    public void push(int n) {
        StackNode stackNode = new StackNode();
        stackNode.setValue(n);
        if (top == null) {
            top = stackNode;
        } else {
            stackNode.setNext(top);
            top = stackNode;
        }
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("The stack is empty");
        } else {
            StackNode currentTop = this.top;
            int topValue = currentTop.getValue();
            this.top = currentTop.getNext();
            currentTop.setNext(null);
            currentTop = null;
            return topValue;
        }
    }
}