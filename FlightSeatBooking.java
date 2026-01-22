import java.util.*;
public class FlightSeatBooking {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        boolean flight[][]={new boolean[3],
                            new boolean[4],
                            new boolean[5]};

    boolean flag=true;
   

    
    System.out.println("Welcome to fligth seat booking");
    while(flag){
     for(int i=0;i<flight.length;i++){
        System.out.print(i==0?"Business(1-"+flight[i].length+"):":
        (i==1?"First (1-"+flight[i].length+"):":"economy(1-"+flight[i].length+"))"));

        for(int j=0;j<flight[i].length;j++){
            System.out.print("["+(flight[i][j]?"X":" ")+"]");

        }
        System.out.println();

     }

     //2. book flight
     System.out.println("1.Buisness\n2.First\n3.Economy\n4.Exit");
     int row=sc.nextInt();
     if(row==4){
        System.out.println("Thank you........");
        return;
     }

     if(row<1||row>4){
        System.out.println("Invalid row no......");
        continue;   
      }

     System.out.println("Enter seat no between(1-"+flight[row-1].length+")");
     int col=sc.nextInt();

    if (col < 1 || col > flight[row - 1].length) {
                System.out.println("Invalid seat number!");
                continue;
            }

            if (flight[row - 1][col - 1]) {
                System.out.println("Seat already booked!");
            } else {
                flight[row - 1][col - 1] = true;
                System.out.println("Seat booked successfully!");
            }
      sc.close();

}
}
}
