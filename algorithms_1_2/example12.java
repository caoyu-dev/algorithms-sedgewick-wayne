package algorithms_1_2;

public class example12 {
    // cannot solve
    private int year;
    private int month;
    private int date;

    private final String[] daysOfWeek = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    public example12(int year, int month, int date) {
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
}
