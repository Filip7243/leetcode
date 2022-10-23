public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(111));
    }

    private static boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        String number = String.valueOf(x);

        return reverse(number).equals(number);
    }

    private static String reverse(String s) {
        StringBuilder result = new StringBuilder();

        for(int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
