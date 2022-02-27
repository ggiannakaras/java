package codility;

// you can also use imports, for example:
import java.util.Arrays;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 2000;
    private final Stack<Integer> stack = new Stack<Integer>();
    private static final Pattern NUMERIC = Pattern.compile("\\d+");

    private static final Map<String, Runnable> OPERATION = new HashMap<String, Runnable>();
    {
        OPERATION.put("POP", this::pop);
        OPERATION.put("DUP", this::duplicate);
        OPERATION.put("+", this::addition);
        OPERATION.put("-", this::subtraction);
    };

    public int solution(String S) {
        // write your code in Java SE 8
        try{

            //Extract each string and perform operation from OPERATION
            Arrays.stream(S.split(" ")).forEach(this::applyOperation);
            return pop();
        } catch(IllegalArgumentException exception){
            /*
             if value is out of range or index is not present
                then we return -1 value
             */
            return -1;
        }
    }


    //IF str marches with NUMERIC pattern then Push value into stack else Perform OPERATION based on str value
    private void applyOperation(String str){
        if(NUMERIC.matcher(str).matches()){
            push(Integer.valueOf(str));
        } else {
            OPERATION.get(str).run();
        }
    }


    //Push value into stack before validating value in withingRange
    private void push(int value){
        withingRange(value);
        stack.push(value);
    }

    //Get last value from stack
    private int pop(){
        return stack.pop();
    }

    //Get last value from stack and push it into Stack again
    private void duplicate(){
        hasElementInStack(1);
        push(stack.peek());
    }

    //Get last two value from stack and push the result of addition of last two value
    private void addition(){
        hasElementInStack(2);
        push(stack.pop()+stack.pop());
    }

    //Get last two value from stack and push the result of subtraction of last two value
    private void subtraction(){
        hasElementInStack(2);
        push(stack.pop()-stack.pop());
    }

    //Check if index is present in Stack or not
    private int hasElementInStack(int indexSize){
        if(stack.size() < indexSize){
            throw new IllegalArgumentException("Index is not present in Stack");
        }
        return indexSize;
    }

    //Check if value is within range or not
    private int withingRange(int value){
        if(value < MIN_VALUE  || value  > MAX_VALUE){
            throw new IllegalArgumentException("Value is out of Range");
        }
        return value;
    }
}
