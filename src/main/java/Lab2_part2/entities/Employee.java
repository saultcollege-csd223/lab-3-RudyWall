package Lab2_part2.entities;

import javax.persistence.Basic;
import javax.persistence.Entity;

/**
 * @author rudyw
 */
@Entity
public class Employee extends Person {

    @Basic
    private String title;
    @Basic
    private String salary;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return getFirstname()+" "+getLastname();
    }
}