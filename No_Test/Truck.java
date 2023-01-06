public class Truck extends Car {
    private int weight;
    
    public Truck(){
        super();
        weight = 2100;
    }


    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(int speed, double regulaPrice, String color, int weight) {
        super(speed, regulaPrice, color);
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Truck [weight=" + weight + " Kgs]";
    }

    public double getSalePrice(){
        if (weight> 2000) {
            return getRegulaPrice() - (0.1*getRegulaPrice());
        } else {
            return getRegulaPrice() - (0.2*getRegulaPrice());
        }
    }


    public int getWeight() {
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

}
