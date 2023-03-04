//java program to check whether a string is palindrome or not
package Strings;

import java.util.Scanner;

public class validPalindrome {
    public static Boolean checkPalindrome(String str)
    {
        str = str.toLowerCase();
        StringBuilder newStr = new StringBuilder();
        for(int i = 0 ; i<str.length() ; i++)
        {
            if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)))
            {
                newStr.append(str.charAt(i));
            }
        }

        for(int i = 0 ; i<newStr.length() ; i++)
        {
            if(newStr.charAt(i)!=newStr.charAt(newStr.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println(checkPalindrome(str));
    }
}
