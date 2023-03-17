//java program to compress a string
package Strings;

public class stringCompress {
    public static StringBuilder compress(String str)
    {
        StringBuilder stringBuilder1 = new StringBuilder("");
        StringBuilder stringBuilder2 = null;
        for(int i = 0 ; i<str.length() ; i++)
        {
            int count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
            {
                count++;
                i++;
            }
            stringBuilder1.append(str.charAt(i));
            stringBuilder2 = count > 1 ? stringBuilder1.append(count): stringBuilder1.append("");
        }
        return stringBuilder2;
    }
    public static void main(String[] args) {
        String str = "aaabbbbcc";
        System.out.println(compress(str));
    }
}
