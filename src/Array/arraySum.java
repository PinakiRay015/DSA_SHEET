//java program to find the sum of the elements of the array
package Array;

public class arraySum {
    public static int arraySum(int []array)
    {
        int sum = 0;
        for(int i = 0 ; i<array.length ; i++)
        {
            sum +=array[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int []array = {2,4,6};
        System.out.println(arraySum(array));
    }
}
