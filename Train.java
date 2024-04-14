import java.util.ArrayList;

public class Train {
    /*
     * Creates a train that brings all other classes (Engine, Car, Passengers) together
     */
    private Engine engine;
    private ArrayList<Car> cars;
    private int maxCapacity;
    private int seatsRemaining;
    public int passengerCapacity;

    // NOTE TO ME: passengerCapacity is the capacity of a single car. So, the maxCapacity of the train is the product of the number of cars and passengerCapacity
    Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>(nCars);
        this.maxCapacity = nCars * passengerCapacity;
        this.passengerCapacity = passengerCapacity;
    }

    /**
     * Getter for the Engine
     * @return the train's engine
     */
    public Engine getEngine(){
        return this.engine;
    }

    /**
     * Adds a car to the train
     * @param c the car object to be added
     */
    public void addCar(Car c){
        this.cars.add(c);
    }

    /** 
     * Removes a car from the train
     * @param c the car to be removed
     */
    public void removeCar(Car c){
        this.cars.remove(c);
    }

    /**
     * Getter for car
     * @param i the number of the car to be returned
     * @return the ith car
     */
    public Car getCar(int i){
        return cars.get(i);
    }

    /**
     * Getter for the total maximum capacity of the train
     * @return the total maximum capacity of the train
     */
    public int getMaxCapacity(){
        return this.maxCapacity;
    }

    /**
     * Returns the number of unoccupied seats on the train 
     * @return the number of seats left on the train
     */
    public int seatsRemaining(){
        for (Car c: cars){
            seatsRemaining += c.seatsRemaining();
        }
        return seatsRemaining;
    }

    /**
     * Prints out a list of passengers aboard the train
     */
    public void printTrainManifest(){
        System.out.println("TRAIN'S MANIFEST:");
        for (int i = 0; i < cars.size(); i++){
            getCar(i).passengerList();
        }
    }
}


/**
 * NOTES TO ME
 * Function to test the code:
 * public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 5, 2);
        Car c1 = new Car(myTrain.passengerCapacity);
        Car c2 = new Car(myTrain.passengerCapacity);
        Car c3 = new Car(myTrain.passengerCapacity);
        Car c4 = new Car(myTrain.passengerCapacity);
        Car c5 = new Car(myTrain.passengerCapacity);
        myTrain.addCar(c1);
        myTrain.addCar(c2);
        myTrain.addCar(c3);
        myTrain.addCar(c4);
        myTrain.addCar(c5);
        myTrain.removeCar(c5);
        Passenger p1 = new Passenger("Chioma");
        Passenger p2 = new Passenger("John");
        Passenger p3 = new Passenger("Paula");
        Passenger p4 = new Passenger("Elm");
        Passenger p5 = new Passenger("Cniper");
        Passenger p6 = new Passenger("Roxy");
        Passenger p7 = new Passenger("Alternateish");
        Passenger p8 = new Passenger("yvonne");
        Passenger p9 = new Passenger("Mowan");
        Passenger p10 = new Passenger("Jostuc");
        Passenger p11 = new Passenger("Nimpo");
        p1.boardCar(c1);
        p2.boardCar(c2);
        p3.boardCar(c3);
        p4.boardCar(c4);
        p5.boardCar(c5);
        p6.boardCar(c1);
        p7.boardCar(c2);
        p8.boardCar(c3);
        p9.boardCar(c4);
        p10.boardCar(c5);
        myTrain.printTrainManifest();
        p11.boardCar(c2);
    }
 */
