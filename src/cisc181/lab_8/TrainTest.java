package cisc181.lab_8;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrainTest {

    @Test
    public void test_TrainCar() {
        System.out.println("Testing TrainCar");
        TrainCar trainCar = new TrainCar("bananas");
        assertEquals(trainCar.getCargo(),"bananas");
        trainCar.setCargo("apples");
        assertEquals(trainCar.getCargo(),"apples");
    }

    @Test
    public void test_Train() {

        System.out.println("Testing Train");

        Train cargoTrain = new Train();

        cargoTrain.attachAtFront("coal");
        assertEquals(cargoTrain.getHeadCargo().equals("coal"),true);

        cargoTrain.attachAtFront("bananas");
        assertEquals(cargoTrain.getHeadCargo().equals("bananas"),true);

        cargoTrain.attachAtEnd("lumber");
        cargoTrain.attachAtEnd("apples");


        assertEquals(cargoTrain.getTrain().get(2).getCargo(), "lumber" );
        assertEquals(cargoTrain.getTrain().get(3).getCargo(), "apples" );

        assertEquals(cargoTrain.removeFromFront().equals("bananas"),true);
        assertEquals(cargoTrain.removeFromFront().equals("coal"),true);

        assertEquals(cargoTrain.removeFromEnd().equals("apples"),true);
        assertEquals(cargoTrain.removeFromEnd().equals("lumber"),true);

        // Train List is empty so if they fail you need to check for an empty list in your
        // remove methods
        assertNull(cargoTrain.removeFromFront());
        assertNull(cargoTrain.removeFromEnd());
        assertNull(cargoTrain.getHeadCargo());

        // add more TrainCars to your Train and  add Test cases to remove them
        cargoTrain.attachAtFront("tea");
        cargoTrain.attachAtFront("water");
        assertEquals(cargoTrain.removeFromEnd().equals("tea"),true);
        assertEquals(cargoTrain.removeFromEnd().equals("water"), true);
        assertNull(cargoTrain.removeFromFront());
        assertNull(cargoTrain.removeFromEnd());
        assertNull(cargoTrain.getHeadCargo());
        cargoTrain.attachAtEnd("love");
        assertEquals(cargoTrain.getHeadCargo().equals("love"),true);
        assertEquals(cargoTrain.removeFromFront().equals("love"),true);


    }

}