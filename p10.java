import java.util.*;
public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =0;
        System.out.println("Enter NUmber of Days : ");
        n = sc.nextInt();

        int om [] = new int[n];
        int addy [] = new int [n];

        System.out.println("Enter the Streak Elements for OM ");
        for(int i =0; i<n;i++)
        {
            om[i]= sc.nextInt();
        }

        System.out.println("Enter the streak elements for Addy ");

        for(int i =0; i<n;i++)
        {
            addy[i]= sc.nextInt();
        }

        int omcounter =0;
        int omlargest =0;

        int addycounter = 0;
        int addylargest =0;

        for(int i =0;i<n;i++)
        {
            if(om[i]!= 0)
            {
                omcounter++;
                omlargest = Math.max(omcounter, omlargest);
            }
            else
            {
                omcounter=0;
            }
        }

        for(int i =0;i<n;i++)
        {
            if(addy[i]!= 0)
            {
                addycounter++;
                addylargest = Math.max(addycounter, addylargest);
            }
            else
            {
                addycounter=0;
            }
        }

        if(omlargest > addylargest)
        {
            System.out.println("OM");
        }
        else if (omlargest < addylargest)
        {
            System.out.println("ADDY");
        }
        else
        {
            System.out.println("Draw ");
        }

    }

    
}
