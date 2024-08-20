package io.github.nguyentaijs.command.command;

public class MacroCommand implements Command {
	private Command[] commands;

	private MacroCommand() {
		commands = new Command[1];
		commands[0] = new NoCommand();
	}

	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	@Override
	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

	@Override
	public void undo() {
		for (Command command : commands) {
			command.undo();
		}
	}
	
}
