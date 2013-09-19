package pl.efkawu.projecteuler;

/**
 * User: ewa
 * Date: 9/18/13
 * Time: 09:06 PM
 */
public class P2_Fibonacci {

    private int term1 = 1;
    private int term2 = 2;

    public P2_Fibonacci() {}

    public long countEvenTerm(long limit) {
        int a = term1;
        int b = term2;
        int term = a + b;
        int sum = b;
        while(term < limit ) {
            sum += term%2==0?term:0;
            a = b;
            b = term;
            term = a + b;
        }
        return sum;
    }

    public static void main(String[] args) {

        P2_Fibonacci fib = new P2_Fibonacci();
        System.out.println(fib.countEvenTerm(4000000));

    }
}
