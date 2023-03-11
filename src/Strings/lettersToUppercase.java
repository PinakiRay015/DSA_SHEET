//java program to convert the first letter of the word to uppercase
package Strings;

public class lettersToUppercase {
    public static StringBuilder toUpperCase(String str)
    {
        StringBuilder newstring = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        newstring.append(ch);

        for(int i = 1 ; i<str.length() ; i++)
        {
            if(str.charAt(i) == ' ' && i<str.length()-1)
            {
                newstring.append(str.charAt(i));
                i++;
                newstring.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                newstring.append(str.charAt(i));
            }
        }

        return newstring;
    }
    public static void main(String[] args)
    {
       String str = "hi, i am pinaki sankar ray";
        System.out.println(str);
        System.out.println(toUpperCase(str));
    }
}
