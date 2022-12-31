package task3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1985, 2,24);
        LocalDate today = LocalDate.now() ;
        LocalTime myT = LocalTime.of(0,0,0);
        LocalTime myTNow= LocalTime.now() ;
        MyPeriod(myBirthday, today, myT ,myTNow);
    }
    private static void MyPeriod(LocalDate myBirthday,LocalDate today,LocalTime myT, LocalTime myTNow) {
        int years = Period.between(myBirthday, today ).getYears();
        int month = Period.between(myBirthday, today ).getMonths();
        int day = Period.between(myBirthday, today ).getDays();
        int h = myTNow .getHour() - myT.getHour() ;
        int m = myTNow.getMinute() - myT.getMinute() ;
        int c = myTNow.getSecond() - myT.getMinute() ;
        System.out.print("Мені виповнилося " + years + " років, " + month  + " місяці, " + day  + " днів, " );
        System.out.println(h + " годин, "+ m + " хвилин, "+ c + " секунд." );
    }
}
