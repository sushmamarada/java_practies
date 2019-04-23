package conditionhand;

import java.util.Scanner;

public class divisibleValue {

    public void div(){
        //int x = 49;
        int x;
        Scanner a = new Scanner(System.in);
        System.out.println("Please enter the x: -");
        x = a.nextInt();
        if((x % 5 == 0) && (x % 11 == 0))
        {
            System.out.println("It is divisible by both 5 & 11");
        }
        else if((x % 5 == 0) || (x % 11 == 0))
        {
            System.out.println("It is divisible by either 5 or 11");
        }
        else
        {
            System.out.println("It is not divisible by any number 5 or 11");
        }
    }
}
