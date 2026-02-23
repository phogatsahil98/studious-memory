package Challange_2.MultithreadingChallenge;

public class ThreadNumber extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%s | Number : %d \n", Thread.currentThread().getName(), i);
        }
    }

    static void main(String[] args) {
        ThreadNumber t1 = new ThreadNumber();
        ThreadNumber t2 = new ThreadNumber();
        ThreadNumber t3 = new ThreadNumber();
        ThreadNumber t4 = new ThreadNumber();

        t3.start();
        t2.start();
        t1.start();
        t4.start();
    }
}
