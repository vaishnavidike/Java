//check if an array is sorted or not

import java.util.Scanner;

public class sorting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isSorted = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        sc.close(); 

        
        System.out.println(isSorted ? "Array is sorted" : "Array is NOT sorted");
    }
}
    
    

