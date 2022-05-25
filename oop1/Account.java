import java.math.*;

public class Account {
    static double min = 10;
    String account;
    String name;
    String address;
    double balance;

    Account(String account, String name, String address, double balance) {
        this.account = account;
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    public void deposit(double num) {
        System.out.println("您帐户原有余额：" + Math.floor(balance * 10) / 10.0);
        System.out.println("现存入：" + Math.floor(num * 10) / 10.0);
        balance += num;
        System.out.println("当前余额：" + Math.floor(balance * 10) / 10.0);
    }

    public void withdraw(double num) {
        if (num <= balance) {
            balance -= num;
            System.out.println("当前余额：" + Math.floor(balance * 10) / 10.0);
        } else {
            System.out.println("余额不够，至少保留余额：" + Math.floor(min * 10) / 10.0);
        }
    }

    public void query() {
        System.out.println("您的当前余额：" + Math.floor(balance * 10) / 10.0);
    }
    /* …源代码… */

    public static void main(String[] args) {
        Account jame = new Account("111111", "张杰", "浙江大学", 200);
        jame.deposit(350);
        jame.withdraw(300);
        jame.withdraw(300);
        jame.query();
    }
}