//java program to find the maximum sub array sum (KADANE'S ALGORITHM)
package Array;

public class maxSubArraySum3 {
    public static int getMaxSum(int []array)
    {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i = 0 ; i<array.length ; i++)
        {
            currentSum += array[i];
            maxSum = Math.max(currentSum , maxSum);
            currentSum = Math.max(currentSum , 0);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int []array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The maximum sub array sum is "+getMaxSum(array));
    }
}
