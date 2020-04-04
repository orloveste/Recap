package Hackerrank.Class_vs._Instance;

public class Car {
    int maxSpeed = 100;
    int minSpeed = 0;

    double weight = 4079;

    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Red";

    double maxFuel = 40;
    double currentFuel = 20;
    double lon100km = 6.1;

    int numberOfPeopleInCar = 1;
    int maxNumberOfPeopleInCar = 5;

    public Car() {

    }
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMinSpeed() {
        return this.minSpeed;
    }

    public double getWeight() {
        return this.weight;
    }

    public boolean isTheCarOn() {
        return this.isTheCarOn;
    }

    public void printVariables(){
        System.out.println("This is the maxSpeed "+ maxSpeed);
        System.out.println(minSpeed);
        System.out.println(weight);
        System.out.println(isTheCarOn);
        System.out.println(condition);
        System.out.println(nameOfCar);
        System.out.println(numberOfPeopleInCar);
    }
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed+1;
    }

    public void getIn(){
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar){
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        }else {
            System.out.println("The car is full! "+ numberOfPeopleInCar+ " = "+ maxNumberOfPeopleInCar);
        }
    }
    public void getOut(){
        if (numberOfPeopleInCar > 0) {
            numberOfPeopleInCar--;
            System.out.println("Someone get out");
        } else {
            System.out.println("No one is in the car "+ numberOfPeopleInCar);
        }
    }
    public double howManyKmOutOffGas(){
        return currentFuel*lon100km;
    }
    public double maxKmPerFillUp(){
        return maxFuel*lon100km;
    }

    public void turnTheCarOn(){
        if (!isTheCarOn){
            isTheCarOn = true;
        }else {
            System.out.println("car is already on "+ isTheCarOn);
        }
    }
    public static void main(String[] args) {

        Car uber = new Car();
        uber.getOut();
        uber.getOut();
        uber.getIn();
        uber.getIn();
        uber.getIn();
        uber.getIn();
        uber.getIn();
        uber.getIn();
        uber.turnTheCarOn();
        uber.turnTheCarOn();



        /*System.out.println("Cristmas car");
        Car cristmasPresent = new Car(220, 200, false);
        cristmasPresent.printVariables();*/
    }
}
