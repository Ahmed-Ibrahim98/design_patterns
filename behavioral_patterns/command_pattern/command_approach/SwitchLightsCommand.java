package behavioral_patterns.command_pattern.command_approach;

public class SwitchLightsCommand implements Command{
    private Light light;
    public SwitchLightsCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        light.switchLights();
    }
}
