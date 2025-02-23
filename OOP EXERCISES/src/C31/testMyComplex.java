package C31;

import java.util.Scanner;

public class testMyComplex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complex number 1( real and imaginary part ): ");
               double real1 = scanner.nextDouble();
               double imag1 = scanner.nextDouble();
               MyComplex c1 = new MyComplex(real1,imag1);
        System.out.print("Enter complex number 2( real and imaginary part ): ");
                double real2 = scanner.nextDouble();
                double imag2 = scanner.nextDouble();
        MyComplex c2 = new MyComplex(real2,imag2);
        System.out.println(" ");
        System.out.println("Number 1 is: ("+ c1+")");
        System.out.println(c1+" " + (c1.isReal() ? " is NOT a pure real number" : "is NOT a pure real number" ));
        System.out.println(c1+" " + (c1.isImaginary() ? " is NOT a pure imaginary number" : "is NOT a pure imaginary number" ));
        System.out.println(" ");
        System.out.println("Number 2 is: ("+ c2+")");
        System.out.println(c2+" " + (c2.isReal() ? " is NOT a pure real number" : "is NOT a pure real number" ));
        System.out.println(c2+" " + (c2.isImaginary() ? " is NOT a pure imaginary number" : "is NOT a pure imaginary number" ));
        System.out.println(" ");

        if(c1.equals(c2)){
            System.out.println(c1+"is equal to"+c2);
        }
        else{
            System.out.println(c1+" is NOT equal to "+c2);
        }

        MyComplex sum = new MyComplex(c1.magnitude(),c2.magnitude());
        sum.add(c1);
        System.out.println(c1+" + "+c2+" = " + sum );
        MyComplex signal = new MyComplex(c1.getReal(),c2.magnitude());
        signal.add(c1);
        System.out.println(c1+" - "+c2+" = " + signal );
        MyComplex accumulation = c1.multiply(c2);
        accumulation.add(c1);
        System.out.println(c1+" * "+c2+" = " + accumulation );
        MyComplex love = c1.divide(c2);
        love.add(c1);
        System.out.println(c1+" / "+c2+" = " + love );
    }

}
