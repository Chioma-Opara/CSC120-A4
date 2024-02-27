public class Passenger {
    
    private String name;

    /**
     * The constructor for the Passenger class.
     * @param name
     */
    public Passenger(String name) {
        this.name = name;
    }
    
    /**
     * Getter for name
     * @return the name of the passenger
     */
    public String getName(){
        return this.name;
    }

    /** 
     * Allows a passenger board a car if the car permits it
     * @ param c the car to be boarded
    */
    public void boardCar(Car c){
       if (c.addPassenger(this) == false){
        System.out.println("This car is full");
       }
       else{
        System.out.println("Passenger has successfully boarded");
       }
    }

    /**
     * Allows a passenger leave a car if the passenger was previously aboard
     * @param c the car to be alighted from
     */
    public void getOffCar(Car c){
        if (c.removePassenger(this) == false){
         System.out.println("This passenger is currently not in this car");
        }
        else{
         System.out.println("Passenger has successfully alighted");
        }
     }


}

/**
 * NOTES TO ME
 * Test function for this class:
 *  // public static void main(String[] args) {
    //     Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
    //     Car c = new Car(10);
    //     Passenger p = new Passenger("Chioma");
    //     Passenger p2 = new Passenger("John");
    //     Passenger p3 = new Passenger("Mary");
    //     p.boardCar(c);
    //     p2.boardCar(c);
    //     p3.boardCar(c);
    //     c.printManifest();
    //     System.out.println(c.seatsRemaining());
    //     p.getOffCar(c);
    //     c.printManifest();
    // }
 */