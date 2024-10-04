package behavioral_patterns.template_method_pattern;

public class DiabloLoader extends BaseGameLoader{
    @Override
    public byte[] loadLocalData() {
        System.out.println("Loading Diablo Files...");
        // Some Diablo Code...
        return new byte[0];
    }

    @Override
    public void createObjects(byte[] data) {
        System.out.println("Creating Diablo Objects...");
        // Some Diablo Code...
    }

    @Override
    public void downloadAdditionalFiles() {
        System.out.println("Downloading Diablo Sounds...");
        // Some Diablo Code...
    }

    @Override
    public void initializeProfiles() {
        System.out.println("Loading Diablo Profiles...");
        // Some Diablo Code...
    }
}
