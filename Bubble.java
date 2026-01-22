import java.util.*;
public class Bubble {
    public static void main(String [] args){
        int arr[]={1,3,2,5,7,8};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        // System.out.println(Arrays.toString(arr));

        //using inbuilt function

        // System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
