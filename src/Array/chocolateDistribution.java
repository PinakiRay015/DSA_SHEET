//java program to perform chocolate distribution problem of geeks for geeks
package Array;

import java.util.Arrays;

public class chocolateDistribution {
    public static int minDiff(int []array , int n ,int m)
    {
        Arrays.sort(array);
        int md = Integer.MAX_VALUE;
        for(int i = 0 ; i+m-1<n ; i++)
        {
            md = Math.min( (array[i+m-1] - array[i]), md);
        }
        return md;
    }
    public static void main(String[] args) {
        int []array = {7,3,2,4,9,12,56};
        int m = 3;
        int n = array.length;
        System.out.println("The minimum difference is "+minDiff(array , n , m));
    }
}
