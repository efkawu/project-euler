package pl.efkawu.projecteuler;

/**
 * User: ewa
 * Date: 9/14/13
 * Time: 10:06 PM
 */
public class P1_Multiplesof {

    private int divisor1;
    private int divisor2;


    public P1_Multiplesof(int divisor1, int divisor2) {
        this.divisor1 = divisor1;
        this.divisor2 = divisor2;
    }


    public int findSumOfAllDivisors_BrutalForce(int limit) {
        int sum = 0;
        for(int i=1; i<limit; i++) {
            if( i % divisor1 == 0 || i % divisor2 == 0)
                sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {

        P1_Multiplesof multiple = new P1_Multiplesof(3,5);
        System.out.println(multiple.findSumOfAllDivisors_BrutalForce(1000));

    }

}
