//java program to convert the letters to the uppercase
package Strings;

public class letterToUpperCase {
    public static StringBuilder cnvrtUppCase(String str)
    {
        StringBuilder newstr = new StringBuilder("");
        newstr.append(Character.toUpperCase(str.charAt(0)));
        for(int i = 1 ; i<str.length() ; i++)
        {
            if(str.charAt(i) == ' ' && i<str.length()-1)
            {
                newstr.append(str.charAt(i));
                i++;
                newstr.append(Character.toUpperCase(str.charAt(i)));
            }
            else
            {
                newstr.append(str.charAt(i));
            }
        }

        return newstr;
    }
    public static void main(String[] args) {
        String str = "hi i am pinaki sankar ray";
        System.out.println(cnvrtUppCase(str));
    }
}
