package stringhanding;

public class duplicate {
    public void dupStr() {
        int duplicate = 0;
        String s1 = "This is Testing world and this is testing the websites is";
        String[] s = s1.split("\\s+");
        System.out.println(s.length);
        for (int i = 0; i < s.length; i++) {
            int noOfTimes = 1;
            for(int j=i+1;j<s.length;j++){
                if(s[i].equalsIgnoreCase(s[j])){
                    noOfTimes++;
                }
            }
            System.out.println(s[i]+":"+noOfTimes+" times");
        }
    }
}

