import java.util.Scanner;

public class CreditCard implements IPayment {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

    public CreditCard(){
        this.cardNumber="DNE";
        this.cardHolderName="DNE";
        this.expirationDate="DNE";
        this.cvv="DNE";
    }

    public CreditCard(String cardNumber, String cardHolderName, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    // Setters

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }


    // getters

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    @Override
    public void pay(User user,IService service) {
        System.out.println("Please enter your card number: ");
        Scanner sc = new Scanner(System.in);
        String cardNumber = sc.nextLine();
        System.out.println("Please enter your card holder name: ");
        String cardHolderName = sc.nextLine();
        System.out.println("Please enter your expiration date: ");
        String expirationDate = sc.nextLine();
        System.out.println("Please enter your cvv: ");
        String cvv = sc.nextLine();

        if(user.getWalletBalance()>=service.getCost())
        {
            System.out.println("Payment successful");
            user.setTransactionStatus(true);
            user.setWalletBalance(user.getWalletBalance()-service.getCost());
        }
        else
        {
            System.out.println("Payment failed");
        }
    }
    public void addFundsToWalletByCreditCard(User user,double addFunds){
        user.addToWalletBalance(addFunds);
    }
}
