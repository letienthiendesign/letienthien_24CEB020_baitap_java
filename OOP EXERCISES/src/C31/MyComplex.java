package C31;

import java.lang.invoke.MutableCallSite;

public class MyComplex {
    private double real = 0;
    private double imag = 0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public boolean isReal(){
        return (real == 0);
    }
    public boolean isImaginary(){
        return (imag == 0);
    }
    public  boolean equals(double real,double imag){
        return (this.real == real && this.imag == imag);
    }
    public  boolean equals(MyComplex another){
        return (this.real == another.real && this.imag == another.imag);
    }
    public double magnitude(){
        return Math.sqrt(real*real + imag*imag);
    }
    public double argumnent(){
        return Math.atan2(imag,real);
    }
    public MyComplex add(MyComplex right){
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }
    public MyComplex addNew(MyComplex right){
        return new MyComplex(real,imag);
    }
    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(real - right.real, imag - right.imag);
    }public MyComplex multiply(MyComplex right) {
        double newReal = real * right.real - imag * right.imag;
        double newImag = real * right.imag + imag * right.real;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex divide(MyComplex right) {
        double denominator = right.real * right.real + right.imag * right.imag;
        double newReal = (real * right.real + imag * right.imag) / denominator;
        double newImag = (imag * right.real - real * right.imag) / denominator;
        this.real = newReal;
        this.imag = newImag;
        return this;
    }

    public MyComplex conjugate() {
        this.imag = -this.imag;
        return this;
    }
    @Override
    public String toString() {
        return real+"+"+imag+"i";
    }
}
