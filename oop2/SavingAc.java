public class SavingAc {
    double balance;
    static double rate;

    SavingAc(double balance) {
        this.balance = balance;
    }

    public static void setRate(double _rate) {
        rate = _rate;
    }

    public void disp() {
        System.out.println("您的存款额是:" + this.balance);
    }

    public double yearInterest() {
        return this.balance * rate;
    }

    public double monthInterest() {
        return this.yearInterest() / 12;
    }

    public static void main(String[] args) {
        SavingAc saver = new SavingAc(3000);
        SavingAc.setRate(0.03);
        saver.disp();
        System.out.println("年利息是:" + saver.yearInterest());
        System.out.println("月利息是:" + saver.monthInterest());
    }
}