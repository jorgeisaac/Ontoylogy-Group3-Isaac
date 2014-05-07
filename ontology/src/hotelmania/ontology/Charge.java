package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: Charge
* @author ontology bean generator
* @version 2014/05/7, 16:41:23
*/
public class Charge implements Concept {

   /**
* Protege name: ammount
   */
   private float ammount;
   public void setAmmount(float value) { 
    this.ammount=value;
   }
   public float getAmmount() {
     return this.ammount;
   }

}
