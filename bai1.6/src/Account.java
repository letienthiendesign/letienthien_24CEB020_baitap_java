public class Account {
    private String id;
    private String name;
    private int balance;
    public Account(String id,String name){
        this.id=id;
        this.name=name;
        balance=0;
    }
    public Account(String id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        balance=amount+balance;
        return balance;
    }
    public int debit(int amount){
        if(amount<=balance){
            balance=balance-amount;
            return balance;
        }
        else System.out.println("Amount exceeded balance");
        return balance;
    }
    public int transferTo(Account another,int amount){
        if(amount<=balance){
            balance=balance-amount;
            another.balance=another.balance+amount;
            return balance;

        }
        else System.out.println("Amount exceeded balance");
        return balance;
    }

    @Override
    public String toString() {
        return "Account[id=" + id+",name="+name +",balance=" + balance + ']';
    }
}
