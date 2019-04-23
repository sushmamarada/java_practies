package stringhanding;

public class commonString {

    public void commonStr(){
        String s1 = "This is Testing This is Hello";
        String s2 = "This";
        int count=0;
        String[] words =s1.split("\\s+");
        System.out.println("Number of words count in s1:" +words.length);
        for(int i=0; i<words.length;i++){
            if(words[i].equals(s2)){
                ++count;
                System.out.println("Common String is:" +words[i]);
            }
        }
        System.out.println("Common number of strings count is:" +count);
    }
}
