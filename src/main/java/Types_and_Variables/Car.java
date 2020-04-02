package Types_and_Variables;

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

    int numberOfPeopleInCar =1;

    //math f(x) = x+1;
    //x=5; f(5) =5+1=6;
    //f(x,y,z) = x+1/z-y;
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
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
        numberOfPeopleInCar++;
    }
    public void getOut(){
        //if (numberOfPeopleInCar == 0) {
            numberOfPeopleInCar--;
        //}
    }
    public double howManyKmOutOffGas(){
        return currentFuel*lon100km;
    }
    public double maxKmPerFillUp(){
        return maxFuel*lon100km;
    }

    public static void main(String[] args) {

        Car birthdayPresent = new Car(180, 2700.3, true);
        System.out.println("Birthday car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("km ramasi: "+ birthdayPresent.howManyKmOutOffGas());
        System.out.println("max km: "+birthdayPresent.maxKmPerFillUp());
        System.out.println("Birthday car v2");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday car v3");
        birthdayPresent.printVariables();

        /*System.out.println("Cristmas car");
        Car cristmasPresent = new Car(220, 200, false);
        cristmasPresent.printVariables();*/
    }
}
