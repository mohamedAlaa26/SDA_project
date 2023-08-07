
public class CancerHospital extends DonationProducts{
    @Override
    public double getCost() {
        return 900;
    }

    @Override
    public String getServiceName() {
        return "CancerHospital";
    }

    @Override
    public String getDonationProvider() {
        return "Cancer Hospital";
    }

    @Override
    public String getDonationType() {
        return "charity";
    }

    @Override
    public String getDonationAmount() {
        return " 3000";
    }
}
