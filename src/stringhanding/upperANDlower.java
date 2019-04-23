package stringhanding;

public class upperANDlower {

    public void word(){
        String s = "This is testing World";
        String[] words =s.split("\\s+");
        System.out.println(words.length);
        String finalString = "";
        for(int i=0;i<words.length;i++){
            if(i%2 ==0){
                finalString = finalString + words[i].toUpperCase()+" ";
            }
            else{
                finalString = finalString + words[i].toLowerCase()+" ";
            }
        }
        System.out.println(finalString.trim());
    }
}
