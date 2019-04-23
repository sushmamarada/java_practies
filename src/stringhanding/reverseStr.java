package stringhanding;

public class reverseStr {

    public void revStr(){
        String s = "hello";
        System.out.println(s.length());
        for(int i=s.length()-1;i>-1;i--){
            System.out.print(s.charAt(i));
        }
    }
}
