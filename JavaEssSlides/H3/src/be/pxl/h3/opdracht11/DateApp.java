package be.pxl.h3.opdracht11;

import java.time.LocalDate;

public class DateApp {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2003, 9, 15);

        System.out.println(birthday);
        System.out.println("Day " + birthday.getDayOfYear() + " of the year " + birthday.getYear());
        System.out.println("It was on a " + birthday.getDayOfWeek());

        StringBuilder leapYear = new StringBuilder();
        leapYear.append("Was it a leap year? ");
        if (birthday.isLeapYear()) {
            leapYear.append("Yes!");
        } else {
            leapYear.append("No...");
        }
        System.out.println(leapYear);
    }
}
