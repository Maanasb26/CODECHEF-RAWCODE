// Return Postive and Negative Sum of Array Elements 
public class A11 {
    public static void main(String[] args) {
        int arr [] = {1,-1,2,-2};
        int psum =0;
        int nsum =0;

        for(int i =0;i<arr.length; i++)
        {
            if(arr[i]>0)
            {
                psum = psum + arr[i];
            }
            else
            {
                nsum = nsum + arr[i];
            }
        }

        System.out.println("Positive Sum : "+ psum);
        System.out.println("Negatvie Sum : "+ nsum);
    }
}
