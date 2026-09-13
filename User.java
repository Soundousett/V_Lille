public class User {
    private int userId;
    private String userName;
    private  float accountBalence;



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
        return accountBalence;
    }
    public void setAccountBalence(float accountBalence) {
        this.accountBalence = accountBalence;
    }



    public User(int userId, String userName, float accountBalence) {
        this.userId = userId;
        this.userName = userName;
        this.accountBalence = accountBalence;
    }

    
    

}
