package structural_patterns.adapter_pattern;

public class FancyUIServiceAdapter implements IMultiRestoApp{
    private final FancyUIService fancyUIService;

    public FancyUIServiceAdapter(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayMenus(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenus(jsonData);
    }

    @Override
    public void displayRecommendations(XmlData xmlData) {
        JsonData jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private JsonData convertXmlToJson(XmlData xmlData){
        // Convert XML Data to JSON Data and return it
        // this is just dummy code don't take it seriously
        return new JsonData();
    }
}
