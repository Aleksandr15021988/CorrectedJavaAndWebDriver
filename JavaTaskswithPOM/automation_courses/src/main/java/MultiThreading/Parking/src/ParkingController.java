import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

public class ParkingController {
    Lock lock = new ReentrantLock();
   // Semaphore semaphore = new Semaphore(5, true);
    int WaitingTime=4000;
    boolean flag[] = new boolean[5];
    boolean runing;
    void ControlPlaces(String names[]) throws InterruptedException {//semaphore.acquire();
        runing= lock.tryLock(WaitingTime, MILLISECONDS);
        if (runing) {
            try {
                for (int i = 0; i < names.length; i++)
               if (!flag[i]) {
                   flag[i] = true;
                   System.out.println(Thread.currentThread().getName() + " припарковался на" +
                           names[i]);
                   MILLISECONDS.sleep(WaitingTime/5);
                   break;
               }
            }finally{
                lock.unlock();
               }
        }else
            System.out.println(Thread.currentThread().getName()+" уехал на другую стоянку");






   }

        }





