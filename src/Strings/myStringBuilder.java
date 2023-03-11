//java program to illustrate the StringBuilder
package Strings;

public class myStringBuilder {
    public static void main(String[] args) {
        StringBuilder sp = new StringBuilder();
        for(char ch = 'a' ; ch<='z' ; ch++)
        {
            sp.append(ch);
        }
        System.out.println(sp);
    }
}
