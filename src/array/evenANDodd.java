package array;

public class evenANDodd {
    public void evenRodd(){
        int arr[] = {34,1,343,45,22,33,44};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 == 0){
                System.out.println("Even value is: " +arr[i]);
            }else if(arr[i]%2 != 0){
                System.out.println("Odd value is: " +arr[i]);
            }else {
                System.out.println("Not a even & odd value: " +arr[i]);
            }
        }
    }
}
