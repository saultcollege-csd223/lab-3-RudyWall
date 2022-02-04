/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2_part2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import Lab2_part2.entities.Employee;
import Lab2_part2.entities.Customer;
import Lab2_part2.entities.Person;
import java.util.List;

/**
 *
 * @author rudyw
 */
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf=null;
        EntityManager em=null;
        
        try{
            emf=Persistence.createEntityManagerFactory("DEFAULT_PU");
            em=emf.createEntityManager();
            Logger.getLogger(Main.class.getName()).log(Level.INFO, "Entity Manager created ("+emf+")");
            em.getTransaction().begin();
            
            Employee elon=new Employee();
            elon.setFirstname("Elon");
            elon.setLastname("Musk");
            elon.setSalary("100000000");
            
            Customer rudy=new Customer();
            rudy.setFirstname("Rudy");
            rudy.setLastname("Walling");
            rudy.setCredit_card_number("123-456-789");
            rudy.setSIN("456");
            
            Person person=new Person();
            person.setFirstname("John");
            person.setLastname("Doe");
            person.setSIN("123");
            
            em.persist(elon);
            em.persist(rudy);
            em.persist(person);
            
            
            em.getTransaction().commit();
                     
            List<Person> listOfPersons = em.createQuery("SELECT c FROM Person c").getResultList();
            List<Customer> listOfCustomers = em.createQuery("SELECT c FROM Customer c").getResultList();
            List<Employee> listOfEmployees = em.createQuery("SELECT c FROM Employee c").getResultList();
            
            
            System.out.println("List of People");         
            for(Person p:listOfPersons){
                System.out.println(p);
            }
            
            System.out.println("List of Employees");
            for(Employee emp:listOfEmployees){
                System.out.println(emp);
            }
            
            System.out.println("List of Customers");
            for(Customer customer:listOfCustomers){
                System.out.println(customer);
            }
                      
        }catch(Exception e){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }finally{
            if(emf!=null)
                emf.close();
//            if(em!=null)
//                em.close();
        }
    }

}
