package creational_patterns.singleton_pattern;
// note that you could use enum instead but enums don't extend other classes so keep that in mind
public class SingletonClass {
    private SingletonClass(){}
    private static volatile SingletonClass instance; // instance won't
    // reference a partially constructed SingletonClass class instance
    private int count;

    public static SingletonClass getInstance(){
        SingletonClass result = instance; // to avoid reading from the main memory every time
        if (result == null){ // double checking to reduce the overhead of using synchronized
            synchronized (SingletonClass.class){ // wait for one thread to finish this block of code
                result = instance; // first thread already initialized the instance so set
                // the result to that instance
                if (result == null) { // if the first thread already set the value of instance
                    // then the block won't execute and instead it will return reslut
                    instance = result = new SingletonClass();
                }
            }
        }
        return result;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public void printCount(){
        System.out.println(count);
    }
}
