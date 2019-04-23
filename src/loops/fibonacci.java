package loops;

public class fibonacci {

    //using for loop
    public void fibNum(int a, int b, int n){

        for(int i=1;i<=n;i++){
            System.out.println(a);
            int sum = a+b;
                a = b;
                b = sum;

        }

    }
}
