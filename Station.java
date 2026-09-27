//s

import java.util.List;
import java.util.ArrayList;

public class Station {

private int id_station;
private int capacity;
private List<Location> locations;

public Station(int id_station, int capacity) {
this.id_station = id_station;
this.capacity = capacity;
this.locations = new ArrayList<>();

for (int i = 0; i < capacity; i++) {
locations.add(new Location(i));
}
}

public int getId() {
return id_station;
}

public int getCapacity() {
return capacity;
}

public List<Location> getLocations() {
return locations;
}

public boolean isFull() {
for (Location l : locations) {
if (l.available()) {
return false;
}
}
return true;
}

public boolean isEmpty() {
for (Location l : locations) {
if (!l.available()) {
return false;
}
}
return true;
}

public boolean depositS(Vehicule v) {
for (Location l : locations) {
if (l.available()) {
return l.deposit(v);
}
}

System.out.println("The station is full");
return false;
}

public Vehicule withdrawS() {
for (Location l : locations) {
if (!l.available()) {
return l.withdraw();
}
}

System.out.println("The station is empty");
return null;
}
}