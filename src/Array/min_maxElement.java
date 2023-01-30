//java program to find the minimum and maximum element of an array
package Array;

public class min_maxElement {
    public static void maxAndMin(int []array)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<array.length ; i++)
        {
            if(min>array[i])
            {
               min = array[i];
            }
            if(max<array[i])
            {
               max = array[i];
            }
        }
        System.out.println("The minimum element is "+min);
        System.out.println("The maximum element is "+max);
    }
    public static void display(int []array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int []array = {34 , 43 , 12 , 3 , 33};
        display(array);
        System.out.println("\n");
        maxAndMin(array);
    }
}
