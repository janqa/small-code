package example.smallcode;

import java.math.BigInteger;

public class Main {
    private static final BigInteger THREE = BigInteger.valueOf(3);
    private static final BigInteger ONE = BigInteger.ONE;
    private static final BigInteger TWO = BigInteger.TWO;

    public static void main(String... args) {
        System.out.println(solution(BigInteger.valueOf(12345678)));
    }

    public static Object solution(BigInteger n) {
        var num = n;
        var moves = 0;
        while (!num.equals(ONE)) {
            if (num.mod(TWO).equals(0))
                num = num.divide(TWO);
            else if (num.equals(THREE))
                num = num.subtract(ONE);
            else if (num.toString().substring(num.bitCount() - 2).equals("11")) {
            } else
                num = num.min(ONE);
            moves += 1;
        }
        return moves;
    }
}
