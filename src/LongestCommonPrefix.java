public class LongestCommonPrefix {

    public static void main(String[] args) {

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int k = 0;

        for (int i = 0; i < strs.length;) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[i].charAt(k) == strs[j].charAt(k)) {
                    result.append(strs[i].charAt(k));
                }
            }
            break;
        }

        return result.toString();
    }
}
