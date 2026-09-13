public abstract class Vehicule {
    
    private int vehiculeId;
    private int locationNbr ;
    private int serviceHours; 
    private float priceV;


    public int getVehiculeId() {
        return vehiculeId;
    }
    public int getLocationNbr() {
        return locationNbr;
    }
    public int getServiceHours() {
        return serviceHours;
    }


    public void setVehiculeId(int vehiculeId) {
        this.vehiculeId = vehiculeId;
    }
    public void setLocationNbr(int locationNbr) {
        this.locationNbr = locationNbr;
    }
    public void setServiceHours(int serviceHours) {
        this.serviceHours = serviceHours;
    }
    public void setPriceV(float priceV) {
        this.priceV = priceV;
    }
    public float getPriceV() {
        return priceV;
    }


    
    public Vehicule(int vehiculeId, int locationNbr, int serviceHours, float priceV) {
        this.vehiculeId = vehiculeId;
        this.locationNbr = locationNbr;
        this.serviceHours = serviceHours;
        this.priceV = priceV;
    }

    
    
 


}
