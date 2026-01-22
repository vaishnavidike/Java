import java.util.*;
public class String6countword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter on sentence:");
        String str=sc.nextLine();
        String count[]=str.split(" ");
        System.out.println(Arrays.toString(count));
        System.out.println("Count of words:"+count.length);
        sc.close();
    }
    
}
