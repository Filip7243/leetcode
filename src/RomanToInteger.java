import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private static final Map<String, Integer> romanIntegers = new HashMap<>();


    public static void main(String[] args) {
        int result = romanToInt("MCMXCIV");
        System.out.println(result);
    }

    public static int romanToInt(String s) {
        romanIntegers.put("I", 1);
        romanIntegers.put("V", 5);
        romanIntegers.put("X", 10);
        romanIntegers.put("L", 50);
        romanIntegers.put("C", 100);
        romanIntegers.put("D", 500);
        romanIntegers.put("M", 1000);

        int sum = 0;
        int length = s.length();
        int lastIndex = s.length() - 2;

        if(length > 1) {
            for (int i = 0; i < s.length() - 1; i++) {
                String romanNumber = String.valueOf(s.charAt(i));
                String nextRomanNumber = String.valueOf(s.charAt(i + 1));

                int number = romanIntegers.get(romanNumber);
                int nextNumber = romanIntegers.get(nextRomanNumber);

                if (number < nextNumber) {
                    sum += nextNumber - number;
                    i++;
                    sum = getSum(s, sum, lastIndex, i);
                } else {
                    sum = getSum(s, sum, lastIndex, i);
                    sum += number;
                }
            }
        } else {
            sum += romanIntegers.get(s);
        }

        return sum;
    }

    private static int getSum(String s, int sum, int lastIndex, int i) {
        if(i == lastIndex) {
            String lastRoman = String.valueOf(s.charAt(i + 1));
            sum += romanIntegers.get(lastRoman);
        }
        return sum;
    }
}
