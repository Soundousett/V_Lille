
public class Station{
    private int id_station;
    private int capacity;
    private List<Location> locations;

    public Station(int id_station, int capacity) {
    this.id_station  = id_station;
    this.capacity =capacity;
    locations= new ArrayList<>();
}

 public int getId() {
        return id_station;
    }

    public int getCapacity() {
        return capacity;
    }




}