// Pivot Index 
public class A20 {
    public static void main(String[] args) {
        int arr [] = {1,7,3,6,5,6};
        int leftsum [] = new int[arr.length];
        int rightsum [] = new int[arr.length];

        leftsum[0] = arr[0];
        for(int i =1; i< arr.length; i ++)
        {
            leftsum[i] = leftsum[i-1] + arr[i];
        }

        rightsum[arr.length-1] = arr[arr.length-1];

        for(int i = arr.length-2; i>=0; i--)
        {
            rightsum[i] = rightsum[i+1] + arr[i];
        }

 
        for(int k =0; k< arr.length; k++)
        {
            System.out.print(leftsum[k]+ " ");
        }

        System.out.println();
         for(int k =0; k< arr.length; k++)
        {
            System.out.print(rightsum[k]+ " ");
        }

        System.out.println();
        System.out.println("Pivot Index : ");

        for(int i =0; i< arr.length; i++)
        {
            if(leftsum[i]== rightsum[i])
            {
                System.out.println(i);
            }
        }




    }
}
