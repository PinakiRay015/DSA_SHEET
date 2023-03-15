//java program to find an element on the rotated sorted array (Time complexity O(n log n))
package DSA_Sheet;

public class rotatedArraySearch {
    public static int getPosition(int []array , int key)
    {
        int start = 0;
        int end = array.length;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(array[mid] == key)
            {
                return mid;
            }
            else if(array[start]<array[mid])
            {
                if(key>=array[start] && key<array[mid])
                {
                    end = mid-1;
                }
                else
                {
                    start = start+1;
                }
            }
            else
            {
                if(key>array[mid] && key<=array[end])
                {
                    start = start+1;
                }
                else
                {
                    end = end-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []array = {4,5,6,7,0,1,2,3};
        int position = getPosition(array , 0);
        System.out.println((position==-1)? "Not found!!" : position);
    }
}
