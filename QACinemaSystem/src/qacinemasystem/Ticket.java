package qacinemasystem;
/**
 *
 * @author Scott Young
 */

// Main ticket class
class Ticket { 
    
    int price;
    
     int getPrice(){
    
        return price;
    }    
    
    // This method is called during the ticket calucation to discount the tickets.
    
    void discountTicket(){      
        price -= 2;
    }
        
    public Ticket(){    
        price = 8;
    }    
}

// Creating sub classes of ticket with the main ticket class being the "Standard" type.
class studentTicket extends Ticket {
 
    public studentTicket(){   
        price = 6;
    }   
}
 
class OAPTicket extends Ticket {

    public OAPTicket(){   
        price = 6;
    }  
}

class childTicket extends Ticket {

    public childTicket(){
        price = 4;
    }  
}
