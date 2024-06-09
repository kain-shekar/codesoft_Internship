
import static java.lang.System.exit;
import java.util.*;


public class AtmInterface extends UserBankAcc {
        
    public static float withdraw(int amount,float userAccBal){
        if(amount >=userAccBal ){
            System.out.println("\n\tTransaction cannot be proceed....\n\t Insufficent Amount\n");
            return userAccBal;
        }
        else if(amount > 2000){
            System.out.println("\n\tTransaction Denied \n\t Amount is more than limit\n");
            return userAccBal;
        }
        else if (amount<= 0) {
            System.out.println("\n\tTransaction Denied \n\t Wrong Transaction\n");
            return 0;
        }

        else{
        userAccBal = userAccBal - amount;
        System.out.println("\t-------------------------------------------------------");
         System.out.println("\tTransaction Completed");
        System.out.println("\tCurrent Bank Balance : "+userAccBal);
        System.out.println("\t-------------------------------------------------------\n");

        }
        return userAccBal;
        
    }


    public static float deposite(int amount , float userAccBal){

        if(amount > 2000){
            System.out.println("\n\tTransaction Denied \n\t Amount is more than limit\n");
            return userAccBal;
        }
        else if (amount<= 0) {
            System.out.println("\n\tTransaction Denied \n\t Wrong Transaction\n");
            return userAccBal;

        }
        else{
        userAccBal = userAccBal + amount;
        System.out.println("\t-------------------------------------------------------");
        System.out.println("\tTransaction Completed");
        System.out.println("\tCurrent Bank Balance : "+userAccBal);
        System.out.println("\t-------------------------------------------------------\n");

        }
        return userAccBal;
        
    }


    public static void accInfo(float userAccBal,String accName,String accNo){
        System.out.println("\t\t--------------------USER INFORMATION-----------------------");
        System.out.println("\t\t-------------------------------------------------------");
        System.out.println("\t\tACCOUNT HOLDER NAME:    "+accName);
        System.out.println("\t\tACCOUNT no.        :    "+accNo);
        System.out.println("\t\tACCOUNT BALANCE    :    "+userAccBal);
        System.out.println("\t\t-------------------------------------------------------");

}
    
   
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int pin,option,wtAmount,dpAmount,flag=3 ;
         UserBankAcc user1 = new UserBankAcc(5000,"shekar","12AC45845");
     //  float userAccBal = user1.accBalance;
        String userName = user1.userName;
        String accNo = user1.accNo;
        System.out.println("\t\t\t-------------------------------------------------------");
        System.out.println("\t\t\t\t\t\tWELLCOME TO ATM");
        System.out.println("\t\t\t-------------------------------------------------------");

     do{
        System.out.print("\n\tEnter your Pin: ");
        pin = sc.nextInt();
        System.out.println("\n");
          if(pin == 4321){
            while(true){
                System.out.println("PRESS 1 : Withdraw.");
                System.out.println("PRESS 2 : Deposite.");
                System.out.println("PRESS 3 : Check Balance.");
                System.out.println("PRESS 4 : Exit.");
                System.out.print("\n\tEnter your option : ");
                option = sc.nextInt();
                
    
                switch (option) {
                    case 1:
                        System.out.print("\nEnter amount to be withdraw :");
                        wtAmount = sc.nextInt();
                        user1.accBalance = withdraw(wtAmount ,user1.accBalance);
                        break;
                    case 2:
                        System.out.print("\nEnter amount to be Deposit :");
                        dpAmount = sc.nextInt();
                        user1.accBalance = deposite(dpAmount,user1.accBalance);
                        break;
                    case 3:
                        System.out.println("\nYour Account information is");
                        accInfo(user1.accBalance, userName ,accNo );
                        break;
                    case 4:
                        exit(0);
                    default:
                        System.out.println("\nChoosen a wrong Option");
                        break;
                }
            }
             }
             else{
                System.out.println("\tWrong Password !! Try Again ....");
                flag--;
                System.out.println("\t\t"+ flag + " more Attempts are left ");
                
                }
        }while(flag >= 1);


    }

    public AtmInterface(float balance, String userName, String accNo) {
        super(balance, userName, accNo);
    }
}
