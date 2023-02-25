//java program to find out the permutation
import java.util.Scanner;

public class permutation {
    public static int factorial(int num)
    {
        int fact = 1;
        for(int i = 1 ; i<=num; i++)
        {
            fact = fact*i;
        }

        return fact;
    }

    public static int permutation(int n , int r)
    {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int ans = (fact_n)/(fact_nmr);
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r");
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println("The permutation is "+permutation(n , r));
    }
}
