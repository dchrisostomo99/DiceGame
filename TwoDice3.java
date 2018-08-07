//This is a dice game that will compare the outcome of twi dice and determine a winner
//This will import the Scanner class only to use later when to collect info from user
import java.util.Scanner;

public class TwoDice3
{
    public static void main(String[] args) 
    {
        int response;
        //Constructs a Scanner object to take in user input
        Scanner kbd = new Scanner(System.in);
        // a do loop that will show and compare the outcome of the die and test 
        //to see which one is bigger or if they are the same and declare which die is bigger
        //Then asks user if they want to play again
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
        //while loop that continues to run as long as response equals one
        //If not exit message will appear 
        while(response == 1);
        System.out.println("You will be missed");
    }
    
}
