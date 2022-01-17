/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.q6;

/**
 *
 * @author rudyw
 */
public class Person {

    private String firstname;
    private String lastname;
    private int SIN;

    public Person() {
        firstname = "first";
        lastname = "last";
        SIN = 123;

    }
    Person(String f, String l, int s){
        firstname = f;
        lastname = l;
        SIN = s;
    }
    @Override
    public String toString(){
        return "\nName : "+firstname+" "+lastname+"\nSIN : "+SIN;
    }
}
