//Java program to find the largest string
package Strings;

public class LargestString {
    public static void main(String[] args)
    {
        String []Fruits = {"watermelon" , "grape" , "banana"};
        String largest = Fruits[0];
        for(int i=1 ; i<Fruits.length ; i++)
        {
            if(largest.compareTo(Fruits[i]) < 0)
            {
                largest = Fruits[i];
            }
        }
        System.out.println("The largest string is "+largest);
    }
}
