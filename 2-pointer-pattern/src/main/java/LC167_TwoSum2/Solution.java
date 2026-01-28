package LC167_TwoSum2;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;

        while(i<j) {
            if(numbers[i] + numbers[j] == target) {
                return new int[]{i+1, j+1};
            }

            if(numbers[i] + numbers[j] < target) {
                i++;
            }
            else {
                j--;
            }
        }

        return new int[]{};
    }
}
