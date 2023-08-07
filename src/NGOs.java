
public class NGOs extends DonationProducts{
    @Override
    public double getCost() {
        return 750;
    }

    @Override
    public String getServiceName() {
        return "NGOs";
    }

    @Override
    public String getDonationProvider() {
        return "NGOs";
    }



    @Override
    public String getDonationType() {
        return "charity";
    }

    @Override
    public String getDonationAmount() {
        return " 1000";
    }

}
