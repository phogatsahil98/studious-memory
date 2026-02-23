package Challange_2.MultithreadingChallenge;

    public class ThreadState {

        public static void main(String[] args) throws InterruptedException {

            // Step 1: Create thread (NEW state)
            Thread worker = new Thread(() -> {
                try {
                    // Simulate long-running task
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });

            // CREATION
            System.out.println("After creation  : " + worker.getState());

            // Step 2: Start thread
            worker.start();

            // STARTING / RUNNABLE
            System.out.println("After start     : " + worker.getState());

            // While thread is sleeping
            Thread.sleep(500);
            System.out.println("During sleep    : " + worker.getState());

            // Step 3: Wait for thread to finish
            worker.join();

            // TERMINATION
            System.out.println("After termination: " + worker.getState());
        }
    }

