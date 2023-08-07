
public class MonthlyReceipt extends LandlineProducts {
    @Override
    public double getCost() {
        return 500;
    }

    @Override
    public String getServiceName() {
        return "Monthly Receipt";
    }


    @Override
    public String getLandlinePackage() {
        return "Monthly";
    }

}
