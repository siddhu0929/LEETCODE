import java.util.*;
public class Chocolate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();

        }
        int zeros =0;
        int ones =0;
        int twos=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==0){
                zeros++;

            }else{
                if(arr[i]==1){
                    ones++;
                }else{
                    twos++;
                }
            }
        }
      int j =0;
      while(zeros>0){
        arr[j] = 0;
        j++;
        zeros--;
      }
      while(ones>0){
        arr[j] = 1;
        j++;
        ones--;
      }
      while(twos>0){
        arr[j] = 2;
        j++;
        twos--;
      }
      for(int i=0;i<n;i++){
        System.out.println(arr[i]+" ");
      }

    }
    
}
