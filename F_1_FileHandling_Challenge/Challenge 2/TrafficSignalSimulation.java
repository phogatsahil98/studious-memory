package Challange_2.MultithreadingChallenge;

public class TrafficSignalSimulation {

    public static void main(String[] args) {

        TrafficController controller = new TrafficController();

        new TrafficLight(controller, "RED", 3000).start();
        new TrafficLight(controller, "YELLOW", 1500).start();
        new TrafficLight(controller, "GREEN", 3000).start();
    }
}
