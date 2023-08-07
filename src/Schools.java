
public class Schools extends DonationProducts{
    @Override
    public double getCost() {
        return 200;
    }

    @Override
    public String getServiceName() {
        return "Schools";
    }

    @Override
    public String getDonationProvider() {
        return "Schools";
    }

    @Override
    public String getDonationType() {
        return "charity";
    }

    @Override
    public String getDonationAmount() {
        return " 2000";
    }
}
