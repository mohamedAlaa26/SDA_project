
public class VodafoneInternetPayment extends InternetPaymentProducts{
    @Override
    public double getCost() {
        return 60;
    }

    @Override
    public String getServiceName() {
        return "VodafoneInternetPayment";
    }



    @Override
    public String getInternetSpeed() {
        return "50mps";
    }

    @Override
    public String getInternetPaymentTransactionStatus() {
        return "paid";
    }

    @Override
    public String getInternetPaymentMethod() {
        return "cash";
    }

    @Override
    public String getInternetProvider() {
        return "Vodafone";
    }

}
