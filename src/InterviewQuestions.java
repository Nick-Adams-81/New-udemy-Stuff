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
    public static void main(String[] args) {
        System.out.println(reverseString("hello world"));
    }
}
