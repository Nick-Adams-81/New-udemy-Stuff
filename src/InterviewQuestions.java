import java.util.HashMap;
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

    // seeing if arrays have a same value O(n2)
    public static boolean itemInCommon(int[] arr1, int[] arr2) {
        for(int i : arr1) {
            for(int j : arr2) {
                if(i == j) return true;
            }
        }
        return false;
    }

    // arrays having item in common O(n)
    public static boolean itemInCommon2(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> myHash = new HashMap<>();
        for(int i : arr1) {
            myHash.put(i, true);
        }
        for(int j : arr2) {
            if(myHash.get(j) != null) return true;
        }
        return false;
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

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 4, 5};

        System.out.println(itemInCommon(arr1, arr2));
        System.out.println(itemInCommon2(arr1, arr2));
    }
}
