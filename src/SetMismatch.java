public class SetMismatch {
    private static int[] n = new int[2];

    public static void main(String[] args) {
        int[] errorNumbers = findErrorNums(new int[]{3, 2, 2});
        for (int i : errorNumbers) {
            System.out.println(i);
        }
    }

    public static int[] findErrorNums(int[] nums) {
        int dup = 0;
        int missing = 0;
        for (int i = 1; i < nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num == i) {
                    count++;
                }
            }
            if(count == 2){
                dup = i;
            } else if (count == 0) {
                missing = i;
            }
        }

        return new int[]{dup, missing};
    }

}