import java.util.Scanner;
  class FirstNonRepeatingChar{
public static int character(String s){
int[] freq = new int[26];
for( int i = 0; i< s.length();i++){
freq[s.charAt(i) -'a']++;
}
for(int i = 0;i<s.length();i++){
 if(freq[s.charAt(i) -'a'] == 1){
return i;
}
}
return -1;g
}
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
int result = character(s);
System.out.println(result);
}
}
