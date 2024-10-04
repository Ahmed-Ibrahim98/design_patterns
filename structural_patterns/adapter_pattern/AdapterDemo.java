package structural_patterns.adapter_pattern;

public class AdapterDemo {
    public static void main(String[] args) {

        // Old UI
        IMultiRestoApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenus(new XmlData());

        // New UI
        FancyUIServiceAdapter adapter = new FancyUIServiceAdapter(new FancyUIService());
        adapter.displayMenus(new XmlData());
    }
}
