// Permutation of String Problem Practiced Again 
public class S10 {

    public static boolean comaprefreq (int s1freq [], int s2freq[])
    {
        for(int i =0;i<26; i++)
        {
            if(s1freq[i] != s2freq[i])
            {
                return false;
            }
        }

        return true;
    }

    public static boolean checkpermutation (String s1, String s2)
    {
        int windowlenght = s1.length();
        
        // Frequency Table of S1 
        int s1freq [] = new int [26];
        for(char ch : s1.toCharArray())
        {
            s1freq[ch-'a']++;
        }

        // frequncey table S2 

        int s2freq []= new int [26];
        int i =0;

        for(i =0; i<windowlenght; i++)
        {
            char ch = s2.charAt(i);  
            s2freq[ch-'a']++;
        }

        // Compare the exact contents of S1 freq array and S2 freq Array 

        if(comaprefreq(s1freq, s2freq))
        {
            return true;
        }
        else
        {
            // we have to process the further part 

            // add the next element 
            while (i<s2.length())
            {
                char newchar = s2.charAt(i);
                int newcharindex = newchar - 'a';
                s2freq [newcharindex]++;


                // Delete the Old character 

                char oldchar = s2.charAt(i-windowlenght);
                int oldcharindex = oldchar-'a';
                s2freq[oldcharindex]--;

                i++;

                if(comaprefreq(s1freq, s2freq))
                {
                    return true;

                }
               
            }
        }


        return false ;
    }
    public static void main (String args [])
    {

        String s1 = "abcd";
        String s2 = "eurhcbaheh";
        
        if(checkpermutation(s1,s2))
        {
            System.out.println("Permutation");
        }
        else 
        {
            System.out.println("Not a Permutation ");
        }
    }
}
