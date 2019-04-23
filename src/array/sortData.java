package array;

import java.util.Arrays;
import java.util.Collections;

public class sortData {
    public void srtDt(){

       Integer arr[]= new Integer[] {34,2,45,67,23,6,-4};
       Arrays.sort(arr, Collections.reverseOrder());
       System.out.print("Decending Order: ");
       for(int i=0;i<arr.length-1;i++){
           System.out.print(arr[i]+",");
       }System.out.println(arr[arr.length-1]);

       Arrays.sort(arr);
        System.out.print("Ascending Order :");
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+",");
        }System.out.println(arr[arr.length-1]);

    // another way by using swap
        /*int temp;
         int arr[]= {34,2,45,67,23,6};
         Arrays.sort(arr);
        System.out.print("Ascending Order :");
        for(int i=0;i<arr.length-1;i++)
        {
            System.out.print(arr[i]+",");
        }System.out.println(arr[arr.length-1]);

         System.out.print("Decending Order: ");
         for (int i=0;i<arr.length-1;i++)
         {
            for(int j=i+1;j<arr.length;j++)
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
             System.out.print(arr[i]+",");
         }System.out.println(arr[arr.length-1]);*/

    }
}
