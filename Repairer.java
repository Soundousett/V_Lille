public class Repairer {
   
    public void repair(Vehicule vehicule){
       if (vehicule.isOutOfService()==true) {
            vehicule.setUnderRepair(true);

         } 
     }
    public void finishRepair(Vehicule vehicule){
        vehicule.setOutOfService(false);
        vehicule.setUnderRepair(false);
    }
}
