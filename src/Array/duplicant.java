//java program to check duplication of element in array
package Array;

public class duplicant {
    public static boolean checkDuplicant(int []array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            for(int j = i+1 ; j<array.length ; j++)
            {
                if(array[i]==array[j])
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] array = {1 , 2 , 3 ,1};
        System.out.println(checkDuplicant(array));
    }
}
