import java.util.*;

public class LongestSubarrayDivisibleByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        // Important: remainder 0 at index -1
        map.put(0, -1);

        for(int i = 0; i < n; i++) {
            prefixSum += arr[i];

            int rem = prefixSum % k;

            // handle negative remainder
            if(rem < 0) {
                rem += k;
            }

            if(map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            } else {
                map.put(rem, i);
            }
        }

        System.out.println(maxLen);
    }
}