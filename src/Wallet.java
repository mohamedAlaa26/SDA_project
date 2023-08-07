//import java.util.Scanner;
//
//public class Wallet implements IPayment {
//    private double walletBalance;
//    private String username;
//
//    public Wallet(double walletBalance, String username){
//        this.walletBalance = walletBalance;
//        this.username = username;
//    }
//
//    public void setWalletBalance(int walletBalance){
//        this.walletBalance = walletBalance;
//    }
//
//    public double getWalletBalance(){
//        return walletBalance;
//    }
//
//    public void setUsername(int walletID){
//        this.username = username;
//    }
//
//    public String getUsername(){
//        return username;
//    }
//
//
//
//
//    @Override
//    public void pay(User user) {
//
//
//        System.out.println("Please enter your wallet balance");
//        double walletBalance = sc.nextDouble();
//
//
//       // check if walletBalance >= cost of service
//        if(walletBalance >= costOfService){
//            System.out.println("Payment successful");
//            walletBalance = walletBalance - costOfService;
//            System.out.println("Your new wallet balance is: " + walletBalance);
//        }
//        else{
//            System.out.println("Funds not enough !");
//        }
//
//    }
//}
