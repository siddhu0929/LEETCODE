import java.util.Scanner;
public class DifferenceBetweenFirstAndLast {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read size of array
        int N = sc.nextInt();

        // Create array
        int[] arr = new int[N];

        // Read elements
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate difference (first - last)
        int result = arr[0] - arr[N - 1];

        // Output
        System.out.println(result);

        sc.close();
    }
}
