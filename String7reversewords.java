import java.util.*;
public class String7reversewords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter one string");
        String str=sc.nextLine();
        String count[]=str.split(" ");
        System.out.println("Reverse words");
      
        for (String word: count) {
            System.out.print(new StringBuilder(word).reverse()+" ");
        }
        sc.close();
    }
}
