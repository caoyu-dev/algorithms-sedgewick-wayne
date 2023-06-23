package algorithms_1_2;

import edu.princeton.cs.algs4.StdOut;

import java.math.BigDecimal;

public class example13 {
    private String name;
    private String date;
    private BigDecimal amount;

    public example13(String name, String date, BigDecimal amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "이름: " + getName() + ", 사용 일자: " + getDate() + ", 사용 금액: " + getAmount();
    }

    public static void main(String[] args) {
        BigDecimal amount = new BigDecimal(10000);
        example13 transaction = new example13("조유민", "2023-06-22", amount);
        StdOut.println(transaction);
    }
}
