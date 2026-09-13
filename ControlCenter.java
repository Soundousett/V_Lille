
public class ControlCenter{

    private List<Station> stations;
    private List<Vehicule> vehicules;

    public ControlCenter(){
        this.stations= new ArrayList<>();
        this.vehicule=new ArrayList<>();
    }


    public void ajouterStation(Station station) {
        stations.add(station);
    }

    public void ajouterVehicule(Vehicule vehicule) {
        flotte.add(vehicule);
    }


}
