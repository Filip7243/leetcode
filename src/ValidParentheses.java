import java.util.*;

public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("())"));
    }

    public static boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{':
                    stack.push('{');
                    break;
                case '}':
                    if (!stack.isEmpty()) {
                        if (stack.peek().equals('{')) {
                            stack.remove(stack.peek());
                        } else {
                            return false;
                        }

                    } else {
                        return false;
                    }
                    break;
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if (!stack.isEmpty()) {
                        if (stack.peek().equals('(')) {
                            stack.remove(stack.peek());
                        } else {
                            return false;
                        }

                    } else {
                        return false;
                    }
                    break;
                case '[':
                    stack.push('[');
                    break;
                case ']':
                    if (!stack.isEmpty()) {
                        if (stack.peek().equals('[')) {
                            stack.remove(stack.peek());
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return stack.peek() == null;
    }
}
