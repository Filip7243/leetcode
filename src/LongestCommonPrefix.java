public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"abc", "abd", "abe"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {
            return "";
        }

        String s = strs[0];
        for(int i = 1; i < strs.length; i++) {
            String word = strs[i];
            while (word.indexOf(s) != 0) {
                s = s.substring(0, s.length() - 1);
                if(s.isEmpty()) {
                    return "";
                }
            }
        }

        return s;
    }
}
