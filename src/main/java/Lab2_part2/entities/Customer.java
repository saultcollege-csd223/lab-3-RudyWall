package Lab2_part2.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author rudyw
 */
@Entity
public class Customer extends Person {

    @Basic
    private String credit_card_number;
    @Basic
    private String cust_id;

    public String getCredit_card_number() {
        return credit_card_number;
    }

    public void setCredit_card_number(String credit_card_number) {
        this.credit_card_number = credit_card_number;
    }

    public String getCust_id() {
        return cust_id;
    }

    public void setCust_id(String cust_id) {
        this.cust_id = cust_id;
    }
    
    @Override
    public String toString(){
        return getFirstname()+" "+getLastname();
    }

}