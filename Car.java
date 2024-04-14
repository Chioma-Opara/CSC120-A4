import java.util.ArrayList;

public class Car {
    /**
     * Creates the train's cars
     */
    private int maxCapacity;
    private ArrayList<Passenger> passengers;

    /**
     * Constructor for the Car class. The maxCapacity limits the size of the arrayList storing passengers
     * @param maxCapacity
     */
    public Car(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.passengers = new ArrayList<Passenger>(this.maxCapacity);
    }

    /** 
     * Getter for the maximum capacity of a car
     * @ return the maximum capacity of the car
    */
    public int getCapacity(){
        return this.maxCapacity;
    }

    /**
     * Return the number of seats remaining in a car
     * @return the number of unoccupied seats on the car
     */
    public int seatsRemaining(){
        return this.maxCapacity - passengers.size();
    }

    /**
     * Determines if a passenger can board a car or not
     * @param p the passenger to be added to the car
     * @return whether or not the passenger could board to the car
     */
    public boolean addPassenger(Passenger p){
        if (seatsRemaining() > 0 && !this.passengers.contains(p)){
            this.passengers.add(p);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Allows a passenger to be removed from a car
     * @param p
     * @return whether or not the passenger was successfully removed frim the car
     */
    public boolean removePassenger(Passenger p){
        if (this.passengers.contains(p)){
            this.passengers.remove(p);
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Prints out a list of all passengers aboard a car
     */
    public void passengerList(){
        for (Passenger p: passengers){
            System.out.println("- " +p.getName());
        }
    }

    /** 
     * Prints a list of all passenger aboard a car with a header ("CAR'S MANIFEST") if the car is not empty 
    */
    public void printManifest(){
        if (passengers.isEmpty() == true){
            System.out.println("This car is EMPTY");
        }
        else {
            System.out.println("CAR'S MANIFEST:");
            passengerList();
        }
    }
}

/**NOTES TO ME
* ArrayList passengers should be private. The printManifest method is sort of it's getter I presume.
*/

