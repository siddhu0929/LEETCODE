import java.util.*;
        public class Curtains{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        int L = sc.nextInt();

        int size = (str.length() + 2) / L;
        String[] arr = new String[size];
        int index = 0;
        for (int i = 0; i < str.length(); i += L) {
            int end = Math.min(i + L, str.length());
            arr[index] = str.substring(i, end);
            index++;
        }
        int maxCount = 0;
        for (String s : arr) {
            int count = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
            }
        }

        System.out.println( maxCount);
    }
}