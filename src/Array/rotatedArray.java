//java program to practice search an element on rotated matrix using binary search
package Array;

public class rotatedArray {
    public static int rotatedSearch(int []array , int key)
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
    public static void main(String[] args) {
        int []array = {4,5,6,7,0,1,2,3};
        int positon = rotatedSearch(array , 0);
        if(positon==-1)
        {
            System.out.println("Not found!");
        }
        else
        {
            System.out.println("The element is present in the index "+positon);
        }
    }
}
