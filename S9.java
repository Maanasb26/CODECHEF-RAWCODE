// Permutation of String 
public class S9 {

    static boolean compare(int s1freq[], int s2freq[])
    {
        for(int i =0; i< 26; i++)
        {
            if(s1freq[i] != s2freq[i])
            {
                return false;
            }
        }
        return true; 
    }
    public static void main (String args [])
    {
       
        String s1 = "ac";
        String s2 = "eidbaooo";
        int windowlenght = s1.length();

        // check Frequency of s1 
        int s1freq [] = new int [26];

        for(char ch : s1.toCharArray())
        {
            s1freq[ch-'a']++;
        }

        // Step Check the Frequency of Window in S2 
        int s2freq [] = new int [26];
        int i =0;
        for( i =0; i< windowlenght; i++)
        {
            char ch = s2.charAt(i);
            int index = ch-'a';
            s2freq[index]++;

        }

        if(compare(s1freq, s2freq)== true)
        {
            System.out.println("Permutation Present ");
        }
        else
        {
            while (i<s2.length())
            {
                // Add new character 
                char ch = s2.charAt(i);
                // Update its freq in the table 
                int newcharindex = ch -'a';
                s2freq[newcharindex]++;

                // Remove old character and its index 

                char oldch = s2.charAt(i-windowlenght);
                int oldcharindex = oldch -'a';
                s2freq[oldcharindex]--;


                if(compare(s1freq, s2freq)== true)
                {
                    System.out.println("Permutation present ");
                    break;
                }

                i++;


            }
        }

        

        

    }
}
