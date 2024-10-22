package Q1;

import java.util.Scanner;

public class Minutes2YearsAndDays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long minutes = in.nextLong();
        int years = (int) minutes / (365*24*60);
        int days = (int) minutes % (365*24*60) / (24*60);
        System.out.printf("%d minutes is approximately %d years and %d days\n", minutes, years, days);
    }
}
