import java.util.HashMap;

public class A4 {
    public static void main(String[] args) {
        HashMap <Integer, Integer > map = new HashMap<>();
        int[] arr = {1, 3, 4, 2, 2};

        for(int i : arr)
        {
            if(map.containsKey(i))
            {
                map.put(i, map.get(i)+1);
            }
            else 
            {
                map.put(i, 1);
            }
        }


        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println("Duplicate element: " + key); 
            }
        }

        


    }
}
