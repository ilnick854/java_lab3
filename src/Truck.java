import java.util.*;

public class Truck extends Auto {
    private String model;
    private int power;
    private Boolean trailer;

    public Truck(){
        super();
        model = "";
        power = 0;
        trailer = false;
    }

    public Truck(String firm, int maxSpeed, String model, int power, Boolean trailer){
        super(firm,maxSpeed);
        this.model = model;
        this.power = power;
        this.trailer = trailer;
    }

    public void setModel(String model){
        this.model = model;
    }


    public void setPower(int power){
        this.power = power;
    }

    public void setTrailer(Boolean trailer){
        this.trailer = trailer;
    }

    public String getModel(){
        return model;
    }

    public int getPower(){
        return power;
    }

    public Boolean isTrailer(){
        return trailer;
    }

    public void setAllInfo(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите фирму-производитель грузового авто: ");
        String firm = sc.next();
        setFirm(firm);

        System.out.print("Введите максимальную скорость грузового авто: ");
        int maxSpeed = sc.nextInt();
        setMaxSpeed(maxSpeed);

        System.out.print("Введите модель грузового автомобиля: ");
        model = sc.next();

        System.out.print("Введите мощность грузового автомобиля: ");
        power = sc.nextInt();

        System.out.print("Введите признак прицепа грузового автомобиля (true/false): ");
        trailer = sc.nextBoolean();
        System.out.println();
    }

    public String toString(){
        return "\n\tГрузовик"
                + "\n\t" + "Фирма: " + getFirm()
                + "\n\t" + "Максимальная скорость: " + getMaxSpeed()
                + "\n\t" + "Модель: " + model
                + "\n\t" + "Мощность: " + power
                + "\n\t" + "Признак прицепа: " + trailer + "\n";
    }


}
