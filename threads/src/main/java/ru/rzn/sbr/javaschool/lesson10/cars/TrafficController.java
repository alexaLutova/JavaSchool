package ru.rzn.sbr.javaschool.lesson10.cars;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TrafficController {
   private Lock lock=new ReentrantLock();

    public void enterLeft() {
        lock.lock();
        System.out.println("enterLeft");
    }

    public void enterRight() {
        lock.lock();
        System.out.println("enterRight");
    }

    public void leaveLeft() {
        lock.unlock();
        System.out.println("leaveLeft");
    }

    public void leaveRight() {
        lock.unlock();
        System.out.println("leaveRight");
    }
}