package cisc181.lab_8;

/**
 * a class TrainCar for linklist
 */
public class TrainCar {
    private String cargo;

    /**
     * constructor to set cargo
     * @param cargo what the train load
     */
    public TrainCar(String cargo) {
        this.cargo = cargo;
    }

    /**
     * getter method to get the cargo
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * setter method to set the cargo
     * @param cargo what the train load
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * override toString to get cargo
     * @return the cargo
     */
    @Override
    public String toString() {
        return cargo;
    }

}
