package Challange_2.MultithreadingChallenge;

class TrafficController {

    private String currentSignal = "RED";

    public synchronized void showSignal(String signal, int duration) {
        try {
            while (!currentSignal.equals(signal)) {
                wait();
            }

            System.out.println("🟢 ACTIVE SIGNAL : " + signal);
            Thread.sleep(duration);

            // Switch to next signal
            if (signal.equals("RED")) {
                currentSignal = "GREEN";
            } else if (signal.equals("GREEN")) {
                currentSignal = "YELLOW";
            } else {
                currentSignal = "RED";
            }

            notifyAll();

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
