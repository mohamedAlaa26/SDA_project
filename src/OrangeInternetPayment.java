
public class OrangeInternetPayment extends InternetPaymentProducts{
    @Override
    public double getCost() {
        return 70;
    }

    @Override
    public String getServiceName() {
        return "OrangeInternetPayment";
    }


    @Override
    public String getInternetSpeed() {
        return "40mps";
    }

    @Override
    public String getInternetPaymentTransactionStatus() {
        return "paid";
    }

    @Override
    public String getInternetPaymentMethod() {
        return "mastercard";
    }

    @Override
    public String getInternetProvider() {
        return "Orange";
    }

}
