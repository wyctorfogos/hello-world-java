import java.sql.Date;

public class Car {
    private String branch;
    private String color;
    private String ownerName;
    private Date inspectionDate;

    public Car(String carBranchName, String ownerName, String carColorName) {
        this.setCarBranch(carBranchName);;
        this.setCarOwnerName(ownerName);
        this.setCarColor(carColorName);
        this.setCarInspectionDate();
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
}
