package lesson5_2;

import java.util.*;

public class Customer extends Thread{
    ArrayList<Ball> buffer;

    Customer(ArrayList<Ball> buffer){
        this.buffer = buffer;
    }

    public void run(){
        while(!isInterrupted()){
            try {
                sleep((long) ((1 + (int) (Math.random() * 9))*100));
            } catch (InterruptedException e) {
                break;
            }
            try {
                Ball ball = buffer.remove(0);
                System.out.println("Мяч куплен: "+ball.info());
            } catch (NoSuchElementException|IndexOutOfBoundsException e){
                System.out.println("Мячей нет");
            }
        }
    }

}
