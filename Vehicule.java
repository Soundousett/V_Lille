public abstract class Vehicule {
    
    private int vehiculeId;
    private int locationNbr ;
    private int serviceHours; 
    private float priceV;
    private Boolean outOfService;
    private Boolean underRepair;
    private static final int maxLocations = 15;

   
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
        this.outOfService=false;
        this.underRepair=false;
    }

    
     
    public Boolean isOutOfService() {
        return outOfService;
    }
     public void setOutOfService(Boolean outOfService) {
         this.outOfService = outOfService;
     }
     public Boolean isUnderRepair() {
         return underRepair;
     }
     public void setUnderRepair(Boolean underRepair) {
         this.underRepair = underRepair;
     } 
 

    public void addLocation(){

        locationNbr++;
        if (locationNbr>=maxLocations) {
            outOfService=true;
        }




         }

        //  ajouter ca et la var de maxLoc s
    public void startRepair(){
        underRepair =true;
        outOfService=true;


    }
    public void finishRepair(){
        underRepair =false;
        outOfService=false;


    }



    

}
