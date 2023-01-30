//java program to reverse the array
package Array;

public class reverseArray {
    public static void myReverseArray(int []array)
    {
        int start = 0;
        int end = array.length-1;
        for(int i=start , j = end ; i<=j ; i++ , j--)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
    public static void display(int []array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args)
    {
        int []array = {10 , 20 , 30 , 40 , 50};
        System.out.println("Here is the array before reversing");
        display(array);
        System.out.println("\nHere is the array after reversing");
        myReverseArray(array);
        display(array);
    }
}
