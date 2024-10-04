package behavioral_patterns.command_pattern.command_approach;

import behavioral_patterns.command_pattern.command_approach.rooms.LivingRoom;

public class HomeApp {
    public static void main(String[] args){
        Room livingRoom = new LivingRoom();
        livingRoom.setCommand(new SwitchLightsCommand(new Light()));
        livingRoom.executeCommand();
    }
}
