package loops;

import java.util.Scanner;

public class primenum {
    public void prime(){
        int i,n,m,flag=0;
        Scanner pr = new Scanner(System.in);
        System.out.println("Please enter n value:-");
        n =pr.nextInt();
        m = n/2;
         if(n==0 || n==1){
            System.out.println(n+ " is not a prime number");
        }else{
            for(i=2;i<=m;i++) {
                if (n%i == 0) {
                    System.out.println(n+ " is not a prime number");
                //    flag = 1;
                    break;
                }
            }
                if (flag == 0) {
                    System.out.println(n+ " is a prime number");
                }
         }

    }
}
