
import java.util.*;
public class PriorElements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int count =1;
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max <arr[i]){
                max  = arr[i];

                count++;
            }

        }
        System.out.println(count);
    }
    
}
