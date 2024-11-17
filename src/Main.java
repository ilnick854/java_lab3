
import java.util.*;

class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Auto myAuto1 = new Auto();
        System.out.print("Введите фирму: ");
        String firm = sc.next();

        System.out.print("Введите максимальную скорость: ");
        int maxSpeed = sc.nextInt();

        myAuto1.setFirm(firm);
        myAuto1.setMaxSpeed(maxSpeed);

        System.out.println("Каккой-то автомобиль: "+ myAuto1.getFirm() + " " + myAuto1.getMaxSpeed()+"\n");

        Car myCar1 = new Car("Ford", 200, "Mustang", 2 , false);
        Car myCar2 = new Car();

        System.out.print("Введите фирму-производитель легкового авто: ");
        firm = sc.next();
        myCar2.setFirm(firm);

        System.out.print("Введите максимальную скорость легкового авто: ");
        maxSpeed = sc.nextInt();
        myCar2.setMaxSpeed(maxSpeed);

        System.out.print("Введите модель легкового автомобиля: ");
        String model = sc.next();
        myCar2.setModel(model);

        System.out.print("Введите кол-во дверей легкового авто: ");
        int numDoors = sc.nextInt();
        myCar2.setNumDoors(numDoors);

        System.out.print("Введите признак полного привода легкового авто (true/false): ");
        Boolean fullTime = sc.nextBoolean();
        myCar2.setFullTime(fullTime);

        System.out.println();

        System.out.println("Первый легковой автомобиль: " + myCar1.toString());
        System.out.println("Второй легковой автомобиль: " + myCar2.toString());

        Truck myTruck = new Truck();
        myTruck.setAllInfo();
        System.out.println(myTruck.toString());
    }
}


