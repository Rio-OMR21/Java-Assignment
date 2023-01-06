public class Sedan extends Car {
    private int length;

    public Sedan(){
        super();
        length= 21;
    }

    public Sedan(int length) {
        this.length = length;
    }

    public Sedan(int speed, double regulaPrice, String color, int length) {
        super(speed, regulaPrice, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Sedan [length=" + length + " feet]";
    }
    
    public double getSalePrice(){
        if (length > 20) {
            return getRegulaPrice() - (0.05*getRegulaPrice());
        } else {
            return getRegulaPrice() - (0.1*getRegulaPrice());
        }
    }
}