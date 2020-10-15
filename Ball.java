package lesson5_2;

public class Ball {
    private int size;
    private String color;
    private int price;

    public void setSize(int size){
        this.size = size;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String info(){
        return "Size "+size+", Color "+color+", Price "+price;
    }
}
