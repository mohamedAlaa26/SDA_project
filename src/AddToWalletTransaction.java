
public class AddToWalletTransaction implements ITransaction {

    @Override
    public IService serviceProducts(IService products) {
        if ( products instanceof InternetPaymentService) {
            return new InternetPaymentService();
        } else if (products instanceof LandLineService) {
            return new LandLineService();
        } else if (products instanceof MobileRechargeService) {
            return new MobileRechargeService();
        } else {
            return null;
        }
    }

    @Override
    public User getUser() {
        return null;
    }

    @Override
    public double getCost() {
        return 0;
    }

    @Override
    public boolean getTransactionStatus() {
        return false;
    }

    public void showTransactionDetails(User user,IService service) {
        System.out.println("Transaction Details");
        System.out.println("Service: " +service.getServiceName() );
        System.out.println("User: " + user.getUsername());
        System.out.println("Cost: " + getCost());
        System.out.println("Transaction Status: " + user.getTransactionStatus());
    }
}
