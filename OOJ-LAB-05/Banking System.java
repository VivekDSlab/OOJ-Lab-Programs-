import java.util.*;
class Customer {
    int balance = 0;
    int amount;
    void deposit(int dep_amount) {
        balance = balance + dep_amount;
        System.out.println(dep_amount + " rs successfully deposited");
    }
    void withdrawal(int withdrawal_amount) {
        if(withdrawal_amount > balance){
            System.out.println("Insufficient Balance: Unable to withdraw");
        }
        else {
            System.out.println(withdrawal_amount+"Rs Successfully debited");
            balance = balance - withdrawal_amount;
        }
    }
    void display() {
        System.out.println("Balance is Rs:" + balance);
    }
}
public class BankingSystem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Customer[] c = new Customer[15];
        for (int i=0; i < 15 ; i++){
            System.out.println("Do your operatons for Customer "+(i+1));
                c[i] = new Customer();
       
                int option;
                do{
                    System.out.println("\nSelect option:\n1.Deposit \n2.Withdrawal \n3.Balance \n4.Move to next Customer \n--");
                    option = sc.nextInt();
                    sc.nextLine();
                        switch(option){
                            case 1:
                                System.out.println("Enter amount to deposit :");
                                int dep_amount = sc.nextInt();
                                c[i].deposit(dep_amount);
                                break;
                            case 2:
                                System.out.println("Enter amount to withdrawal:");
                                int withdrawal_amount = sc.nextInt();
                                c[i].withdrawal(withdrawal_amount);
                                break;
                            case 3:
                                c[i].display();
                                break;
                            case 4:
                                System.out.println("Moved to next Customer");
                                break;
                            default:
                                System.out.println("Enter valid option!");
                            }
                }while(option != 4);
            }
   
    }
}
