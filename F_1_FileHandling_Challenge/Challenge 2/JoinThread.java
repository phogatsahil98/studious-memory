package Challange_2.MultithreadingChallenge;

import java.sql.SQLOutput;

public class JoinThread implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%s | Digit : %d\n",Thread.currentThread().getName(), i);
        }
    }

    static void main(String[] args) throws InterruptedException {

        long StartTime = System.currentTimeMillis();
        long StartTime1 = System.currentTimeMillis();
        System.out.println("Before Creating New Thread Current Time : "+(StartTime1 - StartTime));
        JoinThread jt1 = new JoinThread();
        JoinThread jt2 = new JoinThread();
        JoinThread jt3 = new JoinThread();


     Thread t1 = new Thread(jt1);
     t1.start();
     t1.join();
    long StartTimeAfter1 = System.currentTimeMillis();
    System.out.println("Time Taken by Thread T1 : "+(StartTimeAfter1 - StartTime));


     Thread t2 = new Thread(jt2);
     t2.start();
     t2.join();
     long StartTimeAfter2 = System.currentTimeMillis();
     System.out.println("Time Taken by Thread T2 : "+(StartTimeAfter2 - StartTime));

     Thread t3 = new Thread(jt3);
     t3.start();
     t3.join();
     long StartTimeAfter3 = System.currentTimeMillis();
     System.out.println("Time Taken by Thread T3 : "+(StartTimeAfter3 - StartTime));
    }
}
