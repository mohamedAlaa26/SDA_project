
public class EtisalatInternetPayment extends InternetPaymentProducts{
    @Override
    public double getCost() {
        return 4000;
    }

    @Override
    public String getServiceName() {
        return "EtisalatInternetPayment";
    }

    @Override
    public String getInternetSpeed() {
        return "30mps";
    }

    @Override
    public String getInternetPaymentTransactionStatus() {
        return "paid";
    }

    @Override
    public String getInternetPaymentMethod() {
        return "visa";
    }

    @Override
    public String getInternetProvider() {
        return "Etisalat";
    }

}
