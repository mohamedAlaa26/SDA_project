
public class QuarterReceipt extends LandlineProducts{
    @Override
    public double getCost() {
        return 2500;
    }

    @Override
    public String getServiceName() {
        return "QuarterReceipt";
    }

    @Override
    public String getLandlinePackage() {
        return "Quarter Year";
    }
}
