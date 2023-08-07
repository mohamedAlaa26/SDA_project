
public class VodafoneMobileRecharge extends MobileRechargeProducts {
    @Override
    public double getCost() {
        return 600;
    }

    @Override
    public String getServiceName() {
        return "VodafoneMobileRecharge";
    }

    @Override
    public String getMobileNumber() {
        return  " 0100000000000000";
    }

    @Override
    public String getMobileOperator() {
        return " Vodafone";
    }
}
