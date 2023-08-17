import java.util.Stack;

public class InterviewQuestions {

    // stack in reversed string
    public static String reverseString(String str) {
        var stack = new Stack<Character>();
        String reversed = "";
        for(char c : str.toCharArray()) {
            stack.push(c);
        }
        while(!stack.isEmpty()) {
            reversed += stack.pop();
        }
        return reversed;
    }

    // bal;anced parentheses
    public static boolean validParentheses(String str) {
        if(str.length() % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(c == '[' || c == '{' || c == '(') stack.push(c);
            else if(c == ']' && stack.peek() == '[') stack.pop();
            else if(c == '}' && stack.peek() == '{') stack.pop();
            else if(c == ')' && stack.peek() == '(') stack.pop();
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(reverseString("hello world"));
        System.out.println(validParentheses("[]()}"));
    }
}
