package io.github.nguyentaijs.command.command;


import io.github.nguyentaijs.command.receiver.Light;

public class LightOnCommand implements Command {

	private Light light;

	private LightOnCommand() {
	}

	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public void undo() {
		light.off();
	}
	
}
