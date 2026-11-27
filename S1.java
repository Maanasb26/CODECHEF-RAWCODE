import java.util.*;
// Count the lenght of the string without using lenght function
public class S1 {
    public static void main (String args [])
    {
        String s1 = "Jay Ganesh...";
        // ouput 13 
        int count=0;

        for(char ch : s1.toCharArray())
        {
            count++;
        }

        System.out.println(count);
    }

}
