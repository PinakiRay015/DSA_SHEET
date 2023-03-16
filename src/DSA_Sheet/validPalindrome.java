//java program to check whether a string is palindrome or not
package DSA_Sheet;

public class validPalindrome {
    public static boolean checkValidation(String str)
    {
        int length = str.length();
        StringBuilder newStr = new StringBuilder("");
        for(int i=0 ; i<length ; i++)
        {
            if(Character.isLetter(str.charAt(i)) || Character.isDigit(str.charAt(i)))
            {
                newStr.append(str.charAt(i));
            }
        }

        for(int i = 0 ; i<newStr.length()/2 ; i++)
        {
            if(newStr.charAt(i) == newStr.charAt(newStr.length()-1-i))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = new String("A man, a plan, a canal: Panama");
        System.out.println(checkValidation(str));
    }
}
