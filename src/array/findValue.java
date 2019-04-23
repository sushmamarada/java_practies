package array;

public class findValue {
    public void FndVal(){
        int arr[] = {4,54,2,45,657,4545,56,3};
        int largest = arr[0];
        int secondlargest = arr[1];
        int smallest = arr[0];
        int secondsmallest = arr[1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondlargest){
                secondlargest = arr[i];
                System.out.println(secondlargest);
            }
            if(arr[i]<smallest){
                secondsmallest = smallest;
                smallest = arr[i];
            }else if(arr[i]<secondsmallest){
                secondsmallest = arr[i];
            }
        }
        System.out.println("Largest value is: " +largest);
        System.out.println("Second Largest Value is: " +secondlargest);
        System.out.println("Smallest value is: " +smallest);
        System.out.println("Second Smallest Value is: " +secondsmallest);
    }
}
