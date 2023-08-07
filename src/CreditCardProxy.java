
public class CreditCardProxy implements IPayment {
    private CreditCard creditCard;
    //Protection Proxy intent
    @Override
    public void pay(User user, IService service) {
        if(creditCard==null){
            creditCard = new CreditCard();
        }
        creditCard.pay(user,service);
    }
    public void addByCreditCard(User user , double addedBalance){
        if(creditCard==null){
            creditCard = new CreditCard();
        }
        creditCard.addFundsToWalletByCreditCard(user,addedBalance);
    }
}
