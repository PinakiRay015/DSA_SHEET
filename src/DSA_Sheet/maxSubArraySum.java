//java program to find the maximum sum
package DSA_Sheet;

public class maxSubArraySum {
    public static int getMax(int []array)
    {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0 ; i<array.length ; i++)
        {
            currentSum += array[i];
            maxSum = Math.max(currentSum , maxSum);
            currentSum = Math.max(currentSum , 0);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int []array = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The maximum sum is "+getMax(array));
    }
}
