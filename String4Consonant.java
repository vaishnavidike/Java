import java.util.*;
public class String4Consonant {
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a String:");

    String str=sc.nextLine();
    int vowels = 0, consonants = 0;

    for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {

                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                   
                   vowels++;
                
                else
                    consonants++;
                
           

            }
        }
            System.out.println("Vowels count: " + vowels);
            System.out.println("Consonants count: " + consonants);

        sc.close();
        
    
}
}
