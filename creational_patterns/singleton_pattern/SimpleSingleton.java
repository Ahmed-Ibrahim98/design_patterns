package creational_patterns.singleton_pattern;

public class SimpleSingleton {
    private static SimpleSingleton instance;
    private String data;

    private SimpleSingleton(String data){
        this.data = data;
    }

    public static SimpleSingleton getInstance(String data){
        if(instance == null){
            instance = new SimpleSingleton(data);
        }
        return instance;
    }
    public double addTwoNumbers(double x, double y){
        return x + y;
    }
}
