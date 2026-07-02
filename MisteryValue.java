
import java.util.*;
public class MisteryValue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int count =0;
        while(n>0){
        
            int digit = n%10;
            count = count+digit;
            n =n/10;

        }
        count = count *r;
        int newCount = 0;
        while(count>0){
            int newDigit = count%10;
            newCount = newCount+newDigit;
            count=count/10;

        }
System.out.println(newCount);
        
}
}
