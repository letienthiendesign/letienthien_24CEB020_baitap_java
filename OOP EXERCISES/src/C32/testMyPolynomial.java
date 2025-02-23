package C32;

public class testMyPolynomial {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1, 2, 3);
        MyPolynomial p2 = new MyPolynomial(2, 1, 4, 3);

        System.out.println("Polynomial 1: " + p1);
        System.out.println("Polynomial 2: " + p2);

        System.out.println("Degree of P1: " + p1.getDegree());
        System.out.println("Degree of P2: " + p2.getDegree());

        System.out.println("Evaluate P1 at x=2: " + p1.evaluate(2));

        MyPolynomial sum = p1.add(p2);
        System.out.println("Sum: " + sum);
    }
}

