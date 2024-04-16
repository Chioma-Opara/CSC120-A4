import java.util.ArrayList;

public class Train {
    /*
     * Creates a train that brings all other classes (Engine, Car, Passengers) together
     */
    private final Engine engine;
    private ArrayList<Car> cars;

    // NOTE TO ME: passengerCapacity is the capacity of a single car. So, the maxCapacity of the train is the product of the number of cars and passengerCapacity
    public Train(FuelType fuelType, double fuelCapacity, int nCars, int passengerCapacity){
        this.engine = new Engine(fuelType, fuelCapacity);
        this.cars = new ArrayList<Car>(nCars);
        for (int i = 0; i < nCars; i++){
            this.addCar(new Car(passengerCapacity));
        }
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
        int maxCapacity = 0; 
        for (Car c: cars){
            maxCapacity += c.getCapacity();
        }
        return maxCapacity;
    }

    /**
     * Returns the number of unoccupied seats on the train 
     * @return the number of seats left on the train
     */
    public int seatsRemaining(){
        int seatsRemaining = 0;
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
    public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 5, 2);
        Passenger p1 = new Passenger("Chioma");
        p1.boardCar(myTrain.getCar(0));
        myTrain.printTrainManifest();
    }
}


/**
 * NOTES TO ME
 * final "implements£ a has-a relationship
 * Could have a board car. Try to board a car, if full, move down
 * Function to test the code:
 *     public static void main(String[] args) {
        Train myTrain = new Train(FuelType.ELECTRIC, 100.0, 5, 2);
        Passenger p1 = new Passenger("Chioma");
        p1.boardCar(myTrain.getCar(0));
        myTrain.printTrainManifest();
    }
 */
