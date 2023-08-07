public class LandLineService implements IService{
    @Override
    public double getCost() {
        return 60;
    }

    public String getServiceName() {
        return "LandLine Service";
    }

    public String getLandLinePackage() {
        return "LandLine Package";
    }
}
