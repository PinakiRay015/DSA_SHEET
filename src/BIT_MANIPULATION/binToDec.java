//java program to convert the binary digit into decimal
package BIT_MANIPULATION;

public class binToDec {
    public static int getDec(int bin)
    {
        int pwr = 0;
        int ans = 0;
        while(bin!=0)
        {
            int lastDigit = bin%10;
            ans += lastDigit*(int)Math.pow(2 , pwr);
            bin = bin/10;
            pwr++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int bin = 101;
        System.out.println(getDec(bin));
    }
}
