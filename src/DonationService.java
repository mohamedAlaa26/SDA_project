
public class DonationService implements IService
{
    double cost ;

    @Override
    public double getCost() {
        return 50;
    }

    public String getServiceName() {
        return "Donation Service";
    }

    public String getDonationType() {
        return "Donation Type";
    };

    public String getDonationAmount() {
        return "Donation Amount";
    }

    public String getDonationProvider() {
        return "Donation Provider";
    }

}
