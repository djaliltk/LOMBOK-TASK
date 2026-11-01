public class CarDemoWithLombok {
    public static void main(String[] args) {
        CarWithLombok car1 = new CarWithLombok("GLE", "Mercedes", 2020, 350000, "white", 5);
        CarWithLombok car2 = new CarWithLombok("GLE", "Mercedes", 2020, 350000, "white", 5);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getColor());

        int year = car1.getYear();
        car1.setColor("black");
        car2.setColor("black");

        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The HashCode of this object is: " + car1.hashCode());
        System.out.println("The HashCode of this object is: " + car2.hashCode());
    }
}
