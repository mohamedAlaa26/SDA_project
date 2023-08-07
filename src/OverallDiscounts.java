
public class OverallDiscounts extends DiscountDecorator{

    private IService service;
    public double discountPercent=0.1;

    @Override
    public double getCost() {//return cost after discount
        return service.getCost()-(service.getCost()*discountPercent);
    }

    public void setService(IService service) {
        this.service = service;
    }

    @Override
    public String getServiceName() {
        return super.getServiceName();
    }

}
