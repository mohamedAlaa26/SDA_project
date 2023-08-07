
public class ServiceEntity {

    public String[] Services;
    public String MatchService;
    public String[] storageService = new String[4];
    public ServiceEntity(){
        this.Services = new String[]{"Mobile recharge services","Internet Payment services","Landline services","Donations"};
    }
    public String[] getService(){
        return Services;
    }
    public void setMatchService(String MatchService){
        this.MatchService = MatchService;
        storeService(MatchService);
    }
    public void storeService(String Match){
        for(int i=0;i<Services.length;i++){
            storageService[i]=Match;
        }
    }
    public String[] getStoreService(){
        return storageService;
    }

}
