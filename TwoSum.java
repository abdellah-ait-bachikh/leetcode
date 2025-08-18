import java.util.Arrays;

class TowSum {

     public int[] twoSum(int[] nums, int target) {
         for (int i = 0, j = i + 1; j < nums.length ; i++) {
            if (nums[i] + nums[j] == target) {
                return new int[] { i, j };
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int[] result = twoSum(numbers, 9);
        System.out.print(result);
    }
}