import java.util.*;

class Solution {

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

public class SqauresOfSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        
        System.out.println("Enter elements (can be negative also): ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int[] result = sol.sortedSquares(nums);

        
        System.out.println("Sorted squares array:");
        for (int num : result) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}