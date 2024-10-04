package behavioral_patterns.strategy_pattern;

public abstract class BaseGameLoader {

    // Some Methods Are Abstract Because They Have Different Implementations For Different Objects
    public abstract byte[] loadLocalData();
    public abstract void createObjects(byte[] data);
    public abstract void downloadAdditionalFiles();
    public abstract void initializeProfiles();

    // While Some Are Implemented Here Within This Super Class Since They Are The Same For All Objects
    protected void cleanTempFiles(){
        System.out.println("Cleaning Temporary Files...");
        // Some Cleaning Code Here...
    }
}
