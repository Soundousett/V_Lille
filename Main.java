public class Main {

    public static void main(String[] args) {

        // 1. Création du centre de contrôle
        ControlCenter center = new ControlCenter();

        // 2. Création d'une station
        Station station = new Station(1, 3);

        center.addStation(station);

        System.out.println("=== STATION ===");
        System.out.println("ID : " + station.getId());
        System.out.println("Capacite : " + station.getCapacity());
        System.out.println("Station vide : " + station.isEmpty());
        System.out.println("Station pleine : " + station.isFull());


        // 3. Création de deux vélos
        ClassicBike bike1 = new ClassicBike(101, 0, 0, 2.5f);
        ElectricBike bike2 = new ElectricBike(102, 0, 0, 4.0f);

        // 4. Ajout des vélos au centre de contrôle
        center.addVehicule(bike1);
        center.addVehicule(bike2);


        // 5. Dépôt du premier vélo
        System.out.println("\n=== DEPOT ===");

        boolean result1 = center.deposit_call(bike1, station);

        System.out.println("Depot reussi : " + result1);
        System.out.println("Station vide : " + station.isEmpty());
        System.out.println("Station pleine : " + station.isFull());


        // 6. Dépôt du deuxième vélo
        boolean result2 = center.deposit_call(bike2, station);

        System.out.println("Depot reussi : " + result2);


        // 7. Vérification de la station
        System.out.println("\n=== ETAT DE LA STATION ===");

        System.out.println("Station vide : " + station.isEmpty());
        System.out.println("Station pleine : " + station.isFull());


        // 8. Affichage des emplacements
        System.out.println("\n=== EMPLACEMENTS ===");

        for (Location location : station.getLocations()) {

            if (location.available()) {
                System.out.println(
                    "Emplacement " + location.getNumber() + " : vide"
                );
            } else {
                System.out.println(
                    "Emplacement " + location.getNumber()
                    + " : vehicule "
                    + location.getVehicule().getVehiculeId()
                );
            }
        }


        // 9. Retrait d'un vélo
        System.out.println("\n=== RETRAIT ===");

        Vehicule v = center.withdraw_call(station);

        if (v != null) {
            System.out.println(
                "Vehicule retire : " + v.getVehiculeId()
            );
        }


        // 10. Etat après retrait
        System.out.println("\n=== APRES RETRAIT ===");

        System.out.println("Station vide : " + station.isEmpty());
        System.out.println("Station pleine : " + station.isFull());


        // 11. Affichage de la liste des véhicules
        System.out.println("\n=== VEHICULES DU CENTRE ===");

        for (Vehicule vehicule : center.getVehicules()) {

            System.out.println(
                "Vehicule : " + vehicule.getVehiculeId()
            );
        }
    }
}