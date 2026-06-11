
import java.util.*;


class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // If opening bracket → push
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } 
            // If closing bracket
            else {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}

// Main class
public class ValidParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string of brackets: ");
        String s = sc.nextLine();

        Solution sol = new Solution();
        boolean result = sol.isValid(s);

        // Output
        if (result== true) {
            System.out.println("Valid Parentheses ");
        } else {
            System.out.println("Invalid Parentheses ");
        }

        sc.close();
    }
}