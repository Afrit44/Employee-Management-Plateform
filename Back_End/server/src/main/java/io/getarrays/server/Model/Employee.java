/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.getarrays.server.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employees")
/**
 *
 * @author RedJohn
 */
public class Employee {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id; 
    
    @Column(name="first_name")
    private String firstName;
       
    @Column(name="last_name")
    private String lastName; 

    @Column(name="email_id")
    private String emailId; 
    
    public Employee(){
        
    }
    
    public Employee(String firstName, String lastName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
    }
    
    
    public long getId(){
        return id; 
    }
    public void setId(long id){
        this.id=id; 
    }
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName; 
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmailId(){
        return this.emailId;
    }
    public void setEmailId(String emailId){
        this.emailId = emailId;
    }
}
