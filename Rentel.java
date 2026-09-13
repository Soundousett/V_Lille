import java.time.LocalDate;

public class Rentel {
     private int vehiculeId;
    private int userId;
    private LocalDate dateRentel;


    public int getVehiculeId() {
        return vehiculeId;
    }
    public void setVehiculeId(int vehiculeId) {
        this.vehiculeId = vehiculeId;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public LocalDate getDateRentel() {
        return dateRentel;
    }
    public void setDateRentel(LocalDate dateRentel) {
        this.dateRentel = dateRentel;
    }


    
    public Rentel(int vehiculeId, int userId, LocalDate dateRentel) {
        this.vehiculeId = vehiculeId;
        this.userId = userId;
        this.dateRentel = dateRentel;
    }

    
    
}
