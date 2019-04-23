package stringhanding;

import java.util.Scanner;

public class removeSpace {
    public void remvSpace(){
        String s1,s2;
        Scanner word = new Scanner(System.in);
        System.out.print("Enter the s1 data:-");
        s1 = word.nextLine();
        s2 = s1.replace(" ","");
        System.out.println(s2);
        System.out.println("s1 length with spaces: " +s1.length());
        System.out.println("s2 length without spaces: " +s2.length());
        System.out.println(s1.length()-s2.length());
    }
}
