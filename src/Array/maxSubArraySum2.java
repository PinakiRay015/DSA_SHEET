//java program to find the maximum sub array sum (prefix sum)
package Array;

public class maxSubArraySum2 {
    public static int getMaxSum(int []array)
    {
        int maxSum = Integer.MIN_VALUE;
        int [] prefixArray = new int[array.length];

        prefixArray[0] = array[0];
        for(int i=1 ; i<prefixArray.length ; i++)
        {
            prefixArray[i] = prefixArray[i-1] + array[i];
        }

        for(int i=0 ; i<array.length ; i++)
        {
            for(int j=i ; j<array.length ; j++)
            {
                int currentSum = (i==0) ? prefixArray[j] : prefixArray[j] - prefixArray[i-1];
                maxSum = Math.max(maxSum , currentSum);
            }
        }

        return maxSum;
    }
    public static void main(String[] args)
    {
        int []array = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
        System.out.println(getMaxSum(array));
    }
}
