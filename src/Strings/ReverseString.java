//java program to reverse a string
package Strings;

import java.util.Scanner;

public class ReverseString {
    public static String myReverse(String str)
    {
        String ReverseStr ="";
        int length = str.length();
        for(int i = length-1 ; i>=0 ; i--)
        {
            ReverseStr += str.charAt(i);
        }
        return ReverseStr;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println(myReverse(str));
    }
}
