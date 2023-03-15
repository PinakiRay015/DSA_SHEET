//java program to solve the chocolate distribution problem of Geeks for Geeks
package DSA_Sheet;

import java.util.Arrays;

public class chocolateDistribution {
    public static int getMinDiff(int []array ,int n , int m)
    {
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(array);

        for(int i =0 ; i+m-1<n ; i++)
        {
            minDiff = Math.min(array[i+m-1] - array[i] , minDiff);
        }

        return minDiff;
    }
    public static void main(String[] args) {
        int []array = {7, 3, 2, 4, 9, 12, 56};
        int n = array.length;
        int m = 3;
        System.out.println(getMinDiff(array , n , m));
    }
}
