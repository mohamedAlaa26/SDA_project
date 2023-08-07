
public class OrangeMobileRecharge extends MobileRechargeProducts{
    @Override
    public double getCost() {
        return 60;
    }



    @Override
    public String getServiceName() {
        return "OrangeMobileRecharge";
    }



    @Override
    public String getMobileNumber() {
        return  " 012222222222";
    }

    @Override
    public String getMobileOperator() {
        return " Orange";
    }
}
