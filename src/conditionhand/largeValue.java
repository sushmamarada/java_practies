package conditionhand;

import java.util.Scanner;

public class largeValue {

    public void large(){
        /*int x = 10;
        int y = 5;
        int z =20;*/
        int x,y,z;
            Scanner s = new Scanner(System.in);
            System.out.print("Please enter first num: -");
            x = s.nextInt();
            System.out.print("Please enter second num: -");
            y = s.nextInt();
            System.out.print("Please enter third num: -");
            z = s.nextInt();

            if(x>y && x>z)
            {
                System.out.println("largest number is x:" +x);
            }
            else if(y>z)
            {
                System.out.println("largest number is y:" +y);
            }
            else
            {
                System.out.println("largest number is z:" +z);
            }

    }
}
