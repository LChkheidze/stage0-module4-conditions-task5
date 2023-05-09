package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        String aYear = (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0))? "not leap" : "leap";

        System.out.println(aYear);
    }
}
