// Reverse Word in String
public class error {
    public static void main (String args []) {
        String s1 = "The Sky is Blue ";
        StringBuilder ans = new StringBuilder();
        // output -> Blue is sky the

        // Remove the Trailing Spaces and middle white spaces
        String result = s1.trim().replaceAll("\\s+", " ");
        System.out.println(result);

        // Find starting point of word
        int i = result.length()-1;
        int j = i;

        char arr[]= result.toCharArray();

        while (i>=0) {
            while(j>=0 && arr[j]!= ' ') {
                j--;
            }
            ans.append(result.substring(j+1,i+1));
            ans.append(' ');
            i= j-1;
            j =i;
        }

        System.out.println(ans);
    }
}
