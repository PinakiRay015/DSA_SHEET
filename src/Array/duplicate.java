//java program to check duplication of element in array and if contains duplicate then return TRUE otherwise false
package Array;

import java.util.Arrays;

public class duplicate {
    public static boolean checkDuplicate(int []array)
    {
        Arrays.sort(array);
        for(int i = 0 ; i<array.length ; i++)
        {
            if(array[i] == array[i+1])
            {
                return true;
            }
            break;
        }
        return false;
    }
    public static void main(String[] args) {
        int [] array = {1 , 2 , 3 ,1};
        System.out.println(checkDuplicate(array));
    }
}
