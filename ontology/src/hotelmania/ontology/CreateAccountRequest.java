package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: CreateAccountRequest
* @author ontology bean generator
* @version 2014/05/7, 16:41:23
*/
public class CreateAccountRequest implements AgentAction {

   /**
* Protege name: hotel
   */
   private Hotel hotel;
   public void setHotel(Hotel value) { 
    this.hotel=value;
   }
   public Hotel getHotel() {
     return this.hotel;
   }

}
