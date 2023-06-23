package algorithms_1_2;

import edu.princeton.cs.algs4.StdOut;

import java.math.BigDecimal;

public class example14 {
    private String name;
    private String date;
    private BigDecimal amount;

    public example14(String name, String date, BigDecimal amount) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        example14 example14 = (example14) o;
        if (!this.name.equals(example14.name)) {
            return false;
        }
        if (!this.date.equals(example14.date)) {
            return false;
        }
        if (this.amount.compareTo(example14.amount) != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        BigDecimal amount1 = new BigDecimal(10000);
        BigDecimal amount3 = new BigDecimal(300000);
        example14 transaction1 = new example14("조유민", "2023-06-22", amount1);
        example14 transaction2 = new example14("조유민", "2023-06-22", amount1);
        example14 transaction3 = new example14("해피캣", "2023-06-22", amount3);
        example14 transaction4 = transaction3;

        StdOut.println("Equals 1: " + transaction1.equals(transaction2) + ", Expected: true");
        StdOut.println("Equals 2: " + transaction2.equals(transaction1) + ", Expected: true");
        StdOut.println("Equals 3: " + transaction1.equals(transaction3) + ", Expected: false");
        StdOut.println("Equals 4: " + transaction3.equals(transaction4) + ", Expected: true");
    }
}
