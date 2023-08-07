import java.util.Scanner;
public class Application {
    static Scanner input;
    public static UserController controller = new UserController();
    public static AdminController adminController = new AdminController();
    //public static User user = new User();//!!!!!!!!!!!!!!!!!!
    static boolean check = false,check2 = false,check3 = false,check4 = false;

    //public Screen view = new Screen();
    public  static User user;
//    public static void main(String[] args) {
//        runApplication();
//    }
    public static void runApplication(){
        int choice;
        do {
            //user = new User();
            if(check3 == true)
                System.exit(0);
            if(check4 == true)
                System.exit(0);
            Screen.mainMenu();
            System.out.println();
            choice = input.nextInt();
            System.out.println();
            switch (choice) {
                case 1: {
                    try{
                        Screen.registerMenu();
                        registerMethod(); // first function
                        if(check == true)
                            System.exit(0);
                    }catch(RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    //should make adminFunction and call it here
                    adminFunctions();
                    break;
                }
                case 3: {
                    System.out.println("Exited Successfully");
                    check4 = true;
                    break;
                }
            }
        }while(choice!=3);
    }
    public static void registerMethod(){
        int Choices;
        do {
            //user = new User();
            System.out.println();
            Choices = input.nextInt();
            System.out.println();
            switch (Choices) {
                case 1: {
                    try{
                        if(user == null) {
                            throw new RuntimeException("Please Sign up First!, Press 2 to Sign up:");
                        }
                        System.out.println("username: ");
                        user.setUsername(input.next());
                        System.out.println("password: ");
                        user.setPassword(input.next());
                        controller.signIn(user);
                        userFunctions(); // second function
                        if(check2==true)
                            System.exit(0);
                    }catch(RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 2: {
                    try{
                        user = new User();
                        System.out.println("username: ");
                        user.setUsername(input.next());
                        System.out.println("password: ");
                        user.setPassword(input.next());
                        System.out.println("Email: ");
                        user.setEmail(input.next());
                        controller.signUp(user);
                        Screen.registerMenu();
                    }catch(RuntimeException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }
                case 3: {
                    System.out.println("Exited Successfully");
                    check = true;
                    break;
                }
            }
        }while(Choices!=3);
    }
    public static void userFunctions(){
        int Choice;
        do {
            Screen.userMenu();
            System.out.println();
            Choice = input.nextInt();
            System.out.println();
            switch (Choice) {
                case 1: {
                    try{
                        String SearchItem;
                        System.out.println("Search for Service: "); // view
                        Scanner Sc = new Scanner(System.in);
                        SearchItem = Sc.nextLine();
                        controller.searchForService(SearchItem);
                    }catch(RuntimeException e){
                        System.out.println(e.getMessage());
                    }

                    break;
                }
                case 2: {
                    //Pay for service
                    Screen.serviceMenu();
                    System.out.println("Enter your Service Choice: ");
                    int serviceChoice = input.nextInt();
                    Screen.paymentFormMenu();
                    System.out.println("Enter your payment Choice: ");
                    int paymentChoice = input.nextInt();
                    if(serviceChoice == 1)
                        controller.payForService(user,new MobileRechargeService(),paymentChoice);
                    else if(serviceChoice == 2)
                        controller.payForService(user,new InternetPaymentService(),paymentChoice);
                    else if(serviceChoice == 3)
                        controller.payForService(user,new LandLineService(),paymentChoice);
                    else if(serviceChoice ==4)
                        controller.payForService(user,new DonationService(),paymentChoice);
                    break;
                }
                case 3: {
                    //request refund
                    Screen.serviceMenu();
                    System.out.println("Enter your choosed service to refund Choice: ");
                    int serviceChoice1 = input.nextInt();
                    if(serviceChoice1 == 1&& user.getTransactionStatus())
                        user.setWalletBalance(user.getWalletBalance()+new MobileRechargeService().getCost());
                    else if(serviceChoice1 == 2&& user.getTransactionStatus())
                        user.setWalletBalance(user.getWalletBalance()+new InternetPaymentService().getCost());
                    else if(serviceChoice1 == 3&&user.getTransactionStatus())
                        user.setWalletBalance(user.getWalletBalance()+new LandLineService().getCost());
                    else if(serviceChoice1 ==4&&user.getTransactionStatus())
                        user.setWalletBalance(user.getWalletBalance()+new DonationService().getCost());
                    // request for refund
                    break;
                }
                case 4: {
                    // show wallet balance
                    System.out.println("Wallet Balance: "+user.getWalletBalance());
                    System.out.println();
                    break;
                }
                case 5: {
                    // add funds to wallet by credit card
                    double userBalance;
                    System.out.println("Enter Funds to Wallet: ");
                    userBalance = input.nextDouble();
                    controller.addFundsToWallet(user,userBalance);
                    break;
                }
                case 6: {
                    //check any discount
                    int choosed_Op;
                    Screen.discountMenu();
                    choosed_Op = input.nextInt();
                    if(choosed_Op==1){
                        Screen.serviceMenu();
                        System.out.println("Enter your choosed service to get overAll discount: ");
                        int serviceChoice2 = input.nextInt();
                            IService service;
                            OverallDiscounts overallDiscounts=new OverallDiscounts();
                        if(serviceChoice2 == 1){
                            overallDiscounts.setService(new MobileRechargeService());
                            System.out.println(overallDiscounts.getCost());
                        }
                        else if(serviceChoice2 == 2){
                            overallDiscounts.setService(new InternetPaymentService());
                            System.out.println(overallDiscounts.getCost());
                        }
                        else if(serviceChoice2 == 3){
                            overallDiscounts.setService(new LandLineService());
                            System.out.println(overallDiscounts.getCost());
                        }
                        else if(serviceChoice2 ==4){
                            overallDiscounts.setService(new DonationService());
                            System.out.println(overallDiscounts.getCost());
                        }
                    }
                    else if(choosed_Op==2)
                    {
                        Screen.specialDisconts();
                        int serviceChoice3= input.nextInt();

                    }


                    break;
                }
                case 7: {
                    // show main menu
                    runApplication();
                    break;
                }
                case 8:
                {
                    controller.print_users();
                    break;
                }
                case 9: {
                    System.out.println("Exited Successfully");
                    check2 = true;
                    break;
                }

            }
        }while(Choice!=9);
    }
    public static void adminFunctions(){
        int Choice;
        do {
            Screen.adminMenu();
            System.out.println();
            Choice = input.nextInt();
            System.out.println();
            switch (Choice) {
                case 1: {
                    //add new service provider
                    break;
                }
                case 2: {
                    //add discounts
                    break;
                }
                case 3: {
                    // list user transactions
                    Screen.transactionMenu();
                    System.out.println("Enter your choice");
                    int adminChoice = input.nextInt();
                    if(adminChoice == 1) // payment
                        adminController.listUserTransactions(user,adminChoice,new PaymentTransaction());
                    if(adminChoice==2) // add to wallet
                        adminController.listUserTransactions(user,adminChoice,new AddToWalletTransaction());
                    if(adminChoice==3) //refund
                        adminController.listUserTransactions(user,adminChoice,new RefundTransaction());
                    // new PaymentTransaction()
                    // new AddToWalletTransaction()
                    // new RefundTransaction()
                    break;
                }
                case 4: {
                    // list refund requests
                    String choice;
                    choice = input.nextLine();
                    //
                    adminController.recieveRefundRequest(user,new DonationService(),choice);
                    break;
                }
                case 5: {
                    // show main menu
                    runApplication();
                    break;
                }
                case 6: {
                    System.out.println("Exited Successfully");
                    check3 = true;
                    break;
                }
            }
        }while(Choice!=6);
    }

    static {input = new Scanner(System.in);}
}
