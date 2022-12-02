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
     public boolean isEmpty(){
            return currentNumber == 0;
        }
       public boolean isFull(){
            return currentNumber == transactionLogs.length;
        }
        public int Size(){
            return currentNumber;
        }
        public Transaction Pop(){
            this.currentNumber--;
             Transaction temp = transactionLogs[currentNumber];
            transactionLogs[currentNumber] = null;
            return temp;
        }
         public void expand(){
            if(isFull()) {
                int size = 20 + transactionLogs.length;
                Transaction [] newarray = new Transaction [size];
                this.transactionLogs = reverseStack(transactionLogs);
                //store currentNb in a temp
                int temp = this.currentNumber;
                for(int i = 0; i<transactionLogs.length;i++){
                    newarray[i] = Pop();
                }
                transactionLogs = newarray;
                currentNumber = temp;
            }

        }
         public void Push(Transaction transaction){
            if(isFull()){
                expand();
            }
            transactionLogs[currentNumber] = transaction;
            currentNumber++;
        }
          public void display(){
           
            int size = currentNumber;
            Transaction [] tempStack = new Transaction [size];
            
            for(int i = 0; i < size; i++){
                tempStack[i] = this.Pop();
            }
            
            Transaction temp;
            int nbOfElements = tempStack.length-1;
            for (int j = 0; j < tempStack.length ; j++){
                //Pop:
                temp = tempStack[nbOfElements];
                tempStack[nbOfElements] = null;
                nbOfElements--;
                //Print:
                System.out.println("Element at ["+j+"] = "+temp.toString());
                //Push:
                this.Push(temp);
            }
        }
    
}
