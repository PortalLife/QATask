package qacinemasystem;
import java.util.Scanner;
import qacinemasystem.CinemaSystem;

/**
 *
 * @author Scott Young
 */
public class QACinemaSystem { 

    public static void main(String[] args) {
        
        // Creating the system object. The main method is mainly used for the I/O of this application.
        
        CinemaSystem mainSystem = new CinemaSystem();
        Scanner userInput = new Scanner(System.in);             
        // Printing out relevant info to the user using I/O

         System.out.println("Welcome to QA Cinema! Today is " + mainSystem.getDayOfTheWeek() + "And we are currently showing The Matrix!" );
         
         if (mainSystem.getDayOfTheWeekAsInt() == 4)
         System.out.println("We offer a £2 discount today on all tickets today!");
              
          System.out.println("How many standard tickets would you like to purchase?");
          int standardTickets = userInput.nextInt();
                  
          System.out.println("How many OAP tickets would you like to purchase?");
          int OAPTickets = userInput.nextInt();
          
          System.out.println("How many Student tickets would you like to purchase?");
          int StudentTickets = userInput.nextInt();
          
          System.out.println("How many Child tickets would you like to purchase?");
          int childTickets = userInput.nextInt();
          
          // Displaying the total price
          int TotalPrice =+ mainSystem.CreateTickets(standardTickets, OAPTickets, StudentTickets, childTickets);
          
           System.out.println("The total price is £" + TotalPrice);
                                                                 
    }
}
    
