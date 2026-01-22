//Intermediate arrays queution
//remove the duplicate element
import java.util.*;
public class array1Remove{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the size for array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter the values for arrays:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp[]=new int[arr.length];
        int uniquecount=0;

        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=0;j<uniquecount;j++){
                if(arr[i]==temp[j]){
                    flag=true;
                    break;
                }

            }
            if(!flag){
                    temp[uniquecount++]=arr[i];
                }

        }
        // System.out.println("Array after removing duplicates:");
        // for (int i = 0; i < uniquecount; i++) {
        //     System.out.print(temp[i] + " ");
        // }

        
        int remove[]=Arrays.copyOf(temp,uniquecount);
        System.out.println(Arrays.toString(remove));

        //inbuild function

        int remove1[]=Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(remove1));

        sc.close();
        
    }
}
