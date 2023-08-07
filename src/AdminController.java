import java.util.*;
public class AdminController {
    //some attributes related to service , discounts decorator , user
    public void addServiceProvider(){
        // u should
    }
    public void addDiscounts(){

    }
    public void listUserTransactions(User user,int adminChoice,ITransaction transaction){

        if(adminChoice == 1){
            //toDO show User payment transactions
            transaction.getUser();
            transaction.showTransactionDetails(user,new InternetPaymentService());
            transaction.showTransactionDetails(user,new MobileRechargeService());
            transaction.showTransactionDetails(user,new LandLineService());
        }
        else if(adminChoice == 2){
            //toDO show add to wallet from users
            transaction.getUser();
            System.out.println("UserName: "+user.getUsername());
            System.out.println("Wallet Balance Transactions: "+user.getWalletBalance());
        }
        else if(adminChoice==3){
            //toDo Refund (show refunds that is requested by user)
            transaction.getUser();
            transaction.showTransactionDetails(user,new InternetPaymentService());
            transaction.showTransactionDetails(user,new MobileRechargeService());
            transaction.showTransactionDetails(user,new LandLineService());
        }
    }
    public void listRefundRequests(){

    }

    public void recieveRefundRequest(User user ,IService service,String adminChoice){
        if (user.getTransactionStatus()) {

            System.out.println("Do you want to accept request or no ? y(yes) or n(no)");
            if (adminChoice == "YES" || adminChoice == "yes" || adminChoice == "y") {
                double service_cost = service.getCost();
                System.out.println("Refund Request is Succeeded!");
                user.addToWalletBalance(service_cost);
                //System.out.println("Your new balance is " + user.getWalletBalance());
            } else if (adminChoice == "NO" || adminChoice == "no" || adminChoice == "n") {
                System.out.println("Refund Request is Refused!");
            }
        }
        else
        {
            System.out.println("user didn't make any payment!!");
        }
    }


}
