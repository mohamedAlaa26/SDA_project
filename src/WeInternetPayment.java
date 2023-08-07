
public class WeInternetPayment extends InternetPaymentProducts{
    @Override
    public double getCost() {
        return 650;
    }

    @Override
    public String getServiceName() {
        return "WeInternetPayment";
    }


    @Override
    public String getInternetSpeed() {
        return "70mps";
    }

    @Override
    public String getInternetPaymentTransactionStatus() {
        return "paid";
    }

    @Override
    public String getInternetPaymentMethod() {
        return "Wallet";
    }

    @Override
    public String getInternetProvider() {
        return "We";
    }
}
