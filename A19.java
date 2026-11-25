
// Three Sum problem 
import java.util.ArrayList;
import java.util.*;
public class A19 {
    public static void main(String[] args) {
        int arr [] = {-1,0,1,2,-1,-4};

        List<List<Integer>> output = new ArrayList<>();


        int target =0;
        for(int i =0; i< arr.length-1;i++)
        {
            for(int j =i+1; j< arr.length-1;j++)
            {
                for(int k = j+1; k<arr.length-1; k++)
                {
                    if((arr[i]+ arr[j]+arr[k])==target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);

                        output.add(temp);
                    }
                }
            }
        }


        System.out.println(output);
    }
}
