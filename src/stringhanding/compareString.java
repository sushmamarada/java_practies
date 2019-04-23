package stringhanding;

public class compareString {
    public void compareStr(){
        String s1 = " hello ";
        String s2 = "HELLO     ";
        if(s1.trim().equalsIgnoreCase(s2.trim())){
            System.out.println("Both strings are same");
        }else{
            System.out.println("Not Same");
        }
    }
}
