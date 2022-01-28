package Lab2.jpademo.com.jpamodeler.kart.model;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

/**
 * @author rudyw
 */
@Embeddable
public class Address {

    @Basic
    private String street;
    @Basic
    private String city;
    @Basic
    private String state;
    @Basic
    private String country;
    @Basic
    private String zipcode;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

}