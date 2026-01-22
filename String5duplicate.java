import java.util.*;
public class String5duplicate {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        // int a=sc.nextInt();
        // sc.nextInt();////Empty space
        
        System.out.println("Enter one string:");
        String str=sc.nextLine();

        String remove="";

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(remove.indexOf(ch)==-1){
                remove+=ch;
            }

        }
        System.out.println("After Removing Duplicates:"+remove);
        sc.close();
    }
    
    
}
