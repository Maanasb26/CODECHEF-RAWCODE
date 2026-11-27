// Check Pallindrome advance and optimised 
public class s4 {
    public static void main(String[] args) {
        String s1 = "ram";

        int left =0;
        int right = s1.length()-1;
        boolean bool = true;

        while (left <right)
        {
            if(s1.charAt(left)!= s1.charAt(right))
            {
                bool = false;
                break;
            }
           
   
                
          
            left ++;
            right --;

        }

        if(bool)
        {
            System.out.println("Pallindrom");
        }
        else
        {
            System.out.println(" Not a pallindrome ");
        }
    }
}
