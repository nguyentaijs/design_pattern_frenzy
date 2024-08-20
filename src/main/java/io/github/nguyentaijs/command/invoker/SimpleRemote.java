package io.github.nguyentaijs.command.invoker;


import io.github.nguyentaijs.command.command.Command;
import io.github.nguyentaijs.command.command.NoCommand;

public class SimpleRemote implements Remote {

	private Command[] onCommands;
	private Command[] offCommands;
	private Command lastCommand;

	public SimpleRemote() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		for (int i = 0; i < onCommands.length; i++) {
			onCommands[i] = new NoCommand();
			offCommands[i] = new NoCommand();
		}
		lastCommand = new NoCommand();
	}

	@Override
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	@Override
	public void onButtonClicked(int slot) {
		onCommands[slot].execute();
		lastCommand = onCommands[slot];
	}

	@Override
	public void offButtonClicked(int slot) {
		offCommands[slot].execute();
		lastCommand = offCommands[slot];
	}

	@Override
	public void undo() {
		System.out.println("Undo the last action");
		lastCommand.undo();
	}

}
