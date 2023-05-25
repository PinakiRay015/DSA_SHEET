//leetcode two sum 1 using brute force
package Array;
import java.util.Arrays;

public class twoSum_bruteForce {
    public static int[] getTarget(int []array , int target)
    {
        for(int i=0 ; i<array.length-1 ; i++)
        {
            for(int j=i+1 ; j<array.length ; j++)
            {
                if(array[i]+array[j] == target)
                {
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1 , -1};
    }
    public static void main(String[] args) {
        int []array = {3,2,3};
        int target = 6;
        int []indices = getTarget(array , target);
        System.out.println((indices[0]!=-1) ? Arrays.toString(indices) : "Not found");
    }
}
