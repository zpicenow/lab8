package cisc181.lab_8;

import java.util.LinkedList;

/**
 * a class for train
 */
public class Train {
    private LinkedList<TrainCar> trainList;

    /**
     * constructor which not accept param
     */
    public Train() {
        trainList = new LinkedList<>();

    }

    /**
     * getter method to get the linklist
     * @return linklist for trainList
     */
    public LinkedList<TrainCar> getTrain() {
        return trainList;
    }

    /**
     *  returns the cargo of the first train car and null if there are no train cars in the list.
     * @return the cargo of the first train car and null if there are no train cars in the list
     */
    public String getHeadCargo() {
        if (trainList.isEmpty()) {
            return null;
        } else {
            return trainList.get(0).getCargo();
        }
    }

    /**
     *  attaches a new TrainCar to the front of the trainList
     * @param cargo what the new trainCar will load
     */
    public void attachAtFront(String cargo) {
        TrainCar trainCar = new TrainCar(cargo);
        trainList.addFirst(trainCar);

    }

    /**
     * removes the first train car from the train and returns the cargo that it held
     * @return the cargo that it held
     */
    public String removeFromFront() {
        if (trainList.isEmpty()) {
            return null;

        } else {
            return trainList.removeFirst().getCargo();
        }
    }

    /**
     * attaches a new TrainCar to the end of the train
     * @param cargo what the new car load or null
     */
    public void attachAtEnd(String cargo) {
        TrainCar trainCar = new TrainCar(cargo);
        trainList.addLast(trainCar);

    }

    /**
     * removes the last train car from the train and returns the cargo that it held.
     * @return the cargo that it held or null
     */
    public String removeFromEnd() {
        if (trainList.isEmpty()) {
            return null;
        } else {
            return trainList.removeLast().getCargo();

        }
    }
}
