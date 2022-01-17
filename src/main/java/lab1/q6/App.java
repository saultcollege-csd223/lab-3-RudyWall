/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.q6;

import java.util.Scanner;

/**
 *
 * @author rudyw
 */
public class App {
    private final int numPeople = 100;
    private int peopleIndex = 1;
    private Person[] people= new Person[numPeople];
    private String menu = ""
            + "1. Add Person\n"
            + "2. List People\n"
            + "3. Delete Person\n"
            + "99. quit";
    
    private Scanner input = new Scanner(System.in);
    public void run(){
    boolean done = false;
    while (!done) {
            System.out.println(menu);
            System.out.println("\nEnter option: ");
            String myinput = input.nextLine();
            switch (myinput) {
                case "1":
                    addPerson();
                    break;
                case "2":
                    listPerson();
                    break;
                case "3":
                    deletePerson();
                    break;
                case "99":
                    done = true;
                    break;

                default:
                    System.out.println("Thats not an option. \nPress ENTER to Continue.");
                    input.nextLine();
            }

        }
    
}

public void addPerson(){
    System.out.println("Creating new person...\nEnter first name: ");
            String f= input.nextLine();
            System.out.println("Enter last name: ");
            String l= input.nextLine();
            System.out.println("Enter SSN: ");
            int s= Integer.parseInt(input.nextLine());
            
            System.out.println("creating person account for " + f + " " + l + " SIN " + s);
            people[peopleIndex]= new Person(f, l, s);
            peopleIndex+=1;
}
public void listPerson(){
    System.out.println("List of all people:\n");
        for (int i = 1; i<people.length;i++)
            if(people[i] != null)
                System.out.println("Person Number " + i + "\n" + people[i]+ "\n");
            else
                break;
        System.out.println("Press ENTER to return to menu.");
        input.nextLine();
}
public void deletePerson(){
    for (int i = 1; i<people.length;i++)
            if(people[i] != null)
                System.out.println("Person Number " + i + "\n" + people[i]+ "\n");
            else
                break;
    System.out.println("Enter person number to delete: ");
        int personnumber = Integer.parseInt(input.nextLine());
        people[personnumber]= null;
        peopleIndex-=1;
        for (int i = personnumber+1; i < people.length; i++){
            people[i-1]=people[i];
        }
}}