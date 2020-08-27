package target150.eleven2twenty;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses20 {

    public static void main(String [] args) {
        String str = "()[]";
        ValidParentheses20 obj = new ValidParentheses20();

        System.out.println("Valid Parentheses : "+obj.isValid(str));
        HashMap map = new HashMap();
        map.put("1","1");

    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c :  s.toCharArray()) {
            if(c == '(') {
                stack.push(')');
                continue;
            }
            else if(c =='[') {
                stack.push(']');
                continue;
            }
            else if(c == '{') {
                stack.push('}');
                continue;
            }
            else if(stack.isEmpty() || stack.pop()!=c)
                return false;
        }

        return stack.isEmpty();
    }
}
