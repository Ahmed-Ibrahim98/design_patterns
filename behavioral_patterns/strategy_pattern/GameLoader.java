package behavioral_patterns.strategy_pattern;

public class GameLoader {
    private BaseGameLoader baseGameLoader;

    public void load(){
        // Algorithm Steps Turned Into Methods Then Called in This Template Method
        byte[] data = baseGameLoader.loadLocalData();
        baseGameLoader.createObjects(data);
        baseGameLoader.downloadAdditionalFiles();
        baseGameLoader.cleanTempFiles();
        baseGameLoader.initializeProfiles();
    }

    public void setBaseGameLoader(BaseGameLoader baseGameLoader){
        this.baseGameLoader = baseGameLoader;
    }

    public static void main(String[] args){
        GameLoader gameLoader = new GameLoader();
        gameLoader.setBaseGameLoader(new DiabloLoader());
        gameLoader.load();
    }
}
