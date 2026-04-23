import java.util.Scanner;

public class DifferenceInElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        
        int[] arr = new int[N];

        
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int result = arr[0] - arr[N - 1];
        System.out.println(result);

        sc.close();
    
}
}
