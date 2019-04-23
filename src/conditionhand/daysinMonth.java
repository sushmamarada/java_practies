package conditionhand;

import java.util.Scanner;

public class daysinMonth {

    public void days(){
        int month;
        Scanner m = new Scanner(System.in);
        System.out.println("Please enter no.of the month: -");
        month = m.nextInt();
        if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println("30 days");
        }
        else if (month == 2)
        {
            System.out.println("(leapYear) ? 29 : 28");
        }
        else
        {
            System.out.println("31 days");
        }

    }
}
