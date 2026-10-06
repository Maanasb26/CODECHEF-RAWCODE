import java.util.*;
public class p6 {
    public static void main(String[] A) {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Number of Frames in Video");
        int N = sobj.nextInt();
        int Arr [] = new int [N];
        int framecount =1;
        System.out.println("Enter the Frame Elements : ");
        for(int i =0; i<N;i++)
        {
            Arr[i] = sobj.nextInt();
          

        }

        for(int i =1;i<N;i++)
        {
            if(Arr[i]!= Arr[i-1])
            {
                framecount++;
            }
        }

        System.out.println("Final Frames : "+framecount);


        
}
}