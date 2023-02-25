import java.util.Arrays;
import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []array = new int[size];
        for(int i = 0 ; i<size ; i++)
        {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        int min = Integer.MIN_VALUE;
        for(int i = 0 ; i<array.length-1 ; i++)
        {
            min = Math.max(array[i] , min);
        }

        System.out.println("The second largest is "+min);
    }
}
