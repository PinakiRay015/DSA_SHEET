//java program to find the the maximum sub array sum (KADANE'S ALGORITHM)
package Array;

public class maxSubArraySum3 {
    public static int getMaxSum(int []array)
    {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0 ; i<array.length ; i++)
        {
            currentSum = (currentSum<0) ? 0 : currentSum+array[i];
            maxSum = Math.max(currentSum , maxSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int []array = {-2 , -3 , 4 , -1 , -2 , 1 , 5 , -3};
        System.out.println(getMaxSum(array));
    }
}
