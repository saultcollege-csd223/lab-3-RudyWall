package Lab2.jpademo.com.jpamodeler.kart.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

/**
 * @author rudyw
 */
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Long id;
    @Basic
    private String firstName;
    @Basic
    private String lastName;
    @Embedded
    private Address address;
    @OneToMany
    @JoinTable(name = "CUST_ORDER", joinColumns = @JoinColumn(name = "ORDERID"), inverseJoinColumns = @JoinColumn(name = "CUSTID"))
    private List<ProductOrder> orders;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ProductOrder> getOrders() {
        if (orders == null) {
            orders = new ArrayList<>();
        }
        return orders;
    }

    public void setOrders(List<ProductOrder> orders) {
        this.orders = orders;
    }

    public void addOrder(ProductOrder order) {
        getOrders().add(order);
    }

    public void removeOrder(ProductOrder order) {
        getOrders().remove(order);
    }

}