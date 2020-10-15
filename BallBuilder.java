package lesson5_2;

public interface BallBuilder {

    public Ball build();
    public BallBuilder size(int size);
    public BallBuilder color(String color);
    public BallBuilder price(int price);


}
