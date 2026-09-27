public class User {

    private int userId;
    private String userName;
    private  float accountBalance;



    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }

    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public float getAccountBalence() {
        return accountBalance;
    }
    public void setAccountBalence(float accountBalence) {
        this.accountBalance = accountBalence;
    }



    public User(int userId, String userName, float accountBalance) {
        this.userId = userId;
        this.userName = userName;
        this.accountBalance = accountBalance;
    }
//ajoute ca 
    public boolean canPay (float price){
        return price<= accountBalance;
    
    }
    public void pay(float price){
         if (canPay(price)) {
            accountBalance-=price;
         }
    }
    

}
