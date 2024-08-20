package io.github.nguyentaijs.command.Client;

import io.github.nguyentaijs.command.command.*;
import io.github.nguyentaijs.command.invoker.Remote;
import io.github.nguyentaijs.command.invoker.SimpleRemote;
import io.github.nguyentaijs.command.receiver.CeilingFan;
import io.github.nguyentaijs.command.receiver.Light;

public class SmartHome {

    public static void main(String[] args) {
        Light livingRoomLight = new Light("Living room");
        LightOnCommand lightOnCommand = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOffCommand = new LightOffCommand(livingRoomLight);

        Light kitchenLight = new Light("Kitchen");
        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        CeilingFan ceilingFan = new CeilingFan();
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLowCommand = new CeilingFanLowCommand(ceilingFan);
        CeilingFanMaxCommand ceilingFanMaxCommand = new CeilingFanMaxCommand(ceilingFan);

        Command[] onCommands = new Command[]{lightOnCommand, kitchenLightOnCommand, ceilingFanMaxCommand};
        MacroCommand onMacroCommand = new MacroCommand(onCommands);
        Command[] offCommands = new Command[]{lightOffCommand, kitchenLightOffCommand, ceilingFanLowCommand};
        MacroCommand offMacroCommand = new MacroCommand(offCommands);

        Remote simpleRemote = new SimpleRemote();
        simpleRemote.setCommand(0, lightOnCommand, lightOffCommand);
        simpleRemote.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        simpleRemote.setCommand(2, ceilingFanHighCommand, ceilingFanLowCommand);
        simpleRemote.setCommand(3, onMacroCommand, offMacroCommand);

        simpleRemote.onButtonClicked(0);
        simpleRemote.offButtonClicked(0);

        simpleRemote.onButtonClicked(1);
        simpleRemote.offButtonClicked(1);

        simpleRemote.onButtonClicked(2);
        simpleRemote.offButtonClicked(2);
        simpleRemote.offButtonClicked(2);
        simpleRemote.onButtonClicked(2);
        simpleRemote.onButtonClicked(2);
        simpleRemote.onButtonClicked(2);
        simpleRemote.onButtonClicked(2);
        simpleRemote.onButtonClicked(2);
        simpleRemote.onButtonClicked(2);
        simpleRemote.onButtonClicked(2);
        simpleRemote.onButtonClicked(2);

        // Undo
        simpleRemote.undo();

        simpleRemote.onButtonClicked(1);
        simpleRemote.undo();

        // Macro command
        simpleRemote.onButtonClicked(3);
    }

}
