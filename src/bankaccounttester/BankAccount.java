/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccounttester;
import java.util.*;
      
/**
 *
 * @author kanibbs
 */
public class BankAccount implements Comparable<BankAccount>{

    /**
     * @param args the command line arguments
     */
    
    String name;
    int balance;

    
   
    
    
    public BankAccount(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }
    
    
    
    
    public int compareTo(BankAccount acc) {
        if (this.balance > acc.balance) {
            return 1;
            
        }
        if (this.balance == acc.balance) {
            return 0;
        }
        else return -1;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getBalance() {
        return this.balance;
    }
    
    public String toString() {
        return name + ", $" + balance;
    }
}
