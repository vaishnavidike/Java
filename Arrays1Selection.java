import java.util.Arrays;
import java.util.Scanner;

public class Arrays1Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        System.out.println("Array after sorting:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}

    

