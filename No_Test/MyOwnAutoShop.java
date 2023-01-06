public class MyOwnAutoShop {
    public static void main(String[] args) {
       
        Car car =  new Car();
        car.setColor("Blue");
        car.setRegulaPrice(350000.00);
        car.setSpeed(350);
        System.out.println("The price of Car is "+ car.getSalePrice());
        System.out.println("And the Specs are ;"+car.toString());
        
        Sedan sedan = new Sedan();
        sedan.setSpeed(310);
        sedan.setRegulaPrice(25000.00);
        sedan.setColor("Brown");
        System.out.println("The price of Sedan is "+ sedan.getSalePrice());
        System.out.println("And the Specs are ;"+sedan.toString());

        Ford ford =  new Ford();
        ford.setSpeed(270);
        ford.setRegulaPrice(265000.00);
        ford.setColor("Green");
        System.out.println("The price of Ford is "+ ford.getSalePrice());
        System.out.println("And the Specs are ;"+ford.toString());

        Ford ford2 =  new Ford();
        ford2.setSpeed(350);
        ford2.setRegulaPrice(280000);
        ford2.setColor("Maroon");
        System.out.println("The price of Ford 2 is "+ ford2.getSalePrice());
        System.out.println("And the Specs are ;"+ford2.toString());

        Truck truck =  new Truck();
        System.out.println("The price of Truck is "+ truck.getSalePrice());
        System.out.println("And the Specs are ;"+truck.toString());


    }
}
