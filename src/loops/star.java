package loops;

import javax.swing.text.Document;

public class star {

    public void starAll(){
        int i, j;
       /* for(i=1; i<=4; i++)
        {
            for(j=1; j<=6; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }*/

        /*for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 6; j++) {
                if (j == 1 || j == 6 || i == 1 || i == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }*/
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                if(i==1 || i==3 || i==5){
                    System.out.print("*");
                }else if(i==2 && j==1 || i==4 && j==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
