package C42;

public class Staff extends Person {
    private  String school;
    private  double pay;

    public Staff(String school,String name ,String address,double pay) {
        super(name,address);
        this.school = school;
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Staff[Person[name="+getName()+",address="+getAddress()+"],school=" +getSchool() + ", pay=" + getPay() + "]";
    }
}
