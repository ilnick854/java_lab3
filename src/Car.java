
public class  Car extends Auto {
    private String model;
    private int numDoors;
    private Boolean fullTime;

    public Car(){
        super();
        model = "";
        numDoors = 4;
        fullTime = false;
    }

    public Car(String firm, int maxSpeed, String model, int numDoors, Boolean fullTime){
        super(firm,maxSpeed);
        this.model = model;
        this.numDoors = numDoors;
        this.fullTime = fullTime;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }

    public void setFullTime(Boolean fullTime){
        this.fullTime = fullTime;
    }

    public String getModel(){
        return model;
    }

    public int getNumDoors(){
        return numDoors;
    }

    public Boolean getFullTime(){
        return fullTime;
    }

    public String toString(){
        return getFirm() + " " + getMaxSpeed() + " " + getModel() + " " + getNumDoors() + " " + getFullTime();
    }
}
