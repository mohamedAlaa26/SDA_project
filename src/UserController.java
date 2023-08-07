import java.util.Objects;
import java.util.*;
public class UserController {

    private int size = 10;
    private User[] users = new User[size];
    private ServiceEntity service = new ServiceEntity();

    public UserController()
    {
        for (int i = 0; i < size; i++) {
            users[i]=new User();
        }
    }
//    public void setUsers () {
//        for (int i = 0; i < size; i++) {
//            users[i] = new User();
//        }
//    }

//    public void setUserName(String username){
//        user.setUsername(username);
//    }
//
//    public String getUsername(){
//        return user.getUsername();
//    }
//   public void setPassword(String password) {
//        user.setPassword(password);
//    }
//
//    public String getPassword() {
//        return user.getPassword();
//    }
//
//
//    public void setEmail(String email) {
//        user.setEmail(email);
//    }
//
//    public String getEmail() {
//        return user.getEmail();
//    }


    public boolean checkUserName_exists(String username) {
        for (int i = 0; i < size; i++) {
            if (users[i].getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }
    public boolean checkUserPass_exists(String username,String pass) {
        for (int i = 0; i < size; i++) {
            if (users[i].getPassword().equals(pass) && users[i].getUsername().equals(username)){
                return true;
            }
        }
        return false;
    }

    public void addUser(User user) {
        if (checkUserName_exists(user.getUsername())) {
            throw new RuntimeException("User already exists"); // put it in Screen
        } else {
            for (int i = 0; i < size; i++) {
                if (Objects.equals(users[i].getUsername(), "DNE")) {
                    users[i] = user;
                    break;
                }
            }
        }
     }

   public void signUp(User user) {
       // make setters for users
       if (checkUserName_exists(user.getUsername())) {
           throw new RuntimeException("User already exists");
       }
       else{
           addUser(user);
           System.out.println("User added successfully");
       }
   }
   public void signIn(User user) {
       // check if user exists or not
       if (checkUserName_exists(user.getUsername()) && checkUserPass_exists(user.getUsername(),user.getPassword()) ){
            Screen.WelcomingUser(user);
       }else {
           if (checkUserName_exists(user.getUsername()) && !checkUserPass_exists(user.getUsername(),user.getPassword())) {
               throw new RuntimeException("Wrong Password");
           } else
               throw new RuntimeException("User not Found!");
       }
   }
    public boolean searchForService(String SearchItem){
        //create a char array
        //compare between what's inside array and users's query
        int arr_size=4;
        boolean isMatched = false;
        String[] MatchArr=new String[arr_size];
        //String[] Services = {"Mobile recharge services","Internet Payment services","Landline services","Donations"};
        //.out.println("Search for Service: "); // view
        // Creating array of string length
        // using length() method
        char[] ch = new char[SearchItem.length()];
        // Copying character by character into array
        // using for each loop
        for (int i = 0; i < SearchItem.length(); i++) { // ch[i] i-> length Search item
            ch[i] = SearchItem.charAt(i);
        }
        //size must be of services array
        for(int k = 0; k < SearchItem.length() && ch[k] != '\0' && !isMatched ; k++) {
            for (int i = 0; i < arr_size ; i++) { // no. of strings
                for (int j = 0; j < service.getService()[i].length(); j++) { // no. chr

                    if (ch[k]==service.getService()[i].charAt(j) || Character.toUpperCase(ch[k])==service.getService()[i].charAt(j)) { //ch[i] -> length of services
                        //service.setMatchService(service.getService()[i]);
                        MatchArr[i] = service.getService()[i];
                        isMatched = true;
                        break;
                    }
//                    else if(ch[k]!=service.getService()[i].charAt(j) && Character.toUpperCase(ch[k])!=service.getService()[i].charAt(j) )
//                        throw new RuntimeException("Result Not Found!");
                }
            }
        }
        for (int i=0;i<arr_size;i++) {
            if(MatchArr[i]!=null)
                System.out.println(MatchArr[i]);
        }
        //screen.updateSearch(service);
        return isMatched;
    }
    public void payForService(User user,IService service,int paymentChoice){
        //Pay for service
        IPayment payment;
        if(paymentChoice == 1){
            payment = new CreditCardProxy();
            payment.pay(user,service);
        }else if(paymentChoice==2){
            payment = new Cash();
            payment.pay(user,service);
        }else if(paymentChoice==3) {


        }

//        service.getCost();
    }
//    public void sendRefundRequest(User user, IService service){
////        AdminController admincontroller = new AdminController();
////        admincontroller.recieveRefundRequest(user,service);
////        System.out.println("Request sent successfully");
//
//    }
    public void addFundsToWallet(User user,double Balance){
        // update wallet with funds
        CreditCardProxy payment = new CreditCardProxy();
        payment.addByCreditCard(user,Balance);
    }
    public void checkDiscounts(){
        //you should check discounts here , and check new discounts added by admin
        // you may connect to admin controller
    }
    void print_users() {
        for (int i = 0; i < size; i++) {
            System.out.println("user: " + users[i].getUsername() + "  ");
            System.out.println("user email: " + users[i].getEmail() + "  ");
            System.out.println("user password: " + users[i].getPassword() + "  ");
            System.out.println("user Wallet Balance: " + users[i].getWalletBalance() + "  ");
            System.out.println("=============================");

        }
        //System.out.println(userCount);
    }




}
