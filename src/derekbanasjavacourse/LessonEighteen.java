package derekbanasjavacourse;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit.*;

import static java.util.concurrent.TimeUnit.SECONDS;


public class LessonEighteen {

    public static void main(String[] args) {

        addThreadsToPool();

    }

    public static void addThreadsToPool() {

        ScheduledThreadPoolExecutor eventPool = new ScheduledThreadPoolExecutor(5);

        eventPool.scheduleAtFixedRate(new CheckSystemTime(), 0, 2, SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Mail"), 5, 5, SECONDS);
        eventPool.scheduleAtFixedRate(new PerformSystemCheck("Calendar"), 10, 10, SECONDS);

        System.out.println("Number of Threads: " + Thread.activeCount());

        Thread[] listOfThreads = new Thread[Thread.activeCount()];

        Thread.enumerate(listOfThreads);
        for (Thread i : listOfThreads) {
            System.out.println(i.getName());
        }

    }

}
