package DSA_Sheet;

public class subArray {
    public static void mySubArray(int []array)
    {
        for(int i = 0 ; i<array.length ; i++)
        {
            for(int j = i ;j<array.length ; j++)
            {
                for(int k=i ; k<=j ; k++)
                {
                    System.out.print(array[k]+"\t");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int []array = {2,4,6,8,10};
        mySubArray(array);
    }
}
