package behavioral_patterns.command_pattern.traditional_approach;

public class Room {
    private Light light;

    public Room(){
        this.light = new Light();
    }

    public void switchLights(){
        light.setSwitchedOn(!light.isSwitchedOn());
    }
}
