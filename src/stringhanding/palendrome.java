package stringhanding;

import java.util.Scanner;

public class palendrome {

    public void pldrStr() {
        String s1,s2 = "";
        Scanner word = new Scanner(System.in);
        System.out.println("Enter the string value:-");
        s1 = word.nextLine();
        for(int i=s1.length()-1;i>=0;i--){
            s2 = s2+s1.charAt(i);
        }if(s1.equals(s2)){
            System.out.println("This is palendrome");
        }else{
            System.out.println("This is not palendrome");
        }
    }
}
