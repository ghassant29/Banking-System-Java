/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking.system.project;

/**
 *
 * @author GASS
 */
public class Stack {
    Transaction [] transactionLogs;
    int currentNumber;

    public Stack(Transaction[] transactionLogs, int currentNumber) {
        transactionLogs = new Transaction [20];
        this.currentNumber = 0;
    }
    
    
}
