package cn.day02JdbcTemplate.Template;

public class Emp {

    private String name;
    private double balance;

    public Emp() {
    }

    public Emp(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
