//java program to perform counting sort
package Sorting;

public class CountSort {
    public static void countingSort(int []array)
    {
        int largest = Integer.MIN_VALUE;
        for(int i=0 ; i<array.length ; i++)
        {
            largest = Math.max(largest , array[i]);
        }

        int [] count = new int[largest+1];

        for(int i=0 ; i<array.length ; i++)
        {
            count[array[i]]++;
        }

        int j = 0;

        for(int i=0 ; i<count.length ; i++)
        {
            while(count[i]>0)
            {
                array[j] = i;
                j++;
                count[i]--;
            }
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
        int []array = {2,4,1,3,5};
        display(array);
        countingSort(array);
        System.out.println("");
        display(array);
    }
}
