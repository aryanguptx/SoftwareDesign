import behaviours.RocketFly;
import models.MallardDuck;
import models.RubberDuck;
import templates.Duck;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world! I need to understand design patterns");

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();

        Duck rubberDuck = new RubberDuck();

        rubberDuck.performFly();
        rubberDuck.performQuack();

        rubberDuck.setFlyBehaviour(new RocketFly());
        rubberDuck.performFly();
    }

}