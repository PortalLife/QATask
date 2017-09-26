package qacinemasystem;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Vector;
import qacinemasystem.Ticket;
/**
 *
 * @author Scott Young
 */
 class CinemaSystem {
    
    // Constructor
     
    public CinemaSystem(){};
           
    // The calendar is created to get the current day of the week, which is used to calcuate the Wednesday discount and formatted. 
    
    Calendar systemCalendar = Calendar.getInstance();   
    SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
    String DayOfTheWeek = dayFormat.format(systemCalendar.getTime());   
    int DayOfWeekInt = systemCalendar.get(Calendar.DAY_OF_WEEK); 
    
    String getDayOfTheWeek(){
    
        return DayOfTheWeek;
    };
    
    // Java's calendar system returns the day of the week as an int, Sunday = 1 Saturday = 7 etc.
    
    int getDayOfTheWeekAsInt(){            
        
      return DayOfWeekInt;        
    }
       
    // A vector is created for the amount of each ticket type bought, and the costs of each ticket vector calcuated for a total price.
    
   int CreateTickets(int standardTic, int OAPTic, int studentTic, int childTic){
   
       int totalPrice = 0;
       
       Vector<Ticket> standardTickets = new Vector(standardTic);
     
       for (int i = 0; i < standardTic; i++){
       
           Ticket standard = new Ticket();           
           
           standardTickets.addElement(standard);
           
             if (DayOfWeekInt == 4)
             standardTickets.get(i).discountTicket();
                    
           totalPrice += standardTickets.get(i).getPrice();
       }
       
       Vector<OAPTicket> OAPTickets = new Vector(OAPTic);
    
          for (int i = 0; i < OAPTic; i++){
       
           OAPTicket oap = new OAPTicket();           
           
           OAPTickets.addElement(oap);
           
             if (DayOfWeekInt == 4)
             OAPTickets.get(i).discountTicket();
                   
           totalPrice += OAPTickets.get(i).getPrice();
       }
       
           Vector<studentTicket> studentTickets = new Vector(studentTic);
    
          for (int i = 0; i < studentTic; i++){
       
           studentTicket student = new studentTicket();           
           
           studentTickets.addElement(student);
            
            if (DayOfWeekInt == 4)
            studentTickets.get(i).discountTicket();
           
           totalPrice += studentTickets.get(i).getPrice();
       }
          
          Vector<childTicket> childTickets = new Vector(childTic);
    
          for (int i = 0; i < childTic; i++){
       
           childTicket child = new childTicket();           
           
           childTickets.addElement(child);
            
            if (DayOfWeekInt == 4)
            childTickets.get(i).discountTicket();
           
           totalPrice += childTickets.get(i).getPrice();
       }
    
          return totalPrice;
   }      
}
