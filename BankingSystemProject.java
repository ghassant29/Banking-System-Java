/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system.project;
import java.util.Scanner;

/**
 *
 * @author GASS
 */
public class BankingSystemProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        class BankAccount{
        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

            public BankAccount(int balance, int previousTransaction, String customerName, String customerId) {
                this.balance = balance;
                this.previousTransaction = previousTransaction;
                this.customerName = customerName;
                this.customerId = customerId;
            }
        
        
        public void deposit (int amount){
        if (amount!=0){balance =balance +amount;
        previousTransaction=amount;}}
        
        
        public void withdraw (int amount){
             if (amount!=0){balance =balance -amount;
        previousTransaction=-amount;
        }}
              void getPreviousTransaction(){if(previousTransaction >0){System.out.println("Deposited"+previousTransaction);}
             else if(previousTransaction<0){System.out.println("Withdrawed"+previousTransaction);}
             else{System.out.println("No Transaction Occured");}
             }
              
              void showMenu() {
		
		char option = '\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome " +customerName);
		System.out.println("Your ID is " +customerId);
		System.out.println("\n");
		
		System.out.println("A : Check Your Balance");
		System.out.println("B : Deposit");
		System.out.println("C : Withdraw");
		System.out.println("D : Previous Transaction");
		System.out.println("E : Exit The System");
        
        
    }
    
}}
