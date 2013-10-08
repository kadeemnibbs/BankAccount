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
public class BankAccountTester {

    static ArrayList<BankAccount> masterlist = new ArrayList<BankAccount>();
    BankAccount[] accountlist;
    static String accountString = "The current accounts registered with Shady Operations Bank are: ";
    static String sortingString = "Currently sorting accounts by balance, please be patient...";
    static BankAccount Sasha = new BankAccount("Sasha", 147);
    static BankAccount Dilip = new BankAccount("Dilip", 476);
    static BankAccount Fiona = new BankAccount("Fiona", 8576);
    static BankAccount Alard = new BankAccount("Alard", 1);
    static BankAccount Jeffrey = new BankAccount("Jeffrey", 73);
    static BankAccount Kris = new BankAccount("Kris", 0);

    public static void initializeMasterList() {
        masterlist.add(Sasha);
        masterlist.add(Dilip);
        masterlist.add(Fiona);
        masterlist.add(Alard);
        masterlist.add(Jeffrey);
        masterlist.add(Kris);

    }

    public static void sortMasterList() {
        Collections.sort(masterlist);

    }

    public static void run() {
        initializeMasterList();

        System.out.println(accountString);
        for (int i = 0; i < masterlist.size(); i++) {
            System.out.println(masterlist.get(i).getName() + ", $" + masterlist.get(i).getBalance());
        }
        System.out.println();
        
        System.out.println(sortingString);
        
        System.out.println();
        sortMasterList();

        System.out.println(accountString);
        for (int i = 0; i < masterlist.size(); i++) {
            System.out.println(masterlist.get(i).getName() + ", $" + masterlist.get(i).getBalance());
        }
    }

    public static void main(String[] args) {
        new BankAccountTester().run();
    }
}
