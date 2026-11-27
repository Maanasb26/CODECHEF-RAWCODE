// Reverse a string and check pallindrome 
import java.util.*;
public class s3 {
    public static void main(String[] args) {
        String s1 = "racecar";
        String s2 = s1;
        char arr [] = s1.toCharArray();

        int left =0;
        int right = arr.length -1;

        while (left <right )
        {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;

        }

    String reverse = new String(arr);

     System.out.println(reverse);

     if(s1.equals(reverse))
     {
        System.out.println("Pallindrome");
     }
     else
     {
        System.out.println("Not a Pallindrome ");
     }


    }
}
