package lesson5_2;

import java.util.ArrayList;

public class Supplier extends Thread{

    ArrayList<Ball> buffer;

    Supplier(ArrayList<Ball> buffer){
        this.buffer = buffer;
    }

    public void run() {

        while (!isInterrupted()) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                break;
            }
            if(buffer.size() < 5) {
                Ball ball = randomBall();
                buffer.add(ball);
                System.out.println("Мяч поступил: "+ball.info());
            }
        }
    }

    private Ball randomBall() {
        String[] colors = new String[] {"black", "white", "red", "yellow", "purple"};

        String color = colors[(int) (Math.random()*5)];
        int price = 1 + (int) (Math.random() * 9);
        int size = 1 + (int) (Math.random()*4);
        BallBuilderImpl ball = new BallBuilderImpl();
        return ball.color(color).price(price).size(size).build();
    }
}
