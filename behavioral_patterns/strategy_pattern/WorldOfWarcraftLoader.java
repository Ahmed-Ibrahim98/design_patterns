package behavioral_patterns.strategy_pattern;

public class WorldOfWarcraftLoader extends BaseGameLoader {
    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading WOW Files...");
        // Some World OF Warcraft Code...
        return new byte[0];
    }

    @Override
    public void createObjects(byte[] data) {
        System.out.println("Creating WOW Objects...");
        // Some World OF Warcraft Code...
    }

    @Override
    public void downloadAdditionalFiles() {
        System.out.println("Downloading WOW Sounds...");
        // Some World OF Warcraft Code...
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading WOW Profiles...");
        // Some World OF Warcraft Code...
    }
}
