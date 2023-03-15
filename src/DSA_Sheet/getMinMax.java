//java program to get the maximum and minimum element of an array
package DSA_Sheet;
public class getMinMax {
    public static int getMax(int []array)
    {
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<array.length ; i++)
        {
            largest = Math.max(largest , array[i]);
        }
        return largest;
    }

    public static int getMin(int []array)
    {
        int smallest = Integer.MAX_VALUE;
        for(int i = 0 ; i<array.length ; i++)
        {
            smallest = Math.min(smallest , array[i]);
        }
        return smallest;
    }
    public static void main(String[] args) {
        int []array = {2,4,6,8,10};
        System.out.println("The largest element is "+getMax(array));
        System.out.println("The smallest element is "+getMin(array));
    }
}
