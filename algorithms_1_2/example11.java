package algorithms_1_2;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Date;

public class example11 {
    private int year;
    private int month;
    private int date;

    public example11(int year, int month, int date) {
        if (!isValid(year, month, date)) {
            throw new IllegalArgumentException("날짜 값이 유효하지 않습니다.");
        }
        this.year = year;
        this.month = month;
        this.date = date;
    }

    private boolean isValid(int year, int month, int date) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // 윤년
        if (isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        if (year < 1) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        if (date < 1 || date > daysInMonth[month - 1]) {
            return false;
        }
        return true;
    }

    private boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        return year % 4 == 0;
    }

    public String toString() {
        return year + "년 " + month + "월 " + date + "일";
    }

    public static void main(String[] args) {
//        example11 example = new example11(2023, 13, 22);    // 날짜 값이 유효하지 않습니다.
//        example11 example = new example11(2023, 6, 22);    // 2023년 12월 22일
        example11 example = new example11(2400, 2, 29); // 2400년 2월 29일
        StdOut.println(example.toString());    // Sat
    }
}
