package codility;
import java.util.*;

class Solution {
    public int solution(String S) {
        Stack<String> stk = new Stack<String>();
        String[] operations = S.split(" ");

        for( int i=0; i< operations.length; i++){
            if(operations[i]  == "DUP")
            {stk.push(operations[i-1]);
            }else if (operations[i].equals("+"))
            { int aright = Integer.parseInt(operations[i-1]);
                int aleft = Integer.parseInt(operations[i+1]);
                stk.push(String.valueOf(aright+aleft));

            }
            else if (operations[i].equals("-"))
            { int aright = Integer.parseInt(operations[i-1]);
                int aleft = Integer.parseInt(operations[i+1]);
                stk.push(String.valueOf(aleft - aright));

            }
            else stk.push(String.valueOf(operations[i]));

        }
        if(stk.empty())
            return -1;
        else try {
            return Integer.parseInt(stk.peek());
        } catch (NumberFormatException nfe) {
            return -1;
        }


        // int positionPos;
        // int positionNeg;
        // int posDUP;
        // positionPos = stk.search("+");
        // positionNeg = stk.search("-");
        // posDUP = stk.search("DUP");
        // if(posDUP != -1)
        // { return -100;
        // }
        // return 0;

    }
}