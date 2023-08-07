
public interface ITransaction {
    IService serviceProducts(IService products);
    User getUser();
    double getCost();
    boolean getTransactionStatus(); // if transaction is successful or not
    void showTransactionDetails(User user,IService service); // show transaction details


}
