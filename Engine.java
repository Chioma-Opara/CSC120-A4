public class Engine {
    /**
     * Engine class creates an engine to be used in the train
     */
    private FuelType f;
    private double currentFuel;
    private double maxFuel;

    /**
     * This is the contructor for the Engine class
     * @param f
     * @param fuel
     */
    public Engine(FuelType f, double fuel){
        this.f = f;
        this.currentFuel = fuel;
        this.maxFuel = fuel;
    }

    /**
     * Getter for fuel type
     * @return the fuel type of the engine
     */
    public FuelType getFuelType(){
        return this.f;
    }

    /**
     * Getter for current fuel level
     * @return the current fuel level of the engine
     */
    public double getCurrentFuel(){
        return this.currentFuel;
    }

     /**
     * Setter for current fuel level
     * @param newFuellevel new current fuel level of the engine
     */
    public void setcurrentFuel(double newFuelLevel){
        this.currentFuel = newFuelLevel;
    }

    /**
     * Getter for maximum fuel level
     * @return the maximum fuel level of the engine
     */
    public double getmaxFuel(){
        return this.maxFuel;
    }

    /**
     * Determines if the engine has enough fuel to power the train
     * @return true if the engine has enough fuel and false if not
     */
    public boolean go(){
        if (this.currentFuel > 5){
            setcurrentFuel(currentFuel - 5);
            System.out.print.ln("Your current fuel level is: ", this.currentFuel);
            return true;
        }
        else if (this.currentFuel > 0 && this.currentFuel <= 5){
            setcurrentFuel(currentFuel - 1);
            System.out.print.ln("You are running low on fuel! Your current fuel level is: ", this.currentFuel);
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Resets the current fuel to the maximum fuel level
     */
    public void refuel(){
        setcurrentFuel(this.maxFuel);
    }
}

/**
 * NOTES TO ME
 * Constructors usually have the same name as the class
 */
