package io.github.nguyentaijs.command.command;

public class NoCommand implements Command {

	@Override
	public void execute() {
		System.out.println("No function is assigned");
	}

	@Override
	public void undo() {
		System.out.println("No function is assigned");
	}

	
}
