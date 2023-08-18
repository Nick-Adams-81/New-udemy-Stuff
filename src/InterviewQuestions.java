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

    // balanced parentheses using stack
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

    // sorting a stack of integers
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> sorted = new Stack<>();
        while(!stack.isEmpty()) {
            int temp = stack.pop();
            while(!sorted.isEmpty() && sorted.peek() > temp) {
                stack.push(sorted.pop());
            }
            sorted.push(temp);
        }
        while(!sorted.isEmpty()) {
            stack.push(sorted.pop());
        }
    }



    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(7);
        myStack.push(3);
        myStack.push(34);
        myStack.push(9);
        myStack.push(1);
        System.out.println("Unsorted: " + myStack);
        sortStack(myStack);
        System.out.println("Sorted: " + myStack);
        System.out.println(reverseString("hello world"));
        System.out.println(validParentheses("[]()}"));
    }
}
