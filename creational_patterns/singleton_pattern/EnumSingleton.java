package creational_patterns.singleton_pattern;

public enum EnumSingleton {
    INSTANCE;
    private int count;
    EnumSingleton(){}

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public void printCount(){
        System.out.println(count);
    }
}
