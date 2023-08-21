import java.util.*;

public class InterviewQuestions {


    // ----- STACKS ----- //
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


    // ----- MAPS ----- //
    // find duplicates and return them
    public static List<Integer> findDuplicates(int[] arr) {
        Map<Integer, Integer> numCounts = new HashMap<>();
        for(int num: arr) {
            numCounts.put(num, numCounts.getOrDefault(num, 0) + 1);
        }
        List<Integer> duplicates = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : numCounts.entrySet()) {
            if(entry.getValue() > 1) {
                duplicates.add(entry.getKey());
            }
        }
        return duplicates;
    }

    // finding first non repeating character using a map
    public static Character firstNonRepeatingChar(String str) {
        Map<Character, Integer> charCounts = new HashMap<>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(charCounts.get(c) == 1) return c;
        }
        return null;
    }

    // find anagrams using hash maps
    public static List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> anagramGroups = new HashMap<>();
        for(String string : strings) {
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String canonical = new String(chars);
            if(anagramGroups.containsKey(canonical)) {
                anagramGroups.get(canonical).add(string);
            } else {
                List<String> group = new ArrayList<>();
                group.add(string);
                anagramGroups.put(canonical, group);
            }
        }
        return new ArrayList<>(anagramGroups.values());
    }

    // two sum using map to store values
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int comp = target - num;
            if(numMap.containsKey(comp)) {
                return new int[]{numMap.get(comp), i};
            }
            numMap.put(num, i);
        }
        return new int[]{};
    }

    // sub array sum using hash table
    public static int[] subarraySum(int[] nums, int target) {
        Map<Integer, Integer> sumIndex = new HashMap<>();
        sumIndex.put(0, -1);
        int currentSum = 0;
        for(int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if(sumIndex.containsKey(currentSum - target)) {
                return new int[]{sumIndex.get(currentSum - target) + 1, i};
            }
            sumIndex.put(currentSum, i);
        }
        return new int[] {};
    }

    // ----- SETS ----- //

    // remove duplicates
    public static List<Integer> removeDupes(List<Integer> myList) {
        Set<Integer> uniqueSet = new HashSet<>(myList);
        return new ArrayList<>(uniqueSet);
    }

    // finding if a string has all unique characters
    public static boolean hasUniqueChars(String str) {
        Set<Character> set = new HashSet<>();
        for(char c : str.toCharArray()) {
            if(set.contains(c)) return false;
            set.add(c);
        }
        return true;
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

        int[] arr1 = {1, 2, 3, 8, 9, 10, 2, 3, 9};
        int[] arr2 = {3, 4, 5, 6, 7, 8};

        System.out.println(itemInCommon(arr1, arr2));
        System.out.println(itemInCommon2(arr1, arr2));
        System.out.println(findDuplicates(arr1));
        System.out.println(firstNonRepeatingChar("lleetcode"));

        String[] myStrings = { "eat", "tea", "tan", "ate", "nat", "bat", "tab" };
        System.out.println(groupAnagrams(myStrings));

        int[] arr3 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr3, 9)));

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(6);
        nums.add(6);
        nums.add(7);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        System.out.println("Full list: " + nums);
        System.out.println(Arrays.toString(subarraySum(arr1, 19)));
        System.out.println("Duplicates removed: " + removeDupes(nums));

        System.out.println(hasUniqueChars("helo"));


    }
}
