package Strings;

import java.util.Scanner;

public class checkPalindrome {
    public static Boolean check(String str)
    {
        StringBuilder newstr = new StringBuilder();
        int length = str.length();
        for(int i = 0 ; i<length ; i++)
        {
            if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)))
            {
                newstr.append(str.charAt(i));
            }
        }

        int newLength = newstr.length();

        for(int i = 0 ; i<newLength/2 ; i++)
        {
            if(newstr.charAt(i) != newstr.charAt(newLength-1-i))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println(check(str));
    }
}
