package pl.efkawu.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 */
public class P3_LargestPrimeFactor {


    public Long findPrimeFactor(Long number) {
        List<Long> factors = new ArrayList<Long>();
        Long d = 2l;
        while(number > 1) {
            while( number % d == 0) {
                factors.add(d);
                number /= d;
            }
            d++;
            if (d*d > number && number > 1) {
                factors.add(number);
                break;
            }
        }
        return  Collections.max(factors);

    }


    public static void main(String[] args) {

        P3_LargestPrimeFactor factor = new P3_LargestPrimeFactor();

//        System.out.println(factor.findPrimeFactor(13195l));
        System.out.println(factor.findPrimeFactor(600851475143l));

    }
}
