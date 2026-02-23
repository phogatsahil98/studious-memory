package Challange_2.MultithreadingChallenge;

    class TrafficLight extends Thread {

        private final TrafficController controller;
        private final String signal;
        private final int duration;

        public TrafficLight(TrafficController controller, String signal, int duration) {
            this.controller = controller;
            this.signal = signal;
            this.duration = duration;
        }

        @Override
        public void run() {
            while (true) {
                controller.showSignal(signal, duration);
            }
        }
    }
