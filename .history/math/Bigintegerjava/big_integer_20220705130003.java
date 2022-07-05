// BigInteger class in java 

// 1.Modular Arithmetic
// 2.GCD calculation
// 3.Base Conversion
// 4.power calculation
// 5.Bitwise operartion
// 6.prime Generation 
// and more

package Bigintegerjava;

import java.util.*;
import java.math.*;

public class big_integer {

    static void playWithBigInt() {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();

        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger("1222222222222222222228");
        // b1 = b1.add(b2);
        b1 = b1.multiply(b2);
        System.out.println(b1);

        // Total set bits
        System.out.println(b1.bitCount() + " " + b2.bitCount());
        // Total no. of bits
        System.out.println(b1.bitLength() + " " + b2.bitLength());
    }

    public static void main(String[] args) {
        playWithBigInt();
    }
}
