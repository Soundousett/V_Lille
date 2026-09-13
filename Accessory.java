public class Accessory {
    private int accessoryId;
    private String nameAcc;
    private float priceAcc;


    public int getAccessoryId() {
        return accessoryId;
    }
    public void setAccessoryId(int accessoryId) {
        this.accessoryId = accessoryId;
    }
    public String getNameAcc() {
        return nameAcc;
    }
    public void setNameAcc(String nameAcc) {
        this.nameAcc = nameAcc;
    }
    public float getPriceAcc() {
        return priceAcc;
    }
    public void setPriceAcc(float priceAcc) {
        this.priceAcc = priceAcc;
    }
    
    public Accessory(int accessoryId, String nameAcc, float priceAcc) {
        this.accessoryId = accessoryId;
        this.nameAcc = nameAcc;
        this.priceAcc = priceAcc;
    }

    
    
}
