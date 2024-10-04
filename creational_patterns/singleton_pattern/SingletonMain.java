package creational_patterns.singleton_pattern;

public class SingletonMain {
    public static void main(String[] arg){
        // simple Singleton instance that is not thread safe
        SimpleSingleton simpleSingleton = SimpleSingleton.getInstance("Ahmed");
        double sum = simpleSingleton.addTwoNumbers(5, 10);
        System.out.println(sum);

        // a more complex singleton that is thread safe
        SingletonClass instance = SingletonClass.getInstance();
        instance.setCount(10);
        instance.printCount();

        // using enum to implement the singleton pattern which is also thread safe
        EnumSingleton enumInstance = EnumSingleton.INSTANCE;
        enumInstance.setCount(10);
        enumInstance.printCount();
    }
}
