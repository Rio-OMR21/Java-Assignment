public class Ford extends Car {
    private int year;
    private double manufactureDiscount;

    public Ford(){
        super();
        year = 2020;
        manufactureDiscount = 8000.00;
    }


    public Ford(int year) {
        this.year = year;
    }


    public Ford(double manufactureDiscount) {
        this.manufactureDiscount = manufactureDiscount;
    }


    public Ford(int speed, double regulaPrice, String color, int year, int manufactureDiscount) {
        super(speed, regulaPrice, color);
        this.year = year;
        this.manufactureDiscount = manufactureDiscount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufactureDiscount() {
        return (int) manufactureDiscount;
    }

    public void setManufactureDiscount(int manufactureDiscount) {
        this.manufactureDiscount = manufactureDiscount;
    }

    @Override
    public String toString() {
        return "Ford [year=" + year + ", manufactureDiscount=" + manufactureDiscount + "]";
    }

    public double getSalePrice(){
        return getRegulaPrice() - manufactureDiscount;
    }
}
