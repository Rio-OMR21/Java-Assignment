public class Car{
    private int speed;
    private double regulaPrice;
    private String color;

    public Car(){
        speed = 200;
        regulaPrice = 150000.00;
        color = "Red";
    }

    public double getSalePrice() {
        return regulaPrice;
    }


    public Car(int speed, double regulaPrice, String color) {
        this.speed = speed;
        this.regulaPrice = regulaPrice;
        this.color = color;
    }

    public Car(int speed) {
        this.speed = speed;
    }

    public Car(double regulaPrice) {
        this.regulaPrice = regulaPrice;
    }

    public Car(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegulaPrice() {
        return regulaPrice;
    }

    public void setRegulaPrice(double regulaPrice) {
        this.regulaPrice = regulaPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car [speed=" + speed +"Km/h" + ", regulaPrice=" + regulaPrice + ", color=" + color + "]";
    }

    
   



}  
    