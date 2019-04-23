package conditionhand;

import java.util.Scanner;

public class grades {

    public void grade(){
        int p,c,b,m,co,total,per;
        Scanner s = new Scanner(System.in);
        System.out.print("Please enter Marks of Physics: -");
        p = s.nextInt();
        System.out.print("Please enter Marks of Chemistry: -");
        c = s.nextInt();
        System.out.print("Please enter Marks of Biology: -");
        b = s.nextInt();
        System.out.print("Please enter Marks of Mathmetics: -");
        m = s.nextInt();
        System.out.print("Please enter Marks of Computer: -");
        co = s.nextInt();
        total = (p + c + b + m + co);
        per = total / 5;
        System.out.println("Percentage:" +per);
        if (per >=90)
        {
            System.out.println("Grade A");
        }
        else if (per >=80)
        {
            System.out.println("Grade B");
        }
        else if (per >=70)
        {
            System.out.println("Grade C");
        }
        else  if (per >=60)
        {
            System.out.println("Grade D");
        }
        else  if (per >=40)
        {
            System.out.println("Grade E");
        }
        else if (per < 40)
        {
            System.out.println("Grade F");
        }

    }

}
