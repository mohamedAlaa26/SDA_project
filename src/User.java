public class User {
    private String username;
    private String password;
    private String email;
    private double walletBalance;
    //private Wallet wallet = new Wallet(walletBalance,username);
    private boolean transactionStatus;

    public User(){
        this.username="DNE";
        this.password="DNE";
        this.email="DNE";
        this.walletBalance=0.0;
        this.transactionStatus=false;
    }
    // Setters
    public void setTransactionStatus(boolean transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public boolean getTransactionStatus() {
       return transactionStatus;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setWalletBalance(double walletBalance) {
        this.walletBalance= walletBalance;
    }

    // Getters

    public String getUsername(){
        return username;
    }

    public User getUserObject(){
        return this;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public double getWalletBalance() {return walletBalance;}

    public void addToWalletBalance(double WalletBalance){
        this.walletBalance+=WalletBalance;
    }



}
