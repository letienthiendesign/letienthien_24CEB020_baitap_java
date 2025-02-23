package C33;

import java.math.BigInteger;

public class testBigInteger {

        public static void main(String[] args) {
            // Khởi tạo hai số nguyên lớn
            BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
            BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");

            System.out.println("Sum: " + i1.add(i2));
            System.out.println("Product: " + i1.multiply(i2));
        }
    }


