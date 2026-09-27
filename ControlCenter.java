// public class ControlCenter{

//     private List<Station> stations;
//     private List<Vehicule> vehicules;

//     public ControlCenter(){
//         this.stations= new ArrayList<>();
//         this.vehicule=new ArrayList<>();
//     }


//     public void addStation(Station station) {
//         stations.add(station);
//     }

//     public void addVehicule(Vehicule vehicule) {
//         vehicules.add(vehicule);
//     }
    
//     public void deposit_call(Vehicule v, Station s){
//            System.out.println("Deposit:"+s.getId() +":" +v.getVehiculeId());
//     }
//     public void withdraw_call(Vehicule v, Station s){
//            System.out.println("Withdraw:"+s.getId() +":" +v.getVehiculeId());
//     }

// }



import java.util.List;
import java.util.ArrayList;

public class ControlCenter {

private List<Station> stations;
private List<Vehicule> vehicules;

public ControlCenter() {
this.stations = new ArrayList<>();
this.vehicules = new ArrayList<>();
}

public void addStation(Station station) {
stations.add(station);
}

public void addVehicule(Vehicule vehicule) {
vehicules.add(vehicule);
}

public List<Station> getStations() {
return stations;
}

public List<Vehicule> getVehicules() {
return vehicules;
}

public boolean deposit_call(Vehicule v, Station s) {
if (v == null || s == null) {
return false;
}

boolean success = s.depositS(v);

if (success) {
System.out.println(
"Deposit: " + s.getId()
+ ":" + v.getVehiculeId()
);
}

return success;
}

public Vehicule withdraw_call(Station s) {
if (s == null) {
return null;
}

Vehicule v = s.withdrawS();

if (v != null) {
System.out.println(
"Withdraw: " + s.getId()
+ ":" + v.getVehiculeId()
);
}

return v;
}
}