import java.util.Stack;

public class StringBuilder345 {

class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // handles multi-digit numbers like "12[a]"
            } 
            else if (ch == '[') {
                // push current number and string to stacks
                countStack.push(num);
                strStack.push(curr);
                num = 0;//for next numbers inside brackets.
                curr = new StringBuilder(); // start new substring inside the brackets.
            } 
            else if (ch == ']') {
                // pop and build the decoded string
                int repeat = countStack.pop();
                StringBuilder temp = curr;
                curr = strStack.pop();
                while (repeat-- > 0) {
                    curr.append(temp);
                }
            } 
            else {
                curr.append(ch);
            }
        }

        return curr.toString();
    }
}

}