package loops;

public class interchange {
    public void intChange(int a, int b){
        //with using 3rd variable
       /* int c = a;
            a = b;
            b = c;
            */

        //without using 3rd variable
            a = a+b;
            b = a-b;
            a = a-b;
        System.out.println("Please print a value:-" +a);
        System.out.println("Please print b value:-" +b);

    }
}
