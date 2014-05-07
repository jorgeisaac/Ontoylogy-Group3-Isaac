package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: NotificationAccountInfo
* @author ontology bean generator
* @version 2014/05/7, 16:41:23
*/
public class NotificationAccountInfo implements Predicate {

   /**
* Protege name: account
   */
   private Account account;
   public void setAccount(Account value) { 
    this.account=value;
   }
   public Account getAccount() {
     return this.account;
   }

}
