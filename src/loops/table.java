package loops;

import java.util.Scanner;

public class table {
    public  void tab(){
        int i;
        Scanner nn = new Scanner(System.in);
        System.out.println("Please enter n value:-");
        int n = nn.nextInt();
        for(i=1;i<=n;i++){
            if(i%3 != 0 && i%5 != 0 && i%7 != 0){
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
