package array;

public class duplicateValue {
    public void dupValue(){
        Object arr[]= new Object[6];

        arr[0] = new Integer(34);
        arr[1] = new String("abc");
        arr[2] = new Integer(12);
        arr[3] = new String("xyz");
        arr[4] = new String("abc");
        arr[5] = new String("abc");
        for(int i=0;i<arr.length;i++){
            int count = 1;

            for(int j=i+1;j<arr.length;j++){

                if(arr[i].equals(arr[j])){

                    count++;
                }
            }System.out.println(arr[i]+":"+count+" "+"times");
        }
    }
}
