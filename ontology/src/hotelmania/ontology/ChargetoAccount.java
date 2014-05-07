package hotelmania.ontology;


import jade.content.*;
import jade.util.leap.*;
import jade.core.*;

/**
* Protege name: ChargetoAccount
* @author ontology bean generator
* @version 2014/05/7, 16:41:23
*/
public class ChargetoAccount implements AgentAction {

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

   /**
* Protege name: charge_day
   */
   private int charge_day;
   public void setCharge_day(int value) { 
    this.charge_day=value;
   }
   public int getCharge_day() {
     return this.charge_day;
   }

   /**
* Protege name: charge
   */
   private Charge charge;
   public void setCharge(Charge value) { 
    this.charge=value;
   }
   public Charge getCharge() {
     return this.charge;
   }

}
