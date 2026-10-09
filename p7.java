import java.security.*;
import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of problems solved by user : ");
        int N = sc.nextInt();

        int Arr [] = new int[N];
    

        System.out.println("Enter the Array Elements : ");
        for(int i =0; i<N;i++)
        {
           Arr[i] = sc.nextInt();
           
        }

        for(int i =1; i<N;i++)
        {
            if(Arr[i]<Arr[i-1])
            {
                System.out.println("NO");
                return ;
            }
            
        }

        System.out.println("YES");






    }
}
