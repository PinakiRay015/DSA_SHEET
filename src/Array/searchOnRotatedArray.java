//java program to perform the binary search on rotated sorted array
package Array;

public class searchOnRotatedArray {
    public static int search(int []array , int key)
    {
        int start = 0;
        int end = array.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(array[mid]==key)
            {
                return mid;
            }
            else if(array[start] < array[mid])
            {
                if(key>=array[start] && key<array[mid])
                {
                    end = mid-1;
                }
                else
                {
                    start = mid+1;
                }
            }
            else
            {
                if(key>array[mid] && key<=array[end])
                {
                    start = mid+1;
                }
                else
                {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void display(int []array)
    {
        for(int i=0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int []array = {4,5,6,7,0,1,2};
        System.out.println("Here is your Rotated sorted array");
        display(array);
        int position = search(array , 6);
        if(position==-1)
        {
            System.out.println("\nNot found");
        }
        else
        {
            System.out.println("\nThe position of the key is "+position);
        }
    }
}
