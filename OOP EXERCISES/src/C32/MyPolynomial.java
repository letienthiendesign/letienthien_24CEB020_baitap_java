package C32;

public class MyPolynomial {
    private double[] coeffs;

    // Constructor using varargs
    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        for (int i = 0; i <= maxDegree; i++) {
            double coeffA = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double coeffB = (i <= right.getDegree()) ? right.coeffs[i] : 0;
            newCoeffs[i] = coeffA + coeffB;
        }
        return new MyPolynomial(newCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (coeffs[i] != 0) {
                if (sb.length() > 0) {
                    sb.append(" + ");
                }
                sb.append(coeffs[i]);
                if (i > 0) {
                    sb.append("x");
                    if (i > 1) {
                        sb.append("^").append(i);
                    }
                }
            }
        }
        return sb.toString();
    }

}

