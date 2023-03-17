//java program to check whether two strings are anagram or not
package Strings;

import java.util.Arrays;

public class validAnagram {
    public static boolean checkAnagram(String str1 , String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char []Array1 = str1.toCharArray();
        char []Array2 = str2.toCharArray();

        Arrays.sort(Array1);
        Arrays.sort(Array2);

        for(int i = 0 ; i<Array1.length ; i++)
        {
            if(Arrays.equals(Array1 , Array2))
            {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str1 = "anagram" , str2 = "nagaram";
        System.out.println(checkAnagram(str1 , str2));
    }
}
