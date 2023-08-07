
public class EtisalatMobileRecharge extends MobileRechargeProducts{
    @Override
    public double getCost() {
        return 3000;
    }

    @Override
    public String getServiceName() {
        return "EtisalatMobileRecharge";
    }



    @Override
    public String getMobileNumber() {
        return  " 0111111111";
    }

    @Override
    public String getMobileOperator() {
        return " Etisalat";
    }
}
