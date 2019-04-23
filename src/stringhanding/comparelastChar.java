package stringhanding;

public class comparelastChar {
    public void compare(){
        int i;
        String s1 = "This is Testing World";
        String s2 = "My TesTing World";

        System.out.println(s1.length());
        System.out.println(s2.length());

        System.out.println(s1.substring(s1.length()-7,s1.length()));
        System.out.println(s2.substring(s2.length()-7,s2.length()));
       if(s1.substring(s1.length()-7,s1.length()).equalsIgnoreCase(s2.substring(s2.length()-7,s2.length()))){
           System.out.println("last characters are equal in 2 strings");
       }else {
           System.out.println("false");
       }
    }
}
