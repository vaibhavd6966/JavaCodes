package Polymorphism;
import java.util.*;

class Account {
    //private SBIBankAccount01 sbiBankAccount = new SBIBankAccount01();
//    private SBIBankAccount02 sbiBankAccount1 = new SBIBankAccount02();
//    Scanner sc = new Scanner(System.in);

    public void fundTransfer(int senderAccNo, int recieverAccNo, float amount) {
        String transaction = "Net Banking: Sender Account Number: " + senderAccNo + ", Reciever Account Number: " + recieverAccNo + ", Amount: " + amount;
//        sbiBankAccount.addTransaction(transaction);
//        sbiBankAccount1.addTransaction(transaction);
        System.out.println("Welcome to Net Banking");
        System.out.println(transaction);
        System.out.println("Fund Transfer Successfully..............");
    }

    public void fundTransfer(int chequeNo, float amount, int recieverAccNo) {
        String transaction = "Cheque Banking: Cheque Number: " + chequeNo + ", Reciever Account Number: " + recieverAccNo + ", Amount: " + amount;
//        sbiBankAccount.addTransaction(transaction);
//        sbiBankAccount1.addTransaction(transaction);
        System.out.println("Welcome to Cheque Banking");
        System.out.println(transaction);
        System.out.println("Fund Transfer Successfully with Cheque..............");
    }

    public void fundTransfer(int ddNo, float amount) {
        String transaction = "DD Banking: DD Number: " + ddNo + ", Amount: " + amount;
//        sbiBankAccount.addTransaction(transaction);
//        sbiBankAccount1.addTransaction(transaction);
        System.out.println("Welcome to DD Banking");
        System.out.println(transaction);
        System.out.println("Fund Transfer Successfully with DD..............");
    }

    public void fundTransfer(long mobile, float amount) {
        String transaction = "Mobile Banking: Mobile Number: " + mobile + ", Amount: " + amount;
//        sbiBankAccount.addTransaction(transaction);
//        sbiBankAccount1.addTransaction(transaction);
        System.out.println("Welcome to Mobile Banking");
        System.out.println(transaction);
        System.out.println("Fund Transfer Successfully with Mobile..............");
    }

//    public void printFiveStatement() {
//        sbiBankAccount.miniStatement();
//    }
//    public void printTenStatement() {
//    	sbiBankAccount1.miniStatement();
//    }
}
//
//class SBIBankAccount01 {
//    private String[] transactions = new String[5];
//    private int transactionCount = 0;
//
//    public void addTransaction(String transaction) {
//        if (transactionCount < 5) {
//            transactions[transactionCount] = transaction;
//        } else {
//            for (int i = 1; i < 5; i++) {
//                transactions[i - 1] = transactions[i];
//            }
//            transactions[4] = transaction;
//        }
//        transactionCount++;
//    }
//
//    public void miniStatement() {
//        System.out.println("Mini Statement:");
//        for (int i = 0; i < Math.min(transactionCount, 5); i++) {
//            System.out.println(transactions[i]);
//        }
//    }
//}
//class SBIBankAccount02 {
//    private String[] transactions = new String[10];
//    private int transactionCount = 0;
//
//    public void addTransaction(String transaction) {
//        if (transactionCount < 10) {
//            transactions[transactionCount] = transaction;
//        } else {
//            for (int i = 1; i < 10; i++) {
//                transactions[i - 1] = transactions[i];
//            }
//            transactions[9] = transaction;
//        }
//        transactionCount++;
//    }
//
//    public void miniStatement() {
//        System.out.println("Mini Statement:");
//        for (int i = 0; i < Math.min(transactionCount, 10); i++) {
//            System.out.println(transactions[i]);
//        }
//    }
//}

public class SBIBankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account = new Account();

        String choice = "";
        do {
            System.out.println("Welcome to SBI Bank");
            System.out.println("1. Net Banking");
            System.out.println("2. Cheque Banking");
            System.out.println("3. DD Banking");
            System.out.println("4. Mobile Banking");
//            System.out.println("5. Mini 5 Statement");
//            System.out.println("6. Mini 10 Statement");
            System.out.println("--------------------------");
            System.out.println("Enter your Choice ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Sender Account Number");
                    int senderAccNo = sc.nextInt();
                    System.out.println("Enter Reciever Account Number");
                    int recieverAccNo = sc.nextInt();
                    System.out.println("Enter Amount");
                    float amount = sc.nextFloat();
                    account.fundTransfer(senderAccNo, recieverAccNo, amount);
                    break;
                case 2:
                    System.out.println("Enter Cheque Number");
                    int chequeNo = sc.nextInt();
                    System.out.println("Enter Reciever Account Number");
                    int recieverAccNoCheque = sc.nextInt();
                    System.out.println("Enter Amount");
                    float amountCheque = sc.nextFloat();
                    account.fundTransfer(chequeNo, amountCheque, recieverAccNoCheque);
                    break;
                case 3:
                    System.out.println("Enter DD Number");
                    int ddNo = sc.nextInt();
                    System.out.println("Enter Amount");
                    float amountDD = sc.nextFloat();
                    account.fundTransfer(ddNo, amountDD);
                    break;
                case 4:
                    System.out.println("Enter mobile Number");
                    long mobile = sc.nextLong();
                    System.out.println("Enter Amount");
                    float amountMobile = sc.nextFloat();
                    account.fundTransfer(mobile, amountMobile);
                    break;
//                case 5:
//                    account.printFiveStatement();
//                    break;
//                case 6: 
//                	account.printTenStatement();
                default:
                    break;
            }
            System.out.println("Do you want to continue type.......(yes/YES)");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("Exited the Program.....");
    }
}
