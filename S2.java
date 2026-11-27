// count number of vowels in string 
import java.util.*;
class s2
{
    public static void main (String args [])
    {
        String s1 = "Jay Ganesh... ";
        s1.toLowerCase();

        int count =0;
        for(char ch : s1.toCharArray())
        {
            if(ch =='a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }

        System.out.println("Vowel count : " + count);

    }
}