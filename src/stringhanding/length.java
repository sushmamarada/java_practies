package stringhanding;

public class length {

    public void lengthStr(){
        String s1 = " Hello ";
        String s2 = " World ";
        String s3 = s1.concat(s2);
        String news3= s3.replace(" ","");
        System.out.println(news3.length());
    }
}
