// Highest Frequency Element in Array 

import java.util.HashMap;

public class A15 {
    public static void main(String[] args) {
        HashMap <Integer, Integer>  map = new HashMap<>();

        int arr [] = {1,1,1,1,2,2,3,3,4,4,5,5,6};

        for(int num : arr)
        {
            map.put(num, map.getOrDefault(num,0)+1);
        }

    
        int maxfreq = -1;
        int maxkey = -1;

        for(int key : map.keySet())
        {
            int Frequency = map.get(key);
            int currentkey = key;
            if (Frequency > maxfreq)
            {
                maxfreq = Frequency;
                maxkey = key;
                
            }
        }


        System.out.println(maxkey + " - " + maxfreq);

    }
}

