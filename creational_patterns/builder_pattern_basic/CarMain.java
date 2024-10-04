package creational_patterns.builder_pattern_basic;

public class CarMain {
    public static void main(String[] arg){
        CarBuilder builder = new CarBuilder();
        builder.id(3232)
                .brand("Bugatti")
                .model("Chiron")
                .color("Blue");
        Car car = builder.build();
        System.out.println(car.getBrand());
    }
}
