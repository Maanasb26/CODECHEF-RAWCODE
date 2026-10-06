import java.util.*;
public class p5
{
    public static  void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter The Number of Players : ");
        int N = sc.nextInt(); 
        System.out.println("Please Enter Constant Height");
        int K = sc.nextInt();

        int [] Arr = new int[N];

        int counter =0;
        System.out.println("Enter the Heights in Sequence ");
        for(int i =0; i<N;i++)
        {
            Arr[i] = sc.nextInt();
            if(Arr[i]>K)
            {
                counter++;
            }
        }

        System.out.println("Number of Players Whose Height is Greater then K are: "+ counter);
    }
}