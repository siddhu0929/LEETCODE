
import java.util.*;
public class PricingFormat {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =1;
        while(n>0){
int digit =n%10;
count = count *  digit;
n=n/10;
        }
System.out.println(count);
    }
        }