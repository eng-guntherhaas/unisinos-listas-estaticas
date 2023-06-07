import java.util.Stack;

public class Etapa3 {
    public boolean checkBrackets(Stack<Character> s1) {
        Stack<Character> s2 = new Stack<Character>();
        int count = 0;
        while (!s1.isEmpty()) {
            char c = s1.pop();
            if (c == '(') {
                count++;
                s2.push(c);
            } else if (c == ')') {
                count--;
                s2.push(c);
            } else {
                s2.push(c);
            }
        }
        if (count != 0) {
            return false;
        }
        int openCount = 0;
        while (!s2.isEmpty()) {
            char c = s2.pop();
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                if (openCount == 0) {
                    return false;
                }
                openCount--;
            }
        }
        return true;
    }

}
