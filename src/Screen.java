

public class Screen {
    public static void mainMenu(){
        System.out.println("Choose mode: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- User \t\t\t\t\t|");
        System.out.println("|\t\t\t   2- Admin \t\t\t\t\t|");
        System.out.println("|\t\t\t   3- Exit \t\t\t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");}
    public static void registerMenu(){
        System.out.println("Choose: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- Sign in \t\t\t|");
        System.out.println("|\t\t\t   2- Sign up \t\t\t|");
        System.out.println("|\t\t\t   3- Exit \t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");}
    public static void specialDisconts(){
        //System.out.println("Choose: ");
        System.out.println("|\t\t\t   1- Mobile recharge services discount 15%\t\t\t|");
        System.out.println("|\t\t\t   2- Internet payment services discount 20%\t\t\t|");
        System.out.println("|\t\t\t   3- Landline services discount 40%\t\t\t\t|");
        System.out.println("|\t\t\t   4- Donations (No discount)\t\t\t\t|");
        System.out.println();
        System.out.print("|        ---------------------------------------------        |");
        System.out.println();
    }
    public static void paymentFormMenu(){
        System.out.println("Choose type of Payment: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- Credit Card Pay \t\t\t  |");
        System.out.println("|\t\t\t   2- Cash Pay \t\t\t  |");
        System.out.println("|\t\t\t   3- Pay via Wallet  \t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");}
    public static void discountMenu(){
        System.out.println("Choose type of Discounts you want to Add: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- Overall Discounts \t\t\t|");
        System.out.println("|\t\t\t   2- Specific Discounts \t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");}
    public static void adminMenu(){
        System.out.println("Choose: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- Add New Service Provider \t\t\t|");
        System.out.println("|\t\t\t   2- Add Discounts \t\t\t|");
        System.out.println("|\t\t\t   3- List User Transactions \t\t\t|");
        System.out.println("|\t\t\t   4- List Refund Requests \t\t\t|");
        System.out.println("|\t\t\t   5- Main menu \t\t\t|");
        System.out.println("|\t\t\t   6- Exit \t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");}
    public static void userMenu(){
        System.out.println("Choose: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- Search for Service \t\t\t|");
        System.out.println("|\t\t\t   2- Pay for any Service \t\t\t|");
        System.out.println("|\t\t\t   3- Request Refund \t\t\t|");
        System.out.println("|\t\t\t   4- Show Wallet Balance \t\t\t|");
        System.out.println("|\t\t\t   5- Add Funds to Wallet \t\t\t|");
        System.out.println("|\t\t\t   6- Check Any Discount \t\t\t|");
        System.out.println("|\t\t\t   7- Main Menu \t\t\t|");
        System.out.println("|\t\t\t   8- show users \t\t\t|");
        System.out.println("|\t\t\t   9- Exit \t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");}
    public static void serviceMenu(){
        System.out.println("Choose the type of service you want: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- Mobile recharge services \t\t\t|");
        System.out.println("|\t\t\t   2- Internet payment services \t\t\t|");
        System.out.println("|\t\t\t   3- Landline services \t\t\t|");
        System.out.println("|\t\t\t   4- Donations \t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");}
    public static void serviceProviderMenu(){
        System.out.println("Choose the type of service provider you want: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- Vodafone \t\t\t|");
        System.out.println("|\t\t\t   2- Etisalat \t\t\t|");
        System.out.println("|\t\t\t   3- Orange \t\t\t|");
        System.out.println("|\t\t\t   4- We \t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");}
    public static void LandlineServiceMenu(){
        System.out.println("Choose the type of service provider you want: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- Monthly Receipt \t\t\t|");
        System.out.println("|\t\t\t   2- Quarter Receipt \t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");}
    public static void DonationServiceMenu(){
        System.out.println("Choose the type of service provider you want: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- Cancer Hospital \t\t\t|");
        System.out.println("|\t\t\t   2- Schools \t\t\t|");
        System.out.println("|\t\t\t   3- NGOs (Non profitable organizations) \t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");}
    public static void transactionMenu(){
        System.out.println("Choose the type of user transactions you want to list: ");
        System.out.println("|\t\t\t---------------------------\t\t\t|");
        System.out.println("|\t\t\t   1- Payment Transactions \t\t\t|");
        System.out.println("|\t\t\t   2- Add to Wallet Transactions \t\t\t|");
        System.out.println("|\t\t\t   3- Refund Transactions \t\t\t|");
        System.out.println("|\t\t\t--------------------------\t\t\t|");
        System.out.print("Choice:");
}
    public static void WelcomingUser(User user)
    {
        System.out.println("==========================");
        System.out.println("        Welcome "+user.getUsername()+"\t\t\t\t|" );
        System.out.println("==========================");
    }
    public void updateSearch(ServiceEntity service){
        for (int i=0;i<service.getService().length;i++) {
               if(service.getStoreService()[i]!=null)
                   System.out.println(service.getStoreService()[i]);
        }
    }
}
