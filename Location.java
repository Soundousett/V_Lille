// //s

// public class Location{
//      private int number;
//     private Vehicule vehicule;

//     public Location(int number ){
//         this.number= number;
//         this.vehicule= null;
//     }

    
// }



public class Location {

private int number;
private Vehicule vehicule;

public Location(int number) {
this.number = number;
this.vehicule = null;
}

public int getNumber() {
return number;
}

public Vehicule getVehicule() {
return vehicule;
}

public boolean available() {
return vehicule == null;
}

public boolean deposit(Vehicule v) {
if (v == null || !available()) {
return false;
}

vehicule = v;
return true;
}

public Vehicule withdraw() {
if (available()) {
return null;
}

Vehicule v = vehicule;
vehicule = null;
return v;
}
}