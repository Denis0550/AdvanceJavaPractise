package SDA_Enumerated_Types_Tasks;

import com.sun.security.jgss.GSSUtil;

public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Saturday is a holiday: " + Weekday.SATURDAY.isHoliday());
        System.out.println("Friday is weekday: " + Weekday.FRIDAY.isWeekDay());
        Weekday.TUESDAY.whichIsGreater(Weekday.FRIDAY);
    }
}


enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }
    boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    void  whichIsGreater (Weekday weekday) {
        if(this.ordinal() < weekday.ordinal()) {
            System.out.println("Before " + weekday);
        } else {
            System.out.println("After " + weekday);
        }
    }
}
