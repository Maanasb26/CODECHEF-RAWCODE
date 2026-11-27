public class S12 {
    public static void main (String args [])
    {
        char chars [] = {'a','b','b','c','c','c'};
        int readindex =0; 
        int writeindex =0;

        
        while (readindex < chars.length)
        {
            // current character is the current element in the array 
            char currentchar = chars[readindex];
            // current count of that character is zero 
            int count =0;

            // while readindex is less than lenght and while current character is equal to the array element 
            while (readindex <chars.length && currentchar == chars[readindex])
            {
                // keep increasing the readinex and current index
                readindex++;
                count++;
            }

            // Write the current character and index in the same array 

            chars[writeindex] = currentchar;
            writeindex++;

            if(count > 1)
            {
                // convert the count into string 
                String counting = String.valueOf(count);

                for(char digit : counting.toCharArray())
                {
                    // insert the count digit individually and then increment the index 
                    chars[writeindex] = digit;
                    writeindex++;
                }
            }
           

        }


        System.out.println(writeindex);
    }
}
