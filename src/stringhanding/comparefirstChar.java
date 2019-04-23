package stringhanding;

public class comparefirstChar {
    String s1 = "Hello";
    String s2 = "helmno";

    public void firstChar(){
        System.out.println(s1.substring(0,2));
        System.out.println(s2.substring(0,2));
        if(s1.substring(0,2).equalsIgnoreCase(s2.substring(0,2))){
            System.out.println("starting 3 characters are equal in 2 strings");
        }else{
            System.out.println("Not equal");
        }
    }
}
