//java program to reverse the array
package DSA_Sheet;

public class reverseArray {
    public static void reverse(int []array)
    {
        for(int i = 0 , j = array.length-1 ; i<=j ; i++ , j--)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void display(int []array)
    {
        for(int i=0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int []array = {2 , 4 , 6 , 8 , 10};
        display(array);
        reverse(array);
        System.out.println("");
        display(array);
    }
}
