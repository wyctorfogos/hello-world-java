import java.sql.Date;

public class Car {
    private String branch;
    private String color;
    private String ownerName;
    private Date inspectionDate;
    private String ownerEmail;

    public Car(String carBranchName, String ownerName, String carColorName, String ownerEmail) {
        this.setCarBranch(carBranchName);;
        this.setCarOwnerName(ownerName);
        this.setCarColor(carColorName);
        this.setCarInspectionDate();
        this.setEmail(ownerEmail);
    }

    public String getCarBranch() {
        return this.branch;
    }

    public void setCarBranch(String newCarBranch) {
        this.branch = newCarBranch;
    }

    public String getCarColor() {
        return this.color;
    }

    public void setCarColor(String newCarColor) {
        this.color = newCarColor;
    }

    public String getCarOwnerName() {
        return this.ownerName;
    }

    public void setCarOwnerName(String newOwnerName) {
        this.ownerName = newOwnerName;
    }

    public Date getCarInspectionDate() {
        return this.inspectionDate;
    }

    public void setCarInspectionDate() {
        this.inspectionDate = new Date(System.currentTimeMillis());
    }

    public String getOwnerEmail(){
        return this.ownerEmail;    
    }

    private Boolean setEmail(String ownerEmail){
        try{
            this.ownerEmail = ownerEmail;
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar o email "+ (ownerEmail) + "!\n");
            return false;
        }
    }

    public void showCarDetail(){
        System.out.println("Car registered successfully!");
        System.out.println("Branch: " + this.getCarBranch());
        System.out.println("Color: " + this.getCarColor());
        System.out.println("Owner: " + this.getCarOwnerName());
        System.out.println("Owner email: " + this.getOwnerEmail());
        System.out.println("Inspection Date: " + this.getCarInspectionDate()+ "\n");
        
    }

}
