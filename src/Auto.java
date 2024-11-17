public class Auto {
    private String firm;
    private int maxSpeed;

    public void setFirm(String firm){
        this.firm = firm;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public String getFirm(){
        return firm;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public Auto(){
        firm = "без названия";
        maxSpeed = 0;
    }

    public Auto(String  firm, int maxSpeed){
        this.firm = firm;
        this.maxSpeed = maxSpeed;
    }
}
