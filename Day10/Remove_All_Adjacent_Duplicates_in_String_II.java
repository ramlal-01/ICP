import java.util.Stack;

public class Removeduplicate1209 {
    class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Character> charStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (!charStack.isEmpty() && charStack.peek() == ch) {
                countStack.push(countStack.pop() + 1);
            } 
            else {
                charStack.push(ch);
                countStack.push(1);
            }
            if (countStack.peek() == k) {
                charStack.pop();
                countStack.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!charStack.isEmpty()) {
            char ch = charStack.pop();
            int count = countStack.pop();
            for (int i = 0; i < count; i++) {
                sb.append(ch);
            }
        }

        return sb.reverse().toString();
    }
}

}