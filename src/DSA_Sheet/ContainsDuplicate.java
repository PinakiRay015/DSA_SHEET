//java program to check if an element is repeating twice or not in an array.
package DSA_Sheet;

import java.util.Arrays;

public class ContainsDuplicate {
    public static boolean checkDuplicate(int []array)
    {
        Arrays.sort(array);
        for(int i=0 ; i<array.length-1 ; i++)
        {
            if(array[i]==array[i+1])
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []array = {1 , 2 , 3 , 1};
        System.out.println(checkDuplicate(array));
    }
}
