package lesson5_2;

public class BallBuilderImpl implements BallBuilder{

    private Ball ball;

    BallBuilderImpl(){
        ball = new Ball();
    }

    public Ball build(){
        return ball;
    }

    public BallBuilder size(int size){
        ball.setSize(size);
        return this;
    }

    public BallBuilder color(String color){
        ball.setColor(color);
        return this;
    }

    public BallBuilder price(int price){
        ball.setPrice(price);
        return this;
    }

}
