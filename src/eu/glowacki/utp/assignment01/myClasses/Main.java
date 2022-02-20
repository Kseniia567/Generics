package eu.glowacki.utp.assignment01.myClasses;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

            LocalDate date= LocalDate.of(1992,6,6);

            System.out.println(ChronoUnit.DAYS.between(date, LocalDate.now()));

    }
}
