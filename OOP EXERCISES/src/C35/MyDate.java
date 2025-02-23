package C35;

import C34.MyTime;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    public static final String[] DAYS = {
            "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"
    };

    public static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
    };

    public MyDate(int year,int month,int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void setDate(int year,int month,int day) {
        if(isValidDate(year,month,day));
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }
    public boolean isValidDate(int year,int month,int day) {
        if (year < 1 || year > 9999 || month < 1 || month > 12 || day < 1)
            return false;
        int maxDay = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDay = 29;
            return day <= maxDay;
        }
        return false;
    }
        // công thức Zeller’s Congruence
    public int isDayOfWeek(int year,int month,int day){
                if (month < 3) {
                    month += 12;
                    year--;
                }
                int k = year % 100;
                int j = year / 100;
                int h = (day + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
                return (h + 5) % 7;
            }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return DAYS[isDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (month < 12) {
            day = 1;
            month++;
        } else {
            day = 1;
            month = 1;
            year++;
        }
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else if (month > 1) {
            month--;
            day = DAYS_IN_MONTHS[month - 1];
            if (month == 2 && isLeapYear(year)) day = 29;
        } else {
            month = 12;
            day = 31;
            year--;
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month < 12) {
            month++;
        } else {
            month = 1;
            year++;
        }
        day = Math.min(day, DAYS_IN_MONTHS[month - 1]);
        if (month == 2 && isLeapYear(year)) day = 29;
        return this;
    }

    public MyDate previousMonth() {
        if (month > 1) {
            month--;
        } else {
            month = 12;
            year--;
        }
        day = Math.min(day, DAYS_IN_MONTHS[month - 1]);
        if (month == 2 && isLeapYear(year)) day = 29;
        return this;
    }

    public MyDate nextYear() {
        if (month == 2 && day == 29 && !isLeapYear(year + 1)) {
            day = 28;
        }
        year++;
        return this;
    }

    public MyDate previousYear() {
        if (month == 2 && day == 29 && !isLeapYear(year - 1)) {
            day = 28;
        }
        year--;
        return this;
    }
}
