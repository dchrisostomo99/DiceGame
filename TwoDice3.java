import java.util.Scanner;

public class TwoDice3
{
    public static void main(String[] args) 
    {
        int response;
        Scanner kbd = new Scanner(System.in);
        do
        {
            Die Die1 = new Die();    
            Die Die2 = new Die();
        
            int value1 = Die1.getValue();
            int value2 = Die2.getValue();
           
        
            
            System.out.println("");
            System.out.println("First Die roll is: " + value1);
            System.out.println("");
            System.out.println("First Die roll is: " + value2);


            if(value1 > value2) {
                System.out.println("");
                System.out.println("The first die is the winner!");
            }        
            else 
                if(value2 > value1) {
                System.out.println("");
                System.out.println("The second die is the winner!"); 
            }   
                else {
                System.out.println("");
                System.out.println("We have a tie!");
            }  
            
            System.out.print("Type 1 to play again type any other to quit");
            response = kbd.nextInt();
        }

        while(response == 1);
        System.out.println("You will be missed");
    }
    
}
