// Lexicographically first most frequenct elements of the array 
public class S6 {
    public static void main(String[] args) {
        String s1 = "bbbaaa";
        // output = t;
        s1.toLowerCase();

        int arr [] = new int[26];

        // Created a Frequency array 
        for(char ch : s1.toCharArray())
        {
            int currentchar = ch;
            arr[currentchar - 'a']++;
        }



        int highest =0;

        char ans = 0;
        for(int i =0; i< arr.length; i++)
        {
           if(arr[i]>highest)
           {
            highest = arr[i];
            ans = (char)(i + 'a');
            
           }

        }

        System.out.println(ans);

        
    }
}
