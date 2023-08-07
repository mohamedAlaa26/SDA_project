
public class DiscountDecorator implements IService {

    @Override
    public double getCost() {
        return 350;
    }

    @Override
    public String getServiceName() {
        return "DiscountDecorator";
    }
}
