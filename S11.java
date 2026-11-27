// Remove All Adjacent Duplicates from the string 
public class S11 {
    public static void main (String args [])
    {
        String s1 = "xyyxyyxyyxyyzzz";
        // output -> ca

        StringBuilder ans = new StringBuilder();

        int i =0;
        int j =-1;

        while (i<s1.length()) {
                char currentchar = s1.charAt(i);

                if(ans.isEmpty())
                {
                    ans.append(currentchar);
                    j++;
                }

                else  if(ans.charAt(j)!= currentchar)
                {
                    ans.append(currentchar);
                    j++;
                }

                else 
                {
                    ans.deleteCharAt(j);
                    j--;
                }

                i++;

                
        }
        

        System.out.println(ans);
    }
}
