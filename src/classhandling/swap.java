package classhandling;

public class swap {

    public void swapNum(int a,int b)
    {
        //with using 3rd variable
        //Example1:
       /* int c = a + b;  // c= 51    a = 25 b = 26
              a = c - a;  // a= 26    a = 26 b = 25
              b = c - b;  // b= 25*/

       //Example2:
       /* int c = a;
              a = b;
              b = c;*/

       //without using 3rd variable
            a = a+b;
            b = a-b;
            a = b-a;
        System.out.println("display a value:-" + a);
        System.out.println("display b value:-" + b);
    }
}
