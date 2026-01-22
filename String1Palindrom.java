import java.util.*;
public class String1Palindrom {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();

        String reverse="";

        for(int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        if(str.equals(reverse)){
            System.out.println("Palindrome string");
        }
        else{
            System.out.println("Not a palindrome string");
        }
        sc.close();
    }
    
}
