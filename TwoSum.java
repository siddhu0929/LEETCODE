import java.util.Scanner;
public class TwoSum{
 public  static int[] twoSumming(int[] arr1,int[] arr2, int target){
for(int i =0;i<arr1.length;i++){
 for(int j = 0; j<arr2.length;j++){
if(arr1[i]+arr2[j] == target){
return  new int[]{i,j};
}
}
} return new int[]{-1, -1}; 
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n1 = sc.nextInt();
int[] arr1 = new int[n1];
for(int i = 0;i<n1;i++){
arr1[i] = sc.nextInt();
}
int n2 = sc.nextInt();
int[] arr2 = new int[n2];
for(int i = 0;i<n2;i++){
arr2[i] = sc.nextInt();
} int target = sc.nextInt();
int[] result = twoSumming( arr1,  arr2,  target);
System.out.println(result[0] + " " + result[1]);
sc.close();
}
}
